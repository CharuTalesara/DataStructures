package strings;

import java.util.HashMap;

/*
 * Harold is a kidnapper who wrote a ransom note, but now he is worried it will
 *  be traced back to him through his handwriting. He found a magazine and wants to
know if he can cut out whole words from it and use them to create an untraceable 
replica of his ransom note. The words in his note are case-sensitive and he must use
 only whole words available in the magazine. He cannot use substrings or concatenation
  to create the words he needs.

Given the words in the magazine and the words in the ransom note,
 print Yes if he can replicate his ransom note exactly using whole words from 
 the magazine; otherwise, print No.

For example, the note is "Attack at dawn". The magazine contains only "attack at dawn". The magazine has all the right words,
 but there's a case mismatch. The answer is .
 */

public class RansomNotes {

	public static void main(String[] args)
	{
//		String[] magazine= {"give","me","one","grand","today","night"};
//		String[] note= {"give","one","grand","today"};
//		
		String[] magazine= {"two","times","three","is","not","four"};
		String[] note= {"two","times","two","is","four"};
		
		checkMagazine(magazine,note);
	}

	static void checkMagazine(String[] magazine, String[] note) 
	{
		HashMap<String, Integer> dict=new HashMap<>();
		
		for(int i=0;i<magazine.length;i++)
		{
			if(dict.containsKey(magazine[i]))
			{
				int count=dict.get(magazine[i]);
				count++;
				dict.put(magazine[i],count);
			}
			else
			{
				dict.put(magazine[i],1);
			}
		}
		
		for(int i=0;i<note.length;i++)
		{
			String key=note[i];
			if(dict.containsKey(key))
			{
				int count=dict.get(key);
				if(count<=0)
				{
					System.out.println("No");
					return;
				}
				count=count-1;
				dict.put(key,count);
			}
			else
			{
				System.out.println("No");
				return;
			}
		}
		
		System.out.println("Yes");

    }
}
