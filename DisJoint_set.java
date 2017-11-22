
import java.util.*;


class DisjointSets {
	int numofelements;  // the total number of elements in all the disjoint sets
	private int[] parent; 
	private int[] weight;
	
	DisjointSets() { 
// DisjointSets constructor. 

	
	}

	public String toString() { // Show all the element in sequence
		String str = new String();
		str = "parent[] = - ";
		for(int i = 1; i <= numofelements; i++)
			str += parent[i] + " ";
		return str;
	}

	void InitSet(int n) { 
		// Initialize the array parent[] and weight[]
		numofelements = n; // the total number of node 
		parent = new int [numofelements+1];
    		for (int i = 0; i < parent.length; i++) {
      			parent[i] = 0;}
		weight = new int[numofelements+1];
		for(int j = 0; j<weight.length; j++){
			weight[j] = 1;}  
  }
	boolean Union(int a, int b) { 
	// Union the set that contains i and the set that contains j
	// the set that has larger weight is the new root of the unioned set
	// when the weights are the same, choose the root of smaller value
	// first find the root of i and j
		int a_root= SimpleFind(a);
		int b_root= SimpleFind(b);
	//union two set
	//small weight set becomes subtree
      		if (weight[a_root] < weight[b_root])
		{
          		 parent[a_root] = b_root;
			weight[b_root] += weight[a_root];
			weight[a_root] = 0;
		}       
		else if (weight[a_root] > weight[b_root])
		{       
		    	parent[b_root] = a_root;
			weight[a_root] += weight[b_root];
			weight[b_root] = 0;		
		}       
		else {
      
    		 
			if(a_root == b_root )
				return false;
			else if( a_root < b_root ) 
			{
				parent[a_root] = b_root;		
				weight[b_root] += weight[a_root];
				weight[a_root] = 0;	

			}
			else 
			{
				parent[b_root] = a_root;
				weight[a_root] += weight[b_root];
				weight[b_root] = 0;
			}				

}              
	
		
return true;
    }
		
	


	int SimpleFind(int k) { 
	// return the root node that contains the element i
		int root=k;
		
 		if (parent[root] != 0){
        			root = SimpleFind(parent[k]);
		}
		return root;
     }
}

