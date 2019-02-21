/*
Generate all the strings of n bits -- a backtracking problem
*/

import java.util.*;

public class AllBinaryString
{
	static int[] a=new int[3];

	public static void main(String args[])
	{
		binary(3);
	}
	
	public static void binary(int n)
	{
		if(n<1)
			System.out.println(Arrays.toString(a));
		else
		{
			a[n-1]=0;
			binary(n-1);
			a[n-1]=1;
			binary(n-1);
		}
	}
}
