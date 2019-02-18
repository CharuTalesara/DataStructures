import java.util.Scanner; 


public class Palindrome
{
	public static void main(String args[])
	{
		System.out.println("Enter the string to check for palindrome");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println(palin1(input));
		System.out.println(palin2(input));
	}


	// Palindrom using aaray -- Time Comlexity-O(n)... Space Complexity-O(1)
	public static boolean palin1(String input)
	{
		char[] a = input.toCharArray();
		int i=0;	
		int j=a.length -1;
		while(i<j && a[i]==a[j])
		{
			i++;
			j--;
		}
		if(i>=j)
			return true;
		else
			return false;

	}

	//Palindrom using stack
	
	public static boolean palin2(String input)
	{	
		int s_size=input.length()/2;
		ArrayStack s=new ArrayStack(s_size);
		char[] a = input.toCharArray();
		int i=0;
		for(i=0;i<s_size;i++)
		{
			s.push(a[i]);
		}	
		if(a.length%2==1)
			i++;
		while(i<a.length)
		{
			if(a[i]!=(Character)s.pop())
				return false;	
			else 
				i++;		
		}		
		return true;
	}
}
