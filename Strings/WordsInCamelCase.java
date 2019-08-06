package strings;

public class WordsInCamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(camelcase("noWordsRequired"));
		
	}
	
	static int camelcase(String s)
	{
        if(s==null)
            return 0;
        int count=1;

        for(int i=1;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
                count++;
        }

        return count;

	}
}
