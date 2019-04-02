/*
Avg Time Complexity-O(nlogn)
Worst TC-O(n^2)

One of the best sorting algos as constant in O(nlogn) is very small.
In place sorting

*/


public class QuickSortAlgo
{
	public static void main(String args[])
	{
		int[] a={2,8,7,1,3,5,6,4};
		print(a);
		quickSort(a,0,7);
		print(a);
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}

	public static void quickSort(int[] a,int p,int r)
	{
		if(p<r)
		{
			int q=partition(a,p,r);
			quickSort(a,p,q-1);
			quickSort(a,q+1,r);;
		}
	}

	public static int partition(int[] a,int p,int r)
	{
		int i=p-1;
		int j=p;

		int x=a[r];

		for(;j<r;j++)
		{
			if(a[j]<=x)
			{
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}

		int temp2=a[i+1];
		a[i+1]=a[r];
		a[r]=temp2;

		return i+1;
	}
}
