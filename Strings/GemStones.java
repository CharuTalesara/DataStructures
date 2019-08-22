package strings;

public class GemStones
{

	public static void main(String[] args)
	{
		String[] arr= {"abcdde","baccd","eeabg"};
		int a='a'-97;
		System.out.println(gemstones(arr));
	}
	
	 static int gemstones(String[] arr) 
	 {
		int[] countChar=new int[26];
		
		for(int i=0;i<26;i++)
			countChar[i]=-1;
		
		for(int i=0;i<arr[0].length();i++)
		{
			int a=arr[0].charAt(i)-97;
			if(countChar[a]==-1)
				countChar[a]=1;
		}
		 
		for(int i=1;i<arr.length;i++)
		{
			int j=0;
			while(j<arr[i].length())
			{
				int c=arr[i].charAt(j)-97;
				if(countChar[c]==-1)
				{	
					j++; 
					continue;
				}
				else
				{
					if(countChar[c]==i)
						countChar[c]++;
				}
				j++;
			}
		}
		
		int count=0;
		for(int i=0;i<countChar.length;i++)
		{
			if(countChar[i]==arr.length)
				count++;
		}

		return count;
	 }

}
