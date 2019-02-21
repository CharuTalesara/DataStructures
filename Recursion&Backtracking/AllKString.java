/*
 Given two numbers, n and k (k>=n), write an algorithm to generate all the strings of length n drawn from 0 – k-1.

k = 2, n = 2
Output:  0 0      0 1         1 0         1 1

k = 3, n = 2
Output: 
0 0          1 0        2 0        0 1         1 1         2 1          
0 2          1 2        2 2

*/

import java.util.*;

public class AllKString
{
	static int[] a=new int[2];		
	
	public static void main(String args[])
	{
		kls(2,1);
	}

	// Recursion inside for loop

	public static void x(int n) 
	{
 
	        for (int i = 0; i < n; i++) 
		{
	            System.out.println("n:    "+n);
		    System.out.println("i  : "+i);
	            x(n - 1);
		    System.out.println("i  : "+i);
	        }
    	}

	public static void kls(int n,int k)
	{	
		if(n<1)
			System.out.println(Arrays.toString(a));
		else
		{
			a[n-1]=k-1;
			kls(n-1,k-1);
		}
	}
	
	public static void kLengthStrings(int n,int k)
	{
		if(n<1)
		{
			System.out.println(Arrays.toString(a));

		}
		
		else
		{
			for(int j=0;j<k;j++)
			{
				a[n-1]=j;
				kLengthStrings(n-1,k);	
			}
		}
	}
	
}
