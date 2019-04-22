
//

public class MatrixMultiplication
{
	public static void main(String args[])
	{
		int[][] a={{1,2,-1},{2,0,1},{1,2,3}};
		int[][] b={{1,2,-1},{2,0,1},{1,2,3}};
		print2DArray(a);
		print2DArray(b);

		int[][] c=matrixmult(a,b);
		print2DArray(c);
	}

// Matrix multiplication of square matrix

	public static int[][] matrixmult(int[][] a,int[][] b)
	{
		int[][] c=new int[a[0].length][b.length];

		
		for(int k=0;k<a.length;k++)
		{
			for(int i=0;i<c[0].length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
					c[k][i]=c[k][i]+a[k][j]*b[j][i];
				}
			}
		}
	
		
		return c;
	}


	public static void print2DArray(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("*************");
	}
}
