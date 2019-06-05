/*
Pattern Matching - Brute force 
*/

import java.util.*;


public class PatternMatchingBruteForce
{
	public static void main(String args[])
	{
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();

		System.out.println("Enter the pattern you want to match with string "+text);
		String pattern=sc.nextLine();

		//BruteForceStringMatching

		System.out.println("String matched pattern?? : "+BruteForceStringMatching(text,pattern));

		//PatternMatchingRobinKarp
		//System.out.println("String matched pattern?? : "+PatternMatchingRobinKarp(text,pattern));
		PatternMatchingRobinKarp(text,pattern);
	}


	public static boolean BruteForceStringMatching(String text,String pattern)
	{
		int n=text.length();
		int m=pattern.length();

		for(int i=0;i<=n-m;i++)
		{
			int j=0;
			while(j<m && text.charAt(i+j)==pattern.charAt(j))
				j++;
			if(j==m)
				return true;
		}
		return false;
	}

	// Robin Karp Algorithm

	public static void PatternMatchingRobinKarp(String text,String pattern)
	{
		int n=text.length();
		int m=pattern.length();
		
		int q=11; // Randomly taken prime number 
		int d=256; // length of alphabets as char is stored in 8 bits so.. 

		/*
		hash(txt[s+1....s+m])=(d ( hash(txt[s...s+m-1])-txt[s]*h )+txt[s+m])%q
		*/
		 
		// calulate the value of h  = d^(m-1)%q
		int h=1;
		for(int i=0;i<m-1;i++)
			h=(h*d)%q;

		//initialise the hash for pattern and text to be zero

		int p=0;
		int t=0;

		// first calculate the hash of pattern and initial substring of text as they wont have hash of previous string

		for(int i=0;i<m;i++)
		{
			p=(d*p+pattern.charAt(i))%q;
			t=(d*t+text.charAt(i))%q;
		}
		System.out.println("Pattern Hash value "+p);
		for(int i=0;i<=n-m;i++)
		{
			//System.out.println("text Hash value "+t);
			// if the hast value of first substring equals hash of pattern ..check for the characters
			if(p==t)
			{	
				int j=0;
				for(j=0;j<m;j++)
				{
					if(pattern.charAt(j)!=text.charAt(i+j))
						break;
				}
				if(j==m)
					System.out.println("Pattern found at index "+i);
			}

			//if p!=t => slide the window of text by 1 and calculate hash of that

			if(i<n-m)
			{
				t=(d*(t-text.charAt(i)*h)+text.charAt(i+m))%q;
				
				//converting negative of t into positive

				if(t<0)
					t=t+q; 
			}
		}		
		
	}
}
