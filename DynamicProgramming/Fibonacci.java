package dp;

public class Fibonacci {

	public static void main(String[] args) 
	{
		int[] ret=fib_dp(10);
		
		for(int i=0;i<ret.length;i++)
			System.out.print(ret[i]+" ");
	}
	
	// n --being the number of terms
	
	public static int[] fib_dp(int n)
	{
		if(n<=0)
			return null;
		
		int[] ret=new int[n];
		ret[0]=1;
		if(n==1)
			return ret;
		ret[1]=1;
		if(n==2)
			return ret;
		
		for(int i=2;i<n;i++)
		{
			ret[i]=ret[i-1]+ret[i-2];
		}
		
		return ret;
	}

}
