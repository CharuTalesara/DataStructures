package strings;

import java.util.ArrayList;
import java.util.List;

public class WeightedUnifromStrings
{
	public static void main(String args[])
	{
		String s="abccddde";
		int[] q={5,6,7,8,12,5};
		String[] ss=isUniformSubStringSum(s,q);
		
		for(int i=0;i<ss.length;i++)
			System.out.println(ss[i]);
		
		//System.out.println(Character.getNumericValue('a'));
	}
	
	public static  String[] isUniformSubStringSum(String s,int[] q)
	{
		int[] sub=new int[s.length()];
		
		//System.out.println(Character.getNumericValue('a'));
		
		sub[0]=Character.getNumericValue(s.charAt(0));
		sub[0]=sub[0]-9;
		
		for(int i=1;i<s.length();i++)
		{
			int n=Character.getNumericValue(s.charAt(i));
			n=n-9;
			if(s.charAt(i)==s.charAt(i-1))//n==sub[i-1])
				sub[i]=n+sub[i-1];
			else
				sub[i]=n;
		}
		
		for(int i=0;i<sub.length;i++)
			System.out.println(sub[i]);
		
		String[] ret=new String[q.length];
		
		for(int i=0;i<q.length;i++)
		{
			for(int j=0;j<sub.length;j++)
			{
				if(sub[j]==q[i])
				{
					ret[i]="Yes";
					break;
				}
			}
		}
		
		for(int i=0;i<q.length;i++)
		{
			if(ret[i]==null)
				ret[i]="No";
		}
		
		return ret;
	}
}
