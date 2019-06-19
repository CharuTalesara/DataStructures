

public class CheckBit
{
	public static void main(String args[])
	{
		System.out.println("Checking For 2");
		System.out.println(check1AtI(2,0));
		System.out.println(check1AtI(2,1));
		System.out.println(check1AtI(2,3));
		
		System.out.println("Checking For 3");
		System.out.println(check1AtI(3,0));
		System.out.println(check1AtI(3,1));
		System.out.println(check1AtI(3,2));
	}

	public static boolean check1AtI(int a,int i)
	{
		return ((a&(1<<i))!=0);
	}
}
