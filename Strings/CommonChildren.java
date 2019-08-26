package strings;

/*
 * A string is said to be a child of a another string if it can be formed by deleting 0 or more characters
 *  from the other string. Given two strings of equal length, what's the longest string that can be constructed 
 *  such that it is a child of both?

For example, ABCD and ABDC have two children with maximum length 3, ABC and ABD. 
They can be formed by eliminating either the D or C from both strings. Note that we will not consider ABCD as a 
common child because we can't rearrange characters and ABCD  ABDC.
 */

public class CommonChildren {

	public static void main(String[] args) 
	{
		System.out.println(commonChild("HARRY","SALLY"));
		System.out.println(commonChild("AA","BB"));
		System.out.println(commonChild("SHINCHAN","NOHARAAA"));
	}
	
	static int commonChild(String s1, String s2)
	{
		int n=s1.length();
		
		int[][] c=new int[n+1][n+1];
		
		for(int i=0;i<=n;i++)
		{
			c[i][0]=0;
			c[0][i]=0;
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(s1.charAt(i-1)==s2.charAt(j-1))
					c[i][j]=c[i-1][j-1]+1;
				else if(c[i-1][j]>c[i][j-1])
					c[i][j]=c[i-1][j];
				else
					c[i][j]=c[i][j-1];
			}
		}
		
		return c[n][n];

	}

}
