




public class FibbonaciDP
{
	public static void main(String args[])
	{
		System.out.println(memoized_fib(0));
		System.out.println(memoized_fib(1));
		System.out.println(memoized_fib(2));
		System.out.println(memoized_fib(3));
		System.out.println(memoized_fib(4));
		System.out.println(memoized_fib(5));
		System.out.println(memoized_fib(6));
	}

	public static int memoized_fib(int n)
	{
		int[] r=new int[n+1];
		
		for(int i=0;i<r.length;i++)
			r[i]=-10;

		return seriesNo(r,n);
		
	}

	public static int seriesNo(int[] r,int n)
	{
		if(r[n]>=0)
			return r[n];

		r[0]=0;
		if(n>0)
			r[1]=1;

		for(int i=2;i<=n;i++)
		{
			r[i]=r[i-1]+r[i-2];
		}
		
		return r[n];
	}
}
