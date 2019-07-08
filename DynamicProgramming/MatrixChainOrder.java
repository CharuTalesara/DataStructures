

public class MatrixChainOrder
{
	public static void main(String args[])
	{
		int[] p={30,35,15,5,10,20,25}; // 7
		matrix_chain_order(p);	
	}


	public static void matrix_chain_order(int[] p)
	{
		int n=p.length;

		int[][] m=new int[n][n];
		int[][] s=new int[n][n];

		for(int l=2;l<=n;l++) // l is chain length
		{
			System.out.println("l : "+l);
			for(int i=1;i<=n-l+1;i++)
			{
				System.out.println(i);
				System.out.println(i+l-1);
				int j=i+l-1;
				if(j>=n)
					break;
				m[i][j]=100000;
				int q=0;

				for(int k=i;k<=j-1;k++)
				{
					//System.out.println(i+" j: "+j+" k : "+k);
					q=m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];
					System.out.println("i-1 "+(i-1)+" k"+k+" j"+j);
					if(q<m[i][j])
					{
						m[i][j]=q;
						s[i][j]=k;
					}
				}
			}
		}

		print(m);
		print(s);
		
	}	

	public static void print(int[]a)
	{
		System.out.println("******************");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}

	public static void print(int[][] a)
	{
		System.out.println("******************");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}
