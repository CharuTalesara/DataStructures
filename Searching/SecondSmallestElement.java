

public class SecondSmallestElement
{
	public static void main(String args[])
	{
		int[] a={34,8,10,3,2,80,30,33,1};
		print(a);

		System.out.println("Second smallest ele : "+secondsmallest(a));
	}

  	// O(logn)	
	public static int secondsmallest(int[] a)
	{
		MinHeap heap1=new MinHeap();
		MinHeap heap=heap1.build_min_heap(a);
		heap.deleteMin();

		return heap.getMin();
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
