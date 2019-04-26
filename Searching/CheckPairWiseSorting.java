/*
Given an array  of elements ..check whether the elements are pairwise sorted or not.

*/


public class CheckPairWiseSorting
{
	public static void main(String args[])
	{
		int[] a={1,3,2,4,7,8,9,10};
		int[] b= {1,2,3,4,6,5};
		int[] c={1,3,2,4,7,8,9,10,9};

		print(a);
		System.out.println("Whehter a pairwise Sorted : "+checkSortig(a));

		print(b);
		System.out.println("Whehter a pairwise Sorted : "+checkSortig(b));

		print(c);
		System.out.println("Whehter a pairwise Sorted : "+checkSortig(c));
	}

	public static boolean checkSortig(int[] a)
	{
		for(int i=0;i<a.length-1;i=i+2)
		{
			if(a[i]>a[i+1])
				return false;
		}
		return true;
	}

	public static  void print(int[] a)
	{
		for(int  i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
