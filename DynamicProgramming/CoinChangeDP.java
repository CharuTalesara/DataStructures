package dp;

public class CoinChangeDP {

	public static void main(String[] args) {
		int[] coins= {1,2,5};
		int n=11;
		
		
		System.out.println(coinchangeBottomUp(n,coins));
	}
	
	public static int coinchangeBottomUp(int n,int[] coins)
	{
		int[] res=new int[n+1];
		
		for(int i=0;i<res.length;i++)
			res[i]=n+1;
		
		res[0]=0;
		
		for(int i=1;i<res.length;i++)
		{
			for(int j=0;j<coins.length;j++)
			{
				if(coins[j]>i);
				else
				{
					if(i-coins[j]>=0)
						res[i]=Math.min(1+res[i-coins[j]],res[i]);
				}
			}
		}
		
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+" ");
		System.out.println();
		
		return res[n];
	}

}
