

public class KSmallest
{
	public static void main(String args[])
	{
		int[] a={4,2,1,7,6,9,3,8,5};
		print(a);

		System.out.println(ksmallest(a,5));
	}

	public static int ksmallest(int[] a,int k)
	{
		Heap maxheap=new Heap();
		
		for(int i=0;i<k;i++)
			maxheap.insert(a[i]);
		
		maxheap.printHeap();
		for(int i=k;i<a.length;i++)
		{
			if(a[i]<maxheap.getMax())
			{
				maxheap.deleteMax();
				maxheap.insert(a[i]);
			}
		}

		return maxheap.getMax();
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
