
import java.lang.Math;


public class BinaryToDecimal
{
	public static void main(String args[])
	{
		DecimalToBinary no=new DecimalToBinary();
		System.out.println(convert(no.convert(32)));
		System.out.println(convert(no.convert(12)));
	}

	public static double convert(String s)
	{
		double n=0;
		int j=0;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			double a=Math.pow(2,i);
			a=a*Character.getNumericValue(s.charAt(j));
			n=n+a;
			j++;
		}
		
		return n;
	}
}
