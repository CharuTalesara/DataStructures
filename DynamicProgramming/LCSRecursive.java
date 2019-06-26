/*

Subsequence-

*/

public class LCSRecursive
{
	public static void main(String args[])
	{
		char[] x={'a','b','c','b','d','a','b'};
		char[] y={'b','d','c','a','b','a'};

		System.out.println(lcsRecursive(x,y,x.length,y.length));

		char[] a={'1','0','0','1','0','1','0','1'};
		char[] b={'0','1','0','1','1','0','1','1','0'};

		System.out.println(lcsRecursive(a,b,a.length,b.length));
	}

	public static int lcsRecursive(char[] x,char[] y,int m,int n)
	{
		if(m==0)
			return 0;
		if(n==0)
			return 0;

		if(x[m-1]==y[n-1])
		{
			return 1+lcsRecursive(x,y,m-1,n-1);
		}
		return max(lcsRecursive(x,y,m-1,n),lcsRecursive(x,y,m,n-1));
		
	}

	public static int max(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
}
