package strings;

public class ReverseString {

	public static void main(String[] args) 
	{
		System.out.println(reverse("abced"));
	}
	
	public static String reverse(String s)
	{
		StringBuffer rev=new StringBuffer();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev.append(s.charAt(i));
		}
		String ret=""+rev.toString();
		
		return ret;
	}

}
