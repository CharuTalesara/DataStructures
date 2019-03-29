
/*
Inplace Sorting alog
Time Complexity-O(n^2)
Stability-Not stable;
Never makes more than O(n) swaps so useful when memory write is a costly operation
*/



public class SelectionSort
{
	public static void main(String args[])
	{
		int[] a={5,3,1,6,7,2,8,4};
		print(a,a.length);

		algo(a,a.length);
		print(a,a.length);
	}

	public static void algo(int[] a,int n)
	{
		for(int i=0;i<n-1;i++)
		{
			int max=i;
		
			for(int j=i+1;j<n;j++)
			{
				if(a[max]<a[j])
				{
					max=j;
				}
			}
			
			if(max!=i)
			{		
				int temp=a[i];
				a[i]=a[max];
				a[max]=temp;
			}
		}
	}

	public static void print(int[] a,int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
