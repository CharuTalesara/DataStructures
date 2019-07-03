

public class RecursiveFunction
{
	public static void main(String args[])
	{
		System.out.println(func(0));
		System.out.println(func(1));
		System.out.println(func(2));
		System.out.println(func(3));
		System.out.println(func(4));
	}

	/*
		T(0)=T(1)=2;
		T(n)=Summation over (i=1 to n-1)[2*T(i)*T(i-1)]
		
	*/

	public static int func(int n)
	{
		if(n==0)
			return 2;
		if(n==1)
			return 2;
		
		int sum=0;
		
		for(int i=1;i<n;i++)
		{
			sum=sum+2*func(i)*func(i-1);
		}

		return sum;
	}
}
