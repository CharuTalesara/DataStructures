
/*
Given 2 arrays A and B eaxh with n elements. give an algorithm for finding largest n pairs

*/


/*
heapify both the arrays n dele max
or sort n get the pairs

*/

public class LargestNPairs
{
	public static void main(String args[])
	{
		int[] a={9,12,15,13,17,19,20,22};
		int[] b={2,4,1,3,6,8,5,0};
		largestnpairs(a,b);
	}

	public static void largestnpairs(int[] a,int[] b)
	{
		Heap h1=new Heap();
		Heap h2=new Heap();

		h1=h1.build_max_heap(a);
		h2=h2.build_max_heap(b);

		for(int i=0;i<a.length;i++)
		{
			System.out.print(h1.deleteMax()+" "+h2.deleteMax());
			System.out.println();
		}
	}
}
