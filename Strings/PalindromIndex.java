package strings;

/*
 * Given a string of lowercase letters in the range ascii[a-z], determine a character that can be removed to make the string a palindrome. There may be more than one solution, but any will do. For example, if your string is "bcbc", you can either remove 'b' at index  or 'c' at index . If the word
 *  is already a palindrome or there is no solution, return -1. Otherwise, return the index of a character to remove.
 */

public class PalindromIndex
{

	public static void main(String[] args) 
	{
		//
		System.out.println(palindromeIndex("hgygsvlfwcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcflvsgygh"));
		System.out.println(palindromeIndex("hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh"));
		//
	}
	
	static int palindromeIndex(String s)
	{
		int i=0;
		int j=s.length()-1;
		//int n=j;
		   
		while(i<=j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				i++;
				j--;
			}
			else 
			{
				if(s.charAt(i+1)==s.charAt(j) && s.charAt(j-1)!=s.charAt(i))
					return i;
				else if(i+1<j && j-1>i && s.charAt(i+1)==s.charAt(j) && s.charAt(j-1)==s.charAt(i))
				{
					if(j-2>i+1 && s.charAt(i+1)==s.charAt(j-2))
						return j;
					else
						return i;
				}
				else
					return j;
			}
		}
		return -1;

    }

}
