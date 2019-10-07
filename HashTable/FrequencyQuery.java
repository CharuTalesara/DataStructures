package strings;

import java.util.*;

public class FrequencyQuery {

	public static void main(String[] args) {
		// TODO Auto-g
		List<Integer> ll1=new ArrayList<>();
		ll1.add(1);
		ll1.add(5);
		
		List<Integer> ll2=new ArrayList<>();
		ll2.add(1);
		ll2.add(6);
		
		List<Integer> ll3=new ArrayList<>();
		ll3.add(3);
		ll3.add(2);
		
		List<Integer> ll4=new ArrayList<>();
		ll4.add(1);
		ll4.add(10);
		
		List<Integer> ll5=new ArrayList<>();
		ll5.add(1);
		ll5.add(10);
		
		List<Integer> ll6=new ArrayList<>();
		ll6.add(1);
		ll6.add(6);

		List<Integer> ll7=new ArrayList<>();
		ll7.add(2);
		ll7.add(5);
		
		List<Integer> ll8=new ArrayList<>();
		ll8.add(3);
		ll8.add(2);
		
		List<List<Integer>> q=new ArrayList<>();
		q.add(ll1);
		q.add(ll2);
		q.add(ll3);
		q.add(ll4);
		q.add(ll5);
		q.add(ll6);
		q.add(ll7);
		q.add(ll8);
		//q.add(ll2);
		
		List<Integer> ret=freqQuery(q);
		System.out.println(ret);
	}
	
	
	
	static List<Integer> freqQuery(List<List<Integer>> queries)
	{
		int qs = queries.size();
		HashMap<Integer,Integer> ret=new HashMap(qs);
		HashMap<Integer,Set<Integer>> freq=new HashMap();
		List<Integer> retlist=new ArrayList<>();
		
		
		for(List<Integer> list:queries)
		{
			Object[] q=list.toArray();
			
			int op=(Integer)q[0];
			int num=(Integer)q[1];
			
			switch(op)
			{
				case  1 : if(ret.containsKey(num))
						  {
								int value=ret.get(num);
								if(freq.containsKey(value))
								{
									Set s=freq.get(value);
									s.remove(num);
									if(s.size()==0)
										freq.remove(value);
									else
										freq.put(value,s);
								}
								value++;
								ret.put(num,value);
								if(freq.containsKey(value))
								{
									Set<Integer> v=freq.get(value);
									v.add(num);
									freq.put(value,v);
								}
								else
								{
									Set<Integer> s=new HashSet<>();
									s.add(num);
									freq.put(value,s);
								}
						  }
						  else
						  {
							  	ret.put(num, 1);
							  	if(!freq.containsKey(1))
							  	{
							  		Set<Integer> s=new HashSet<>();
									s.add(num);
									freq.put(1,s);
							  	}
							  	else
							  	{
							  		//int value=ret.get(num);
							  		Set<Integer> v=freq.get(1);
									v.add(num);
									freq.put(1,v);
							  	}
							  		
						  }
				          break;
				          
				case  2 : if(ret.containsKey(num))
				 		  {
				 			  if(ret.get(num)<=1)
				 			  {
				 				 ret.remove(num);
				 				 if(freq.containsKey(1))
				 				 {
				 					 Set s=freq.get(1);
				 					 s.remove(num);
				 					 freq.put(1,s);
				 				 }
				 			  }	  
				 			  else
				 			  {
				 				 int val=ret.get(num);
				 				 if(freq.containsKey(val))
				 				 {
				 					 Set s=freq.get(val);
				 					 s.remove(num);
				 					 freq.put(val,s);
				 				 }
				 				 val--;
				 				 ret.put(num,val);
				 				 if(freq.containsKey(val))
				 				 {
				 					 Set<Integer> set=freq.get(val);
				 					 set.add(num);
				 					 freq.put(val,set);
				 				 }
				 				 else
				 				 {
				 					 Set<Integer> set=new HashSet<>();
				 					 set.add(num);
				 					 freq.put(val,set);
				 				 }
				 			  }
				 				  
				 		  }
				 		  break;
				case 3 :  if(freq.containsKey(num))//if(ret.containsValue(num))
					      		retlist.add(1);
					     else
					    	 	retlist.add(0);
				         break;
					      
			}
		}
		
		return retlist;
    }

}
