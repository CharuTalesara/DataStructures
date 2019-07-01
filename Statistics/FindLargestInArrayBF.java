

public class FindLargestInArrayBF	
{
	public static void main(String args[])
	{
		int[] a={4,2,1,7,6,9,3,8,5};
		print(a);
		System.out.println(largestBruteForce(a));		
	}

	public static int largestBruteForce(int[] a)
	{
		int max=a[0];

		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}		

		return max;
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
