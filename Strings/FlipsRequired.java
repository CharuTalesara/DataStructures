package strings;

public class FlipsRequired {

	public static void main(String[] args)
	{
		System.out.println(flipsCount("0011"));
		System.out.println(flipsCount("011000"));
	}
	
	public static int flipsCount(String s)
	{
		int count=0;
		boolean b;
		if(s.charAt(0)=='0')
			b=true;
		else
			b=false;
		
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0 && s.charAt(i)=='1')
				count++;
			else if(i%2==1 && s.charAt(i)!='1')
				count++;
		}
		
		return count;
	}

}
