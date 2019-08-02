package strings;

public class Anagrams {

	public static void main(String[] args)
	{
//		permutation("","charu");
		permutation("","abc");
	}
	
	public static void permutation(String prefix,String s)
	{
		if(s.length()==0)
			System.out.println(prefix);
		else
		{
			for(int i=0;i<s.length();i++)
			{
				permutation(prefix+s.charAt(i),s.substring(0,i)+s.substring(i+1));
			}
		}
			
	}

}
