package strings;

public class ContainsHackerRankSubSeq {

	public static void main(String[] args) 
	{
		//System.out.println(hackerrankInString("hereiamstackerrank"));
		
		//hackerworld
		System.out.println(hackerrankInString("hereiamstackerrank"));
		System.out.println(hackerrankInString("rhackerank"));
		
		
		System.out.println(hackerrankInString("hhhackkerbanker"));
	}
	
	public static String hackerrankInString(String s) 
	{
		String stofind="hackerrank";
		
		char[] sary=s.toCharArray();
		char[] ssary=stofind.toCharArray();
		
		int k=0;
		
		for(int i=0;i<stofind.length();i++)
		{

			while(k<sary.length && sary[k]!=ssary[i])
			{
				k++;		
			}
			if(k<sary.length && sary[k]==ssary[i])
			{
				if(i==stofind.length()-1 && sary[k]==ssary[i] )
				{
					System.out.println(sary[k]);
					return "YES";
				}		
				k++;
				
			}
		}
	
		
		return "NO";
	}
                  
}
