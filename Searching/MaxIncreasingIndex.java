/*
Given an array a,find the maximum j-i such that a[j]>a[i]
eg- a={34,8,10,3,2,80,30,33,1};
o/p-6(j=7,i=1)
*/


public class MaxIncreasingIndex
{	
	public static void main(String args[])
	{
		int[] a={34,8,10,3,2,80,30,33,1};
		print(a);

		bruteForce(a);
		
		//System.out.println(bruteForce(a));
	}

	public static void bruteForce(int[] a)
	{
		int max=0;
		int last=-1;
		int first=-1;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i] && max<j-i)
				{
					last=j;
					first=i;
					max=j-i;
				}
			}
		}

		System.out.println("J :  "+last+" i : "+first+" diff : "+max);
		return;
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
