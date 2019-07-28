
public class CountAndSay {

	public static void main(String[] args)
	{
		String[] s=new String[10];
		
		s[0]="1";
		s[1]="11";
		
		for(int i=2;i<s.length;i++)
		{
			int count=1;
			s[i]="";
			int n=i-1;
			for(int j=0;j<s[n].length();j++)
			{
				if(j<s[n].length()-1 && s[n].charAt(j)==s[n].charAt(j+1))
				{
					count++;
				}
				else
				{
					s[i]=s[i]+count+s[n].charAt(j);
					count=1;
				}
			}
		}
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}

}
