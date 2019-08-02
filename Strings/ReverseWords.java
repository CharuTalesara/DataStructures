package strings;

import java.util.Stack;

/*
 * Given a sentence -reverse the order of words
 * 
 */

public class ReverseWords
{
	public static void main(String args[])
	{
		String s="This is a Career Monk String";
		System.out.println(reverse(s));
	}
	
	public static String reverse(String s)
	{
		String ss[]=s.split(" ");
		if(ss.length==0)
			return null;
		
		Stack<String> stack=new Stack<String>();
		
		for(int i=0;i<ss.length;i++)
		{
			stack.push(ss[i]);
		}
		
		String rev="";
		
		while(!stack.isEmpty())
		{
			rev=rev+stack.pop()+" ";
		}
		return rev;
	}
}
