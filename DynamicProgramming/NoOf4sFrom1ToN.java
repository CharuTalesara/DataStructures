

import java.io.*; 
  
class NoOf4sFrom1ToN
{ 
	public static void main(String args[])
	{
		System.out.println(noOf4sFrom1ToN(5));
		System.out.println(noOf4sFrom1ToN(15));
		System.out.println(noOf4sFrom1ToN(100));
		System.out.println(noOf4sFrom1ToN(623));
		System.out.println(noOf4sFrom1ToN(136));      
     	}

	public static int noOf4sFrom1ToN(int n)
	{
		int fourCount=0;
		
		int i=1;
		while(i<=n)
		{
			fourCount=fourCount+noof4s(i);
			i++;
			
		}
	
		return fourCount;
	}

	public static int noof4s(int no)
	{
		int count=0;

		while(no>0)
		{
			if(no%10>=0)
			{
				if(no%10==4)
					count++;
				no=no/10;
			}
		}

		return count;
	}
} 
