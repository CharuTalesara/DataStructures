


public class MinInMaxHeap
{
	public static void main(String args[])
	{
		int b[]={4,1,3,2,16,9,10,14,8,7};

		Heap heap=new Heap();

		heap=heap.build_max_heap(b);

		System.out.println("Min "+findMinInMaxHeap(heap));

	}

	public static int findMinInMaxHeap(Heap heap)
	{
		int leaves=heap.count/2;
		int min=heap.array[leaves];		

		for(int i=leaves;i<heap.count;i++)
		{
			if(min>heap.array[i])
				min=heap.array[i];
		}
		
		return min;
	}
}
