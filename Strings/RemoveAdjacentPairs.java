package strings;

/*
 * Given a string ABCCBCBA give an algorithm for recursively removing the adjacent chars if they are the same
 * eg- ABCCBCBA-ACBA
 * 
 */

public class RemoveAdjacentPairs {

	public static void main(String[] args)
	{
		char[] c= {'A','B','C','C','B','C','B','A'};
		int j=removeadj(c);

		for(int i=0;i<=j;i++)
			System.out.print(c[i]);
	}
	
	public static int removeadj(char[] s)
	{
		int j=0;
		for(int i=0;i<s.length-1;i++)
		{
			if(s[i+1]!=s[i])
			{
				if(s[j]!=s[i+1])
				{
					s[j+1]=s[i+1];
					j++;
				}
				else
					j--;
			}
			else
				j--;
		}
		return j;
	}

}
