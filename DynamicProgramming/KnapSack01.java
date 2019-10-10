package dp;

public class KnapSack01 
{
	public static void main(String args[])
	{
		int[] w= {1,3,4,5};
		int[] v= {1,4,5,7};
		
		int[] w1= {5,3,4,2};
		int[] v1= {60,50,70,30};
		
		knap01(5,w1,v1);
	}
	
	public static int knap01(int tw,int[] w,int[]v)
	{
		int[][] c=new int[w.length][tw+1];
		
		for(int i=0;i<c.length;i++)
			c[i][0]=0;
		
		int j=1;
		for(int i=1;i<c[0].length;i++,j++)
		{
			if(j<w[0])
					c[0][i]=0;
				else
					c[0][i]=v[0];
		}
		

		for(int i=1;i<c.length;i++)
		{
			for(int k=1;k<c[i].length;k++)
			{
				if(w[i]>k)
					c[i][k]=c[i-1][k];
				else 
				{
					c[i][k]=Math.max(c[i-1][k],v[i]+c[i-1][k-w[i]]);
				}
			}
		}
		
		print(c);
		return c[w.length-1][tw];
	}
	
	public static void print(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}
