
public class LCSDP
{
	public static void main(String args[])
	{
		char[] x={'a','b','c','b','d','a','b'};
		char[] y={'b','d','c','a','b','a'};

		int[][] c=lcsdp(x,y);
		print(c);
		

		char[] a={'1','0','0','1','0','1','0','1'};
		char[] b={'0','1','0','1','1','0','1','1','0'};

		int[][] d=lcsdp(a,b);
		print(d);
	}

	public static int[][] lcsdp(char[] x,char[] y)
	{
		int m=x.length;
		int n=y.length;

		int[][] c=new int[m+1][n+1];

		for(int i=0;i<=m;i++)
			c[i][0]=0;

		for(int i=0;i<=n;i++)
			c[0][i]=0;


		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(x[i-1]==y[j-1])
					c[i][j]=c[i-1][j-1]+1;

				else if(c[i-1][j]>c[i][j-1])
					c[i][j]=c[i-1][j];
				else
					c[i][j]=c[i][j-1];
			}
		}
		
		return c;	
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
}
