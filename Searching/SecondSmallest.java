package searching;

public class SecondSmallest {

	public static void main(String[] args)
	{
		int[] a={5,3,7,6,1,9,8,0,2,4,-1};
		print(a);
		System.out.println(secondSmallest(a));
	}
	
	public static int secondSmallest(int[] a)
	{
		int first_smallest=a[0];
		int sec_smallest=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<first_smallest)
			{
				sec_smallest=first_smallest;
				first_smallest=a[i];
				continue;
			}
			if(a[i]<sec_smallest && a[i]>first_smallest)
				sec_smallest=a[i];
		}
		
		return sec_smallest;
	}
	
	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}

}
