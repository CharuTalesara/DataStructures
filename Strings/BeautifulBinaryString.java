package strings;

public class BeautifulBinaryString
{

	public static void main(String[] args)
	{
		System.out.println(beautifulBinaryString("0101010"));
		System.out.println(beautifulBinaryString("01100"));
		System.out.println(beautifulBinaryString("0100101010"));
	}
	
	static int beautifulBinaryString(String b)
	{
		int count=0;
		//char[] c=b.toCharArray();
		
		if(!b.contains("010"))
			return count;
		
		int i=0;
		
		while(i<b.length()-2)
		{
			String substr=b.substring(i,i+3);
			if(!substr.equals("010"))
			{
				i++;
			}
			else
			{
				count++;
				i=i+3;
			}
		}
		return count;
    }

}
