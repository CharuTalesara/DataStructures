

public class  SumOfDigitsFrom1ToN 																																						
{
	public static void main(String args[])	
	{
		System.out.println(sumofDigits(10));
		System.out.println(sumofDigits(99));
		System.out.println(sumofDigits(345));
		System.out.println(sumFrom1ToN(5));
		System.out.println(sumFrom1ToN(12));
		System.out.println(sumFrom1ToN(328));
	}

	public static int sumFrom1ToN(int n)
	{
		int sumCount=0;
		
		int i=1;
		while(i<=n)
		{
			sumCount=sumCount+sumofDigits(i);
			i++;
			
		}
	
		return sumCount;
	}

	public static int sumofDigits(int no)
	{
		int sum=0;

		while(no>0)
		{
			if(no%10>=0)
			{
				sum=sum+no%10;
				no=no/10;
			}
		}

		return sum;
	}
}
