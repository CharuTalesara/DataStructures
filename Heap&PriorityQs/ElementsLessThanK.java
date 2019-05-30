

public class ElementsLessThanK
{
	public static void main(String args[])
	{
		int b[]={4,1,3,2,16,9,10,14,8,7};

		MinHeap heap=new MinHeap();

		heap=heap.build_min_heap(b);
		heap.printHeap();

		eleLessThankK(heap,0,4);

	}

	public static void eleLessThankK(MinHeap heap,int i,int k)
	{
		if(i<0)
			return;
	
		if(heap.array[i]<k)
		{
			System.out.print(heap.array[i]+" ");
			eleLessThankK(heap,heap.leftChild(i),k);
			eleLessThankK(heap,heap.rightChild(i),k);
		}
	}
}
