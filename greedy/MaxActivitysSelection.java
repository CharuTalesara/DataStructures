package greedyalgorithms;

import java.util.ArrayList;

/*
 * Max activity that can be selected ..
 * input -start time n finish time of the activities 
 * finish time being sorted
 */

public class MaxActivitysSelection
{

	public static void main(String[] args) 
	{
		int[] s= {1,3,0,5,3,5,6,8,8,12,12};
		int[] f= {4,5,6,7,9,9,10,11,12,14,16};
		max_acti_select(s,f);
	}
	
	public static void max_acti_select(int[] s,int[] f)
	{
		int n=s.length;
		ArrayList<Integer> set=new ArrayList<Integer>();
		set.add(0);
		
		int k=0;
		for(int i=1;i<n;i++)
		{
			if(s[i]>=f[k])
			{
				set.add(i);
				k=i;
			}
		}
		
		System.out.println(set);
	}

}
