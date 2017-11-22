
import java.util.*;


class Graph {
	int numofnodes;  // the number of nodes in the graph
	private int[][] CostAdj; // Adjacency matrix
	private int[][] C; // c matrix
	private int[][] kay; // kay matrix

	final int LargeCost = 999999;

	Graph() { 
		// Graph constructor. 
		numofnodes = 0;
	}

	int GetPathLength(int i, int j) { return C[i][j]; };

	void Init(int n) { 
		numofnodes = n;
		// now create 2 dimensional array of numofnodes * numofnodes
		CostAdj = new int[numofnodes][numofnodes];
		C = new int[numofnodes][numofnodes];
		kay = new int[numofnodes][numofnodes];

		for(int i = 0; i < numofnodes; i++) {
			// initialize all entries to 0
			for(int j = 0; j < numofnodes; j++)
				CostAdj[i][j] = LargeCost;  // initialize the adjacency matrix
				CostAdj[i][i] = 0;
			
		}
	}



	void Edge(int v1, int v2, int cost) { 
		//adds edge to the graph.
		CostAdj[v1][v2] = cost; 
	}

	void Floyd() {
	 	//after performing the algorithm, C store shortest path length from vertex i to vertex j , kay store Highest node number.
		for(int i=0; i<numofnodes; ++i){
			for(int j = 0; j<numofnodes; ++j){
					kay[i][j] = -1;				
					C[i][j] = CostAdj[i][j];
					}}	

		for(int k = 0; k<numofnodes; k++){
			for(int l = 0; l<numofnodes; l++){
				for(int s = 0; s<numofnodes; s++){
					if(C[l][s] > C[l][k] +C[k][s]){
						C[l][s] = C[l][k] + C[k][s];
						kay[l][s] = k;
}}}}
}

	void outputPath(int a, int b) { 
	 
		if(a==b)
			return;
		else{
			if(power[a][b]==-1)
				{System.out.print("-"+ b);}
			else{
				outputPath(a,kay[a][b]);
				outputPath(kay[a][b],b);}}
}

}
