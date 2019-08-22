package strings;

import java.util.Arrays;

public class AnagramSubStrings
{
	public static void main(String args[])
	{
		System.out.println(anagram("fdhlvosfpafhalll"));
	}
	
	static int anagram(String s)
	{
		if(s.length()%2==1)
			return -1;
		
		int n=s.length()/2;
		String s1=s.substring(0,n);
		String s2=s.substring(n);
		
		System.out.println(s1);
		System.out.println(s2);
		
		int[] c1=new int[26];
		int[] c2=new int[26];
		
		
		int count=0;
		
		for(int i=0;i<s1.length();i++)
		{
			int val=s1.charAt(i)-97;
			c1[val]++;
			val=s2.charAt(i)-97;
			c2[val]++;
		}
		
		for(int i=0;i<c2.length;i++)
		{
			if(c2[i]!=0)
			{
				if(c2[i]>c1[i])
					count=count+c2[i]-c1[i];
				
			}
		}
		return count;

    }
}
