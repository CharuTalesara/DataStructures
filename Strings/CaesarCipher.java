package strings;

public class CaesarCipher {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub 	

		String s="abcdefghijk_mnopqrstuvwxyz";

		System.out.println(s);
		
		char[] ss=s.toCharArray();
		System.out.println(encrypt(s,3));
		
	}
	
	public static String encrypt(String s,int k)
	{
		String ret="";
		
		for(int i=0;i<s.length();i++)
		{			
			char n=s.charAt(i);
			
			if(!Character.isAlphabetic(n))
			{
				ret=ret+n;
				continue;
			}
			
			if(Character.isUpperCase(n))
				ret=ret+(char)((n+k-65)%26+65);
	
			if(Character.isLowerCase(n))
				ret=ret+(char)((n+k-97)%26+97);
		}
		
		return ret;
	}

}
