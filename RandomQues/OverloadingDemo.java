
public class OverloadingDemo 
{
	public static void main(String args[])
	{
		m1(null);
	}
	
	public static void m1(Object o)
	{
		System.out.println("Inside o");
	}
	
	public static void m1(String o)
	{
		System.out.println("String o");
	}
}
