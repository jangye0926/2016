import java.util.*;


@SuppressWarnings("unchecked")
class BST<T extends KeyValue> {

	class TreeNode <U extends KeyValue> {
		U data;	// storage for data : in HW 3, T will be Item
		TreeNode<U> leftChild;	// link to the left Child
		TreeNode<U> rightChild;	// link to the right Child
		
		// constructors come here
		TreeNode() {
			leftChild = rightChild = null;
			
		}
		TreeNode(U d) {
			// data is given
			data = d;
			// the leftChild and rightChild field are null
			leftChild = rightChild = null;
		
		}
	}

	TreeNode <T> root;// the reference to the root node
	
	BST() { 
		// BST constructor. 
		root = null;
	}

	void  Show()  {
		System.out.print("Pre  Order : ");
		PreOrder(root);
		System.out.println("");
		System.out.print("In   Order : ");
		InOrder(root);
		System.out.println("");
		System.out.print("Post Order : ");
		PostOrder(root);
		System.out.println("");
		System.out.print("Count      : ");
		System.out.print( Count(root));
		System.out.println("");
		System.out.print("Height      : ");
		System.out.println( Height(root));
		System.out.println("");
	}

	boolean  Insert(T item)  {
		// first search the key
		//node insertion function
		if(root == null) {
			root = new TreeNode<T>(item);
			return true;
		}
	
		TreeNode<T> a;
		a = root;		
			while(true){
				if(a.data.GetKey() == item.GetKey()) //search  
					{a.data = item;      //update 
					return false;}
				else if(a.data.GetKey() > item.GetKey()){
					if(a.leftChild != null)
						a = a.leftChild;
					else {
						a.leftChild = new TreeNode<T>(item);
						break;}}
				else{
					if(a.rightChild != null)
						a = a.rightChild;
					else{
						a.rightChild = new TreeNode<T>(item);
						break;}}
		}
	 return true;			
	}
	T Get(T item) {
		// use the key field of item and find the node
		// do not use val field of item
		TreeNode<T> ptr;
		ptr = root;
		while(true) {
					if(ptr == null)
						{return null;}
					if(ptr.data.GetKey() == item.GetKey()){
						return ptr.data;}						
					else if(ptr.data.GetKey() > item.GetKey())
						{ptr = ptr.leftChild;}
					else
						{ptr= ptr.rightChild;}
				
					} 


	}



	void  PreOrder(TreeNode<T> t)  {

		if(t == null){return;}
		else{
			System.out.printf("%d(%c)",t.data.GetKey(),t.data.GetValue());
			System.out.print(" ");
			PreOrder(t.leftChild);
			PreOrder(t.rightChild);
}
}	

	void  InOrder(TreeNode<T> t)  {
		if(t == null){return;}
		else{
			InOrder(t.leftChild);
			System.out.printf("%d(%c)",t.data.GetKey(),t.data.GetValue());
			System.out.print(" ");	
			InOrder(t.rightChild);
		
}
	}

	void  PostOrder(TreeNode<T> t)  {
		if(t == null){return;}
		else{
			PostOrder(t.leftChild);
			PostOrder(t.rightChild);
			System.out.printf("%d(%c)",t.data.GetKey(),t.data.GetValue());
			System.out.print(" ");	
}
	}

	int  Count(TreeNode<T> t)  { //return number of node
		if(t == null){return 0;}
		else{
			return Count(t.leftChild) + Count(t.rightChild) +1;}

	}

	int  Height(TreeNode<T> t)  { //return height
		if(t == null){return 0;}
		else{
			int RH = Height(t.rightChild);
			int LH = Height(t.leftChild);

			if(LH > RH){//compare
				return LH +1;}
			else
				return RH +1;}}}
