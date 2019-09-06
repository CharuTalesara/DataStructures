package arrays;

import java.util.HashMap;

public class GivenSumNeggInts {

	public static void main(String[] args)
	{
		 int[] arr = {10, 2, -2, -20, 10}; 
	     int n = arr.length; 
	     int sum = -10; 
	     subaryForgivenSum(arr, sum);
	     
	    int[]  a= {-2,-3,4,-1,-2,1,5,-3};
	     sum=7;
	     subaryForgivenSum(a, sum);
	     
	}
	
	public static void subaryForgivenSum(int[] a,int sum)
	{
		int cur_sum=0;
		int start=0;
		int end=-1;
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			cur_sum=cur_sum+a[i];
			
			int req=cur_sum-sum;
			
			if(req==0)
			{
				end=i;
				break;
			}
			
			if(!map.containsKey(req))
				map.put(cur_sum,i);
			else
			{
				start=map.get(req)+1;
				end=i;
				break;
			}
		}
		System.out.println("Started at  : "+start+" ended at : "+end);
		return;
	}

}
