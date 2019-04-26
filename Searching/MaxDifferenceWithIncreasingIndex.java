/*
Given an array of index find out the maximum difference between any two elements such that the larger element appears after the smaller number in the arrray

eg- a=[2,3,10,6,4,8,1];
 o/p-8 // difference between 10 n 2
*/



public class MaxDifferenceWithIncreasingIndex
{
	public static void main(String args[])
	{
		int[] a={2,3,10,6,4,8,1};
		print(a);
		maxdiff(a);

		int[] b={7,9,5,6,3,2};
		print(b);
		maxdiff(b);
	}

	public static void maxdiff(int[] a)
	{
		int max=-1000;
		int min_i=-1;
		int min_j=-1;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i] && max<a[j]-a[i])
				{
					min_i=i;
					min_j=j;
					max=a[j]-a[i];
				}
			}
		}

		System.out.println("Min initial index "+min_i+" last_index "+min_j+" difference "+max);
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
