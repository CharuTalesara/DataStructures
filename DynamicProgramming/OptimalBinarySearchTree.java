



public class OptimalBinarySearchTree
{
	public static void main(String args[])
	{
		double[] p={0,.15,.10,.05,.10,.20};
		double[] q={.05,.10,.05,.05,.05,.10};

		optimatbst(p,q,5);
	}

	public static void optimatbst(double[] p,double[] q,int n)
	{
		double[][] e=new double[n+2][n+1];
		double[][] w=new double[n+2][n+1];
		int[][] root=new int[n+1][n+1];

		for(int i=1;i<e.length;i++)
		{
			e[i][i-1]=q[i-1];
			w[i][i-1]=q[i-1];
		}
		
		for(int l=1;l<=n;l++)
		{
			for(int i=1;i<=n-l+1;i++)
			{
				int j=i+l-1;
				e[i][j]=100000;
				w[i][j]=p[j]+q[j]+w[i][j-1];

				for(int r=i;r<=j;r++)
				{
					double t=e[i][r-1]+e[r+1][j]+w[i][j];
					if(t<e[i][j])
					{
						e[i][j]=t;
						root[i][j]=r;
					}
				}
			}
		}
	
		print(e);
		print(w);
		print(root);
	}

	public static void print(double[][] a)
	{
		System.out.println("********************************");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
				System.out.print(a[i][j]+" " );
			System.out.println();
		}
	}

	public static void print(int[][] a)
	{
		System.out.println("********************************");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
				System.out.print(a[i][j]+" " );
			System.out.println();
		}
	}
}
