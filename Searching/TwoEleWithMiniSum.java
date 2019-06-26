/*
Given an array with both +ve and -ve nos; fidn the two elements such that there sum is closest to zero
*/

import java.lang.Math;


public class TwoEleWithMiniSum
{
	public static void main(String args[])
	{
		int[] a={1,60,-10,70,-80,85,0};
		print(a);
		minSumBruteForce(a);
		minsum(a);
	}

	public static void minSumBruteForce(int[] a)
	{
		int min_sum=-110000;
		int min_left=0;
		int min_right=0;
		
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int sum=a[i]+a[j];
				if(Math.abs(sum)<Math.abs(min_sum))
				{
					min_sum=sum;
					min_left=i;
					min_right=j;
				}	
			}
		}
		System.out.println("Elements : "+a[min_left]+" "+a[min_right]);
	}

	public static void minsum(int[] a)
	{
		QuickSortAlgo ms=new QuickSortAlgo();
	
		ms.quickSort(a,0,a.length-1);
		print(a);

		int min_left=-1;
		int min_right=-1;
		int min_neg=-1000;
		int min_pos=1000;

		for(int i=0,j=a.length-1;i<j;)
		{
			int sum=a[i]+a[j];

			if(sum>0)
			{
				if(sum<min_pos)
				{
					min_left=i;
					min_right=j;
					min_pos=sum;
				}
				j--;
			}
			else 
			{
				if(sum>min_neg)
				{
					min_left=i;
					min_right=j;
					min_neg=sum;
				}
				i++;
			}				
		}

		System.out.println(a[min_left]+" "+a[min_right]);
	}
	
	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
