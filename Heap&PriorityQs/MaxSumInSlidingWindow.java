



public class MaxSumInSlidingWindow
{
	public static void main(String args[])
	{
		int[] a={100,3,-1,-3,5,3,6,7};
				
		
		maxInSlidingWindow(a,3);
	}


	public static void maxInSlidingWindow(int[] a,int w)
	{
		Heap heap=new Heap();
		
		for(int i=0;i<a.length;i++)
		{
			if(i<w)
			{
				heap.insert(a[i]);
				if(i==w-1)
				{
					heap.printHeap();
					System.out.println("Max in Heap : "+heap.getMax());
				}
			}
			else
			{
				heap.delete(a[i-w]);
				heap.insert(a[i]);
				heap.printHeap();
				System.out.println("Max in Heap : "+heap.getMax());
			}
		}
	}
}
