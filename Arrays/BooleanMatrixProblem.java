/*
 * Given a 2d matrix find an element in the matrix which is 0 and mark the entire row and column to be 0
 * 
 */

/*	1 2 3 4
 *  9 0 1 6
 *  0 2 4 3
 *  
 *  o/p- 
 *  
 *  0 0 3 4
 *  0 0 0 0
 *  0 0 0 0
 */


public class BooleanMatrixProblem 
{

	public static void main(String[] args)
	{
		int[][] a= {{1,2,3,4},{9,0,1,6},{0,2,4,3}};
		print2D(a);
		boolmatrix(a);
		//print(b);
	}
	
	public static int[][] boolmatrix(int[][] a)
	{
		int row=a.length;
		int col=a[0].length;
		
		int[] b= new int[row+col];
		
		for(int i=0;i<row+col;i++)
			b[i]=1;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]==0 )//&& (b[i]==1 || b[j+a.length]==1))
				{
						b[j+a.length]=0;
						b[i]=0;						
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(b[i]==0)
			{
				for(int j=0;j<a[0].length;j++)
					a[i][j]=0;
			}
		}
		
		for(int i=0;i<a[0].length;i++)
		{
			if(b[i+a.length]==0)
			{
				for(int j=0;j<a.length;j++)
					a[j][i]=0;
			}
		}
		
		print(b);
		
		print2D(a);
		
		return a;
	}
	
	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		System.out.println();
	}
	
	public static void print2D(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println();
	}

}
