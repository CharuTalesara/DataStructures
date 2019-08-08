
package strings;

import java.util.ArrayList;

public class TwoStringsShareSubString
{
	public static void main(String args[])
	{
		System.out.println(twoStrings("hello","world"));
	}
	
	 static String twoStrings(String s1, String s2)
	 {
//		 for(int i=0;i<s1.length();i++)
//		 {
//			 for(int j=0;j<s2.length();j++)
//			 {
//				 if(s1.charAt(i)==s2.charAt(j))
//					 return "YES";
//			 }
		 
		 
		 ArrayList<Integer> arr=new ArrayList<Integer>();
		 for(int i=0;i<s2.length();i++)
		 {
			 int c=s2.charAt(i);
			 if(arr.contains(c))
				 continue;
			 else
				 arr.add(c);
		 }
		 
		 for(int i=0;i<s1.length();i++)
		 {
			 int c=s1.charAt(i);
			 if(arr.contains(c))
				 return "YES";
		 }

		 return "NO";
	 }
}
