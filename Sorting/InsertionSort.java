
/*
Inplace Sorting Algo
Comparison based Sorting
Time Complexity-O(n^2)
Inplace 
Stable

Practically more efficient than selection and bubble sort though all of them has O(n^2) complexity
Good for small files
can sort online
adaptive- if the list is already sorted then takes O(n)
*/


public class InsertionSort
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
		for(int i=1;i<n;i++)
		{
			int j=i-1;
			int key=a[i];

			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}

			a[j+1]=key;
		}
	}

	public static void print(int[] a,int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
