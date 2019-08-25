package strings;

public class MarsExploration {

	public static void main(String[] args) 
	{
		System.out.println(marsExploration("SOSSOT"));

	}
	
	static int marsExploration(String s)
	{
		int n=s.length();
		String req="SOS";
		
		int i=0;
		int changed=0;
		
		while(i<s.length())
		{
			String str=s.substring(i);
			if(str.equals("SOS"));
//			{
//				i=i+3;
//				continue;
//			}
			else
			{
				if(str.charAt(0)!='S')
					changed++;
				if(str.charAt(1)!='O')
					changed++;
				if(str.charAt(2)!='S')
					changed++;
				
			}
			i=i+3;
		}

		return changed;
    }

}
