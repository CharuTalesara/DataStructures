// Worst time complexity=O(n^2)
// Inplace sorting
//Can check if the list is already sorted in O(n) time.- only advantage that bubble sort has over others.


public class BubbleSort
{
	public static void main(String args[])
	{
		int[] a={5,3,1,6,7,2,8,4};
		print(a,a.length);
		bubbleSortAlgo(a,a.length);
		print(a,a.length);

		bubbleSortAlgo(a,a.length);
		print(a,a.length);

	}

	public static void bubbleSortAlgo(int[] a,int n)
	{
		boolean swapped=false;
		int swapCounts=0;

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;

					swapCounts++;

					swapped=true;
				}
			}

			if(swapped==false)
			{
				System.out.println("Array already sorted");
				break;
			}
		}

		System.out.println("Swap Counts : "+swapCounts);
	}

	public static void print(int[] a,int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
