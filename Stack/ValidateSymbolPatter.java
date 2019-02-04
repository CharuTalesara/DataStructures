import java.util.Scanner;


public class ValidateSymbolPatter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string of symbols");
		String input=sc.nextLine();
			
		System.out.println(isValidPatter(input));		

	}
		
	public static boolean isValidPatter(String input)
	{
		ArrayStack s=new ArrayStack(input.length());

		if(input.length()==0 || input==null)
			return true;
		
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==')')
			{
				if(s.isEmpty() || s.top().toString().charAt(0)!='(')
					return false;
				else
					s.pop();
			}
			else if(input.charAt(i)=='}')
			{
				if(s.isEmpty() || s.top().toString().charAt(0)!='{')
					return false;
				else
					s.pop();
			}
			else if(input.charAt(i)==']')
			{
				if((s.isEmpty() || s.top().toString().charAt(0)!='['))
					return false;
				else
					s.pop();
			}
			else
				s.push(input.charAt(i));
		}

		if(s.isEmpty())
			return true;
		else
			return false;
	}
}
