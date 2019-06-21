/*
Given a rod of length n inches and table of prices pi for i =1 to n 
determine the maximum revenue obtainable by cutting up the rod and selling the peices 

*/


public class RodCutRecursive
{
	public static void main(String args[])
	{
		int[] prices={0,1,5,8,9,10,17,17,20,24,30};
		System.out.println(cut_rod(prices,1));
		System.out.println(cut_rod(prices,2));
		System.out.println(cut_rod(prices,3));
		System.out.println(cut_rod(prices,4));
		System.out.println(cut_rod(prices,5));
		System.out.println(cut_rod(prices,6));
		System.out.println(cut_rod(prices,7));
	}


	// Parameter p=prices , n= length of the rod
	// following code is a recurvie top-down approach

	public static int cut_rod(int[] p,int n)
	{
		if(n==0)
			return 0;
		int q=-10;

		for(int i=1;i<=n;i++)
		{
			q=max(q,p[i]+cut_rod(p,n-i));
			//System.out.println(q);
		}
		return q;
	}

	public static int max(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
}
