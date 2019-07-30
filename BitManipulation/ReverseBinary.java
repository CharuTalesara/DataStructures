
/*
 * 
 * Reverse a Binary Number
 * 
 */
public class ReverseBinary {

	public static void main(String[] args)
	{
		int n=50;
		System.out.println(Integer.toBinaryString(n));
		System.out.println((Integer.toBinaryString(rotateBinary(n))));
	}
	
	public static int rotateBinary(int n)
	{
		int rev=0;
		
		while(n>0)
		{
			rev=rev<<1;
			rev=rev|(n&1);
			n=n>>1;
		}
		
		return rev;
	}

}
