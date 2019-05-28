

public class CountBits
{
	public static void main(String args[])
	{
		int count=0;
		int n=15;

		//int count=0;

		while((n&(n-1))>0)
		{
			n=n&(n-1);
			count++;
		}
		

		System.out.println(++count);
	}
}
