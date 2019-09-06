package dp;

public class LongestPalindromSubstring {

	public static void main(String[] args) 
	{
		String s="geeksskeegll";
		s="babcbab";
		System.out.println(longestPalindrome(s));

	}
	
	public static int longestPalindrome(String s)
	{
		int[][] c=new int[s.length()][s.length()];
		
		
		//Subsequence of length 1 has palindrome seq of length 1 
		for(int i=0;i<s.length();i++)
			c[i][i]=1;
		
		
		// Subsequence of length 2 have both chars same has palindrome seq of length2
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
				c[i][i+1]=2;
			else
				c[i][i+1]=1;
		}
		
		int diff=2;
		
		for(int i=0;i<s.length();i++)
		{
			int k=0;
			for(int j=diff;j<s.length();j++)
			{
				if(s.charAt(k)==s.charAt(j))
					c[k][j]=2+c[k+1][j-1];
				else
					c[k][j]=Math.max(c[k][j-1],c[k+1][j]);
				k++; 
			}
			diff++;
		}
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}
		
		return c[0][s.length()-1];
	}

}
