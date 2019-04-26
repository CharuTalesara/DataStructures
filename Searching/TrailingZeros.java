/*
Given a number n..find no. of trailing zeros in n!
*/


public class TrailingZeros
{
	public static void main(String args[])
	{
		System.out.println("No. of trailing zeros in 5! "+findTrailingZeros(5));
		System.out.println("No. of trailing zeros in 200! "+findTrailingZeros(200));
		System.out.println("No. of trailing zeros in 100! "+findTrailingZeros(100));

		System.out.println("No. of trailing zeros in 5! "+trailing0s(5));
		System.out.println("No. of trailing zeros in 200! "+trailing0s(200));
		System.out.println("No. of trailing zeros in 100! "+trailing0s(100));
	}

	public static int trailing0s(int n)
	{
		int count=0;
		
		if(n<0)
			return -1;

		for(int i=5;n/i>0;i=i*5)
			count=count+n/i;
		return count;
	}

	public static int findTrailingZeros(int n)
	{
		System.out.println("N : "+n);
		int count_5=0;

		for(int i=5;i<=n;i=i+5)
		{
			int j=i;
			while(j%5==0)
			{
				count_5++;
				j=j/5;
			}				
		}
		

		return count_5;
	}
}
