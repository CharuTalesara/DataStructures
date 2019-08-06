package strings;

public class Pangrams 
{
	public static void main(String args[])
	{
		String s="we promptly judged antique ivory buckles for the next prize";
		
		//System.out.println(Character.getNumericValue('a'));
		System.out.println(isPangram(s));
	}
	
	public static String isPangram(String s)
	{
		int[] a=new int[26];
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
//				if(Character.isUpperCase(s.charAt(i)))
//				{
//					int n=Character.getNumericValue(s.charAt(i));
//					System.out.println(n);
//					n=n-65;
//					a[n]=1;
//				}
//				else
//				{
					int n=Character.getNumericValue(s.charAt(i));
					System.out.println("***");
					System.out.println(s.charAt(i)+" "+n);
					n=n-10;
					a[n]=1;
				//}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			//System.out.print(a[i]+" ");
			if(a[i]==0)
				return "not pangram";
		}
		return "pangram";
	}
}
