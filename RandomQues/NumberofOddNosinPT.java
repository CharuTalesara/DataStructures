/*
Number of odd nos in a row of pascal triangle ??
*/

import java.lang.Math;

public class NumberofOddNosinPT
{
	public static void main(String args[])
	{
		PascalsTrinagle pt=new PascalsTrinagle();
		int[][] a=pt.triangle(11,23);
		pt.print(a);

		System.out.println(oddnosNumber(11));
	}

	/*
Number of odd numbers in row N in PT = 2^(Total number of set bits in binary representation of N)
*/

	public static double oddnosNumber(int n)
	{
		CountBits cb=new CountBits();
		int pow=cb.countSetBits(n);
	
		double ret=Math.pow(2,pow);
	
		return ret;
	}
}




