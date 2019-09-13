package arrays;

/*
 * Input:  [12 11 -13 -5 6 -7 5 -3 -6]
Output: [-13 -5 -7 -3 -6 12 11 6 5]
 */

public class RearrangeNumbers {

	public static void main(String[] args)
	{
		int[] a= {12,11,-13,-5,5,-7,5,-3,-6};
		rearrange(a);
	}
	
	public static int[] rearrange(int[] a)
	{
		int fp=-1;
				
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
			{
				if(fp==-1)
					fp=i;
				continue;
			}
			else
			{
				int temp=a[fp];
				a[fp]=a[i];
				a[i]=temp;
				fp++;
			}
		}
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		return a;
	}

}
