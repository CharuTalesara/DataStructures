/*
Finding kth smallest element in min heap.

*/


public class FindingKSmallest
{
	public static void main(String args[])
	{
		int a[]={4,1,3,2,16,9,10,14,8,7};
		
		print(a);

		//for(int i=0;i<a.length;i++)
		System.out.println("ith smallest element : "+kthsmallest(a,4));
	}

	public static int kthsmallest(int[] a,int k)
	{
		MinHeap heap=new MinHeap();
		heap=heap.build_min_heap(a);
		heap.printHeap();

		for(int i=0;i<k-1;i++)
		{
			heap.deleteMin();
			//heap.min_heapify(i);
		}

		return heap.getMin();
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
