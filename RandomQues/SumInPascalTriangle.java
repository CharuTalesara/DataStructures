//Sum of elements upto nth row in a pascal triangle

public class SumInPascalTriangle
{
	public static void main(String args[])
	{
		PascalsTrinagle pt=new PascalsTrinagle();
		int[][] a=pt.triangle(7,15);
		pt.print(a);

		int[] n=sum(a);	
	
		int sum[]=sumeff(a);
		
		for(int i=0;i<sum.length;i++)
			System.out.print(sum[i]+" ");
	}

	//O(n) --as sum is 2^(i)

		
	public static int[] sumeff(int[][] a)
	{
		int[] n=new int[a.length];
		n[0]=1;
		
		for(int i=1;i<a.length;i++)
		{
			n[i]=2*n[i-1];
		}

		return n;
	}

	// O(n2)--brutal force- traverse the row n add the elements 

	public  static int[] sum(int[][] a)	
	{
		int[] n=new int[a.length];

		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[0].length;j++)
				sum=sum+a[i][j];
			n[i]=sum;
		}

		return n;
	}
}
