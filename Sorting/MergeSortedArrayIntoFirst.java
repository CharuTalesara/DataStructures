/*
There are 2 sorted arrays. First one is of size m+n containing only m elements.
Another is of size m.
Both the arrays are sorted.

Merge the two arrays into the first array such that it is sorted.

*/

public class MergeSortedArrayIntoFirst
{
	public static void main(String args[])
	{
		int[] a = {3,7,9,14,15,0,0,0,0,0};

		int[] b={1,4,8,11,13};


		print(a);
		print(b);
		//System.out.println(a.length);

		mergeSorted(a,b,5);
	}

	public static void mergeSorted(int[] a,int[] b,int alen)
	{
		int m=alen;
		int n=b.length;
		

		while(n>0)
		{
			if(m<=0 || a[m-1]<b[n-1])
			{
				a[m+n-1]=b[n-1];
				n--;
			}
			else
			{
				a[m+n-1]=a[m-1];
				m--;
			}
		}

		print(a);
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}

}
