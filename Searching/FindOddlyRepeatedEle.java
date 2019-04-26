/*
Given an array of 101 elements, 25 elemets are repeated twice, 12 elemets are repeated 4 times n one element is repeated 3 times.
Find the elemt which repeates 3 times
*/


public class FindOddlyRepeatedEle
{
	public static void main(String args[])
	{
		int[] a={1,3,5,5,3,2,7,2,7,2,1,2,1};
		int x=0;

		for(int i=0;i<a.length;i++)
		{
			x=x^a[i];
		}	
		
		System.out.println(x);
	}

	
}
