/*
Pattern Matching - Brute force 
*/

import java.util.*;


public class PatternMatchingRabinKarp
{
	public static void main(String args[])
	{
		int[] text={1,2,3,4,5,6,7,8,9,2,3,4,10};
		int[] pat={2,3,4};
		match(text,pat);
	}

	// Robin Karp Algorithm-assuming the text is in nos

	public static void match(int[] text,int[] pattern)
	{
		int n=text.length;
		int m=pattern.length;

		double p=0;
		double t=0;
		System.out.println(pattern[0]);

		int j=0;
		while(j<m)
		{
			p=p+pattern[j]*Math.pow(10,m-j-1);
			t=t+text[j]*Math.pow(10,m-j-1);
			j++;
		}	

		System.out.println("Pattern : "+p);
		System.out.println("text : "+t);

		if(p==t)
			System.out.println("Pattern mathced at : 0");

		for(int i=1;i<n-m;i++)
		{
			t=10*(t-text[i-1]*Math.pow(10,m-1))+text[i+m-1];
			System.out.println(t);
			
			if(p==t)
				System.out.println("Pattern Mathced at : "+i);
		}
	}

}
