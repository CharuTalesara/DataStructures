import java.util.Scanner;


public class InfixtoPostfix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the infix expression ");
		String input=sc.nextLine();
		convertToPostfix(input);

		System.out.println("Enter the postfix Expression to evaluate");
		String postfix=sc.nextLine();
		System.out.println(evaluatePostfix(postfix));
		
		System.out.println("Enter the prefix Expression to evaluate");
		String prefix=sc.nextLine();
		System.out.println(evaluatePrefix(prefix));
	}

	public static String evaluatePostfix(String postfix)
	{
		ArrayStack s=new ArrayStack(postfix.length());
		for(int i=0;i<postfix.length();i++)
		{
			char c=postfix.charAt(i);
			if(Character.isDigit(c))
			{
				s.push(c);
			}
			else 
			{
				int op2=Integer.parseInt((s.pop()).toString());
				int op1=Integer.parseInt((s.pop()).toString());
				if(c=='+')
				{
					int op3=op1+op2;
					s.push(op3);
				}				
				else if(c=='-')
				{
					int op3=op1-op2;
					s.push(op3);
				}				
				else if(c=='*')
				{				
					int op3=op1*op2;
					s.push(op3);
				}
				else if(c=='/')
				{
					int op3=op1/op2;
					s.push(op3);
				}
				else
					s.push(c);				
			}
		}
		return (s.top()).toString();
	}
	

	public static String evaluatePrefix(String prefix)
	{
		ArrayStack s=new ArrayStack(prefix.length());
		for(int i=prefix.length()-1;i>=0;i--)
		{
			char c=prefix.charAt(i);
			if(Character.isDigit(c))
			{
				s.push(c);
			}
			else 
			{
				int op1=Integer.parseInt((s.pop()).toString());
				int op2=Integer.parseInt((s.pop()).toString());
				if(c=='+')
				{
					int op3=op1+op2;
					s.push(op3);
				}				
				else if(c=='-')
				{
					int op3=op1-op2;
					s.push(op3);
				}				
				else if(c=='*')
				{				
					int op3=op1*op2;
					s.push(op3);
				}
				else if(c=='/')
				{
					int op3=op1/op2;
					s.push(op3);
				}
				else
					s.push(c);				
			}
		}
		return (s.top()).toString();
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
