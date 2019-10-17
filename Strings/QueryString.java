package strings;

import java.util.HashMap;

public class QueryString {

	public static void main(String[] args) 
	{
			String s[]= {"aba","baba","aba","xzxb"};
			String[] q= {"aba","xzxb","ab"};
					
			matchingStrings(s,q);		
								

	}
	
	static int[] matchingStrings(String[] strings, String[] queries) 
	{
	        HashMap<String, Integer> hm=new HashMap<>();
	        int[] ret=new int[queries.length];
	        
	        for(int i=0;i<strings.length;i++)
	        {
	        	if(hm.containsKey(strings[i]))
	        	{
	        		int v=hm.get(strings[i]);
	        		v++;
	        		hm.put(strings[i],v);
	        	}
	        		
	        	else
	        		hm.put(strings[i],1);
	        }
	        
	        
	        for(int i=0;i<queries.length;i++)
	        {
	        	String s=queries[i];
	        	if(hm.containsKey(s))
	        		ret[i]=hm.get(s);
	        	else
	        		ret[i]=0;
	        }
	        
	        return ret;
	}

}
