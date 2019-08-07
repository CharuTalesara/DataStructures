package strings;

/*
 * A string is said to be funny if on reversing the string the array of diff of ascii values is same.
 * 
 */


public class funnyString {

	public static void main(String[] args)
	{
		//System.out.println(isFunny("abc"));
		System.out.println(isFunny("acxz"));
	}
	
	public static String isFunny(String s)
	{
		int[] as=new int[s.length()];
		int[] revas=new int[s.length()];
		int[] def=new int[as.length-1];
		int[] revdef=new int[as.length-1];
		
		for(int i=0;i<s.length();i++)
		{
			as[i]=s.charAt(i);
			revas[s.length()-i-1]=s.charAt(i);
		}

		for(int i=0;i<as.length-1;i++)
		{
			def[i]=Math.abs(as[i+1]-as[i]);
			revdef[i]=Math.abs(revas[i+1]-revas[i]);
		}
		
		for(int i=0;i<def.length;i++)
		{
			if(def[i]!=revdef[i])
				return "Not Funny";
		}		
		
		return "Funny";
	
	}

}
