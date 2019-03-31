/*
Inplace =Yes
Stable-No
Worst-O(n^2)
Avg-depends on gap
Best-O(nlgn)

*/

public class ShellSort
{
	public static void main(String args[])
	{
		int[] a={12,34,52,2,3};

		print(a);
		sort(a);
		print(a);

		int[] b={3,6,1,2,0,5,8,9,4,7};
		print(b);
		sort(b);
		print(b);
	}

	public static int[] sort(int[] a)
	{
		int n =a.length;
		int gap=n/2;


		while(gap>0)
		{
			for(int i=gap;i<n;i++)
			{
				int j=i-gap;

				int temp_ai=a[i];

				int temp_index=i;

				while(j>=0)	
				{
					if(temp_ai<a[j])
					{
						int temp=a[j];
						a[j]=a[temp_index];
						a[temp_index]=temp;
					}

					temp_index=j;
					j=j-gap;
				}
			}
	
			gap=gap/2;
		}
	
		return a;
	}
	
	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}	
