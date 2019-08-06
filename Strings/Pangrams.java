package strings;

public class Pangrams 
{
	public static void main(String args[])
	{
		String s="we promptly judged antique ivory buckles for the next prize";
		 
		System.out.println(isPangram(s));
	}
	
	public static String isPangram(String s)
	{
		int[] a=new int[26];
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
					int n=Character.getNumericValue(s.charAt(i));
					n=n-10;
					a[n]=1;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
				return "not pangram";
		}
		return "pangram";
	}
}
