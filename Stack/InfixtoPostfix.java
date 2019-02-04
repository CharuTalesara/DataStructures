import java.util.Scanner;


public class InfixtoPostfix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the infix expression ");
		String input=sc.nextLine();
		convertToPostfix(input);
	}
	
	public static void convertToPostfix(String input)
	{
		ArrayStack s=new ArrayStack(input.length());
		for(int i=0;i<input.length();i++)
		{
			char c=input.charAt(i);
			if(Character.isDigit(c))
			{
				System.out.print(c);
			}
			else if(c==')')
			{
				while(s.top().toString().charAt(0)!='(')
				{
					System.out.print(s.pop().toString());
				}
				s.pop();
			}
			else
			{
				if(c=='*' || c=='/' || c=='(')
					s.push(c);
				else if(c=='+' || c=='-')
				{
					while(!s.isEmpty() && (s.top().toString().charAt(0)=='*' ||
						 s.top().toString().charAt(0)=='/' || s.top().toString().charAt(0)=='+' ||
						s.top().toString().charAt(0)=='-') )
					{
						System.out.print(s.pop());
					}
					s.push(c);
					
				}
				else
					s.push(c);	
			}
					
		}
		while(!s.isEmpty())
				System.out.print(s.pop());
			System.out.println();	
	}
}
