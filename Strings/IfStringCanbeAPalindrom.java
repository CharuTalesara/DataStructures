package strings;

public class IfStringCanbeAPalindrom 
{

	public static void main(String[] args) 
	{
		int s='a';
		System.out.println(gameOfThrones("cdefghmnopqrstuvw"));// 
	}

	public static String gameOfThrones(String s)
	{
		int[] a=new int[26];
		
		for(int i=0;i<s.length();i++)
		{
			int k=s.charAt(i);
			a[k-97]++;
		}
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				count++;
				if(count>1)
					return "NO";
			}
		}
		
		return "YES";
	}
}
