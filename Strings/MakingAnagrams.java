package strings;

/*
 * We consider two strings to be anagrams of each other if the first string's letters can be rearranged to form the second string. In other words, both strings must contain the same exact letters in the same exact frequency. For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.

Alice is taking a cryptography class and finding anagrams to be very useful. She decides on an encryption scheme involving two large strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Can you help her find this number?

Given two strings,  and , that may not be of the same length, determine the minimum number of character deletions required to make  and  anagrams. Any characters can be deleted from either of the strings.

For example,  and . The only characters that match are the 's so we have to remove  from  and  from  for a total of  deletions.
 */

public class MakingAnagrams {

	public static void main(String[] args)
	{
		System.out.println(makingAnagrams("cde","abc"));
	}

	static int makingAnagrams(String s1, String s2) 
	{
		int[] arrs1=new int[26];
		int[] arrs2=new int[26];
		
		int del=0;
		
		for(int i=0;i<s1.length();i++)
		{
			int c=s1.charAt(i);
			arrs1[c-97]++;
		}
		
		for(int i=0;i<s2.length();i++)
		{
			int c=s2.charAt(i);
			arrs2[c-97]++;
		}
		
		for(int i=0;i<26;i++)
		{
			del=del+Math.abs(arrs2[i]-arrs1[i]);
		}
		
		return del;

    }
}
