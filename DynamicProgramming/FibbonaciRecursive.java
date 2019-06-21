

public class FibbonaciRecursive
{
	public static void main(String args[])
	{
		System.out.println(seriesNo(0));
		System.out.println(seriesNo(1));
		System.out.println(seriesNo(2));
		System.out.println(seriesNo(3));
		System.out.println(seriesNo(4));
		System.out.println(seriesNo(5));
		System.out.println(seriesNo(6));
	}

	public static int seriesNo(int n)
	{
		if(n==0)
			return 0;

		if(n==1)
			return 1;

		return seriesNo(n-1)+seriesNo(n-2);
	}
}
