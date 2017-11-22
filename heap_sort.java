import java.util.*;

class HeapSort {
	int [] heap;	// Heap Array
	int Size;	// number of elements in the Heap
	int capacity;	// Array size

	HeapSort(int cap) {

		capacity = cap;
		heap = new int[capacity + 1];
		Size = 0;
	}


	public String toString() { 
		// Convert heap array into a string
		String str;
		str = "Heap : - ";

		for(int i = 1; i <= Size; i++)
			str +=  heap[i] + "  ";

		return str; 
		
	}

	void  Init(int [] es, int n) {	
		// fill the heap array by the input
		// we need to create heap structure when we call Sort()
		Size = n;
		for(int i = 1; i <= n; i++)
			heap[i] = es[i];
		
	}

	void  Adjust(int root, int n) {	
		// adjust binary tree with root "root" to satisfy heap property.
		// The left and right subtrees of "root" already satisfy the heap
		// property. No node index is > n.
		int l = 2*root;
		if(l<n+1){
			int r = l+1;
			if(r<=n && (heap[r]>heap[l]))
				{l = r;}
		 	if(heap[root] <heap[l]){
				int k1 = heap[root];
				heap[root] = heap[l];
				heap[l] = k1;
				Adjust(l,n);}}}
	void  Sort() {	
		// sort heap[1:n] into nondecreasing ord
		//first perform the initialization
		//whenever the maximum value move to the end of the heap array. prints the current heap state.
		if(Size%2 == 0){	
			for(int root = Size/2-1; root>0; root--)
				Adjust(root,Size);
				System.out.println(this);
			for(int a = Size; a>1;){
				int k2 = heap[a];
				heap[a] = heap[1];
				heap[1] = k2;
				a--;
				Adjust(1,a);
				System.out.println(this);}}
		else{
			for(int root = Size/2; root>0; root--)
				Adjust(root,Size);
				System.out.println(this);
			for(int a = Size; a>1;){
				int k2 = heap[a];
				heap[a] = heap[1];
				heap[1] = k2;
				a--;
				Adjust(1,a);
				System.out.println(this);}}

}}
