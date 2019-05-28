import java.util.*;

// Pascals triangle- a triangular array of binomial coefficient

public class PascalsTrinagle
{
	public static void main(String args[])
	{
		int[][] a=new int[6][11];

		triangle(a);

		print(a);
	}

	// Time Complexity-O(n2)..=space complexity

	public static void triangle(int[][] a)
	{
		int row_count=a.length;
		int col_count=a[0].length;

		a[0][col_count/2]=1;

		for(int i=1;i<row_count;i++)
		{
			for(int j=0;j<col_count;j++)
			{
				int a1=0;
				int b1=0;
				if(j-1>0)
					a1=a[i-1][j-1];
				if(j+1<col_count)
					b1=a[i-1][j+1];
					
				
				
				a[i][j]=a1+b1;
			}
		}
	}

	public static void print(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]==0)
					System.out.print(" ");
				else
					System.out.print(a[i][j]+" ");
			}
				
			System.out.println();
		}
	}
}
