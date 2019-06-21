
/*
Given a rod of length n inches and table of prices pi for i =1 to n 
determine the maximum revenue obtainable by cutting up the rod and selling the peices 

*/


public class RodCutDPTopDown
{
	public static void main(String args[])
	{
		int[] prices={0,1,5,8,9,10,17,17,20,24,30};

		System.out.println(memoized_cut_rod(prices,1));
		System.out.println(memoized_cut_rod(prices,2));
		System.out.println(memoized_cut_rod(prices,3));
		System.out.println(memoized_cut_rod(prices,4));
		System.out.println(memoized_cut_rod(prices,5));
		System.out.println(memoized_cut_rod(prices,6));
		System.out.println(memoized_cut_rod(prices,7));
		System.out.println(memoized_cut_rod(prices,8));
		System.out.println(memoized_cut_rod(prices,9));
		System.out.println(memoized_cut_rod(prices,10));
//		System.out.println(memoized_cut_rod(prices,4));
	}


	// Same as that of recurive approach but the result of the subproblem is stored in r.

	public static int memoized_cut_rod(int[] p,int n)
	{
		int[] r=new int[p.length];
		
		for(int i=0;i<r.length;i++)
			r[i]=-10;

		return memoized_cut_rod_aux(p,r,n);
		
	}

	public static int memoized_cut_rod_aux(int[] p,int[] r,int n)
	{
		if(r[n]>=0)
			return r[n];
			
		int q=-10;

		if(n==0)
			q=0;
		else
		{
			for(int i=1;i<=n;i++)
				q=max(q,p[i]+memoized_cut_rod_aux(p,r,n-i));
		}
		r[n]=q;
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
