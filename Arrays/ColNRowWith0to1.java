package arrays;

import java.util.TreeSet;

/*
 * if M[i][j]==0 then convert all the rows and columns corrosponding to it as 1
 */
 class ColNRowWith0to1 {

	public static void main(String[] args)
	{
		int[][] a= {{1,0},{0,0}};
		int[][] b= {{0,0,0},{0,0,1}};
		int[][] c= {{1,0,0,1},{0,0,1,0},{0,0,0,0}};
		
		booleanmatrix(c);
	
		
	}
	
	public static int[][] booleanmatrix(int[][] a)
	{
		print(a);
		boolean[][] b=new boolean[a.length][a[0].length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]==1)
					b[i][j]=true;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(b[i][j]==true)
				{
					for(int k=0;k<a.length;k++)
						a[i][k]=1;
					for(int l=0;l<a.length;l++)
						a[l][j]=1;
				}
			}
		}
		
		print(a);
		return a;
	}
	
	public static void print(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
}


