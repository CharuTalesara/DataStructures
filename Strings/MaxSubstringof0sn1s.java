package strings;

public class MaxSubstringof0sn1s {

	public static void main(String[] args)
	{
		String s="001011100000111111111000011111111111100000000000000";
		maxSubstring(s);
	}
	
	public static void maxSubstring(String s)
	{
		int cur_count=1;
		int max_count=1;
		int max=Integer.parseInt(s.charAt(0)+"");
		
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==s.charAt(i-1))
				cur_count++;
			else
			{
				if(max_count<cur_count)
				{
					max_count=cur_count;
					max=Integer.parseInt(s.charAt(i-1)+"");
				}
				cur_count=1;
			}
		}
		if(max_count<cur_count)
		{
			max_count=cur_count;
			max=Integer.parseInt(s.charAt(s.length()-1)+"");
		}
		
		System.out.println(max+" "+max_count);
	}

}
