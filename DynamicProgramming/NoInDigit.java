

public class NoInDigit
{
	public static void main(String args[])
	{
		System.out.println(noInDigit(100));
		System.out.println(noInDigit(98753));
		System.out.println(noInDigit(0));

	}

	public static int noInDigit(int no)
	{
		int count=1;
		
		while(true)
		{
			if(no<10)
				return count; 
			if(no/10>0)
			{
				count++;
				no=no/10;	
			}
		
		}
	}	
}
