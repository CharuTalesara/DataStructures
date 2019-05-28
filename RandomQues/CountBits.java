

public class CountBits
{
	public static void main(String args[])
	{
		System.out.println(countSetBits(7));	
	}

	public static int countSetBits(int n)
	{
		int count=0;

		while((n&(n-1))>0)
		{
			n=n&(n-1);
			count++;
		}
		count++;
		return count;
	}
}
