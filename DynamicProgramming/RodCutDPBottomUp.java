



/*
Given a rod of length n inches and table of prices pi for i =1 to n 
determine the maximum revenue obtainable by cutting up the rod and selling the peices 

*/


public class RodCutDPBottomUp
{
	public static void main(String args[])
	{
		int[] prices={0,1,5,8,9,10,17,17,20,24,30};

		System.out.println(rod_cut(prices,1));
		System.out.println(rod_cut(prices,2));
		System.out.println(rod_cut(prices,3));
		System.out.println(rod_cut(prices,4));
		System.out.println(rod_cut(prices,5));
		System.out.println(rod_cut(prices,6));
		System.out.println(rod_cut(prices,7));
		System.out.println(rod_cut(prices,8));
		System.out.println(rod_cut(prices,9));
		System.out.println(rod_cut(prices,10));

		System.out.println("************");

		
		int[][] a=extended_rod_cut(prices,10);
		print(a);
	}

	public static int rod_cut(int[] p,int n)
	{
		int[] r=new int[p.length];
		r[0]=0;
		
		int j=1;
		int q=-10;
		for(;j<=n;j++)
		{
			q=-10;
			for(int i=1;i<=j && j-i>=0;i++)
				q=max(q,p[i]+r[j-i]);
			r[j]=q;
		}
		
		return r[n];
	}

	public static int[][] extended_rod_cut(int[] p,int n)
	{
		int[] r=new int[p.length];
		int[] s=new int[p.length];

		r[0]=0;
		
		int j=1;
		int q=-10;
		for(;j<=n;j++)
		{
			q=-10;
			for(int i=1;i<=j && j-i>=0;i++)
			{
				if(q<p[i]+r[j-i])
				{
					q=p[i]+r[j-i];
					s[j]=i;
				}
			}
			r[j]=q;
		}

		int[][] ret={r,s};
		
		return ret;
	}

	public static void print(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}

	public static int max(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
}
