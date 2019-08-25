package strings;

/*
 * James found a love letter that his friend Harry has written to his girlfriend. James is a prankster, so he decides to meddle with the letter. He changes all the words in the letter into palindromes.

To do this, he follows two rules:

He can only reduce the value of a letter by , i.e. he can change d to c, but he cannot change c to d or d to b.
The letter a may not be reduced any further.
Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations required to convert a given string into a palindrome.

For example, given the string , the following two operations are performed: cde → cdd → cdc.
 */

public class LoveLetterMystery {

	public static void main(String[] args)
	{
		System.out.println(theLoveLetterMystery("cba"));
	}
	
	static int theLoveLetterMystery(String s)
	{
		int[] a=new int[s.length()];
		
		for(int i=0;i<s.length();i++)
			a[i]=s.charAt(i);
		
		int count=0;
		
		for(int i=0;i<a.length/2;i++)
		{
			count=count+Math.abs(a[i]-a[a.length-i-1]);
		}
		
		return count;

	}

}
