

public class DecimalToBinary
{
	public static void main(String args[])
	{
		System.out.println("Binary Converion of 6 : "+convert(6));
		System.out.println("Binary Converion of 32 : "+convert(32));
		System.out.println("Binary Converion of 33 : "+convert(33));
		System.out.println("Binary Converion of 34 : "+convert(34));
	}

	public static String convert(int n)
	{
		String s="";
		
		while(n>=1)
		{
			if(n%2==0)
				s=s+"0";
			else
				s=s+"1";
			n=n/2;
		}

		String rev="";

		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}

		return rev;
	}
}
