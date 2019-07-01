



public class FindLargestNSmallestInArrayBF	
{
	public static void main(String args[])
	{
		int[] a={4,2,1,7,6,9,3,8,5};
		print(a);
		maxNMin(a);	
	}

	public static void maxNMin(int[] a)
	{
		int max=a[0];
		int min=a[0];

		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			else if(a[i]<min)
				min=a[i];
			else
				continue;
		}		

		System.out.println("Min : "+min+" Max: "+max);
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
