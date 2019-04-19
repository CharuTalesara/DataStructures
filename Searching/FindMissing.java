/*
Finding the missing number -  We are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in the list. One of the integers is missing in the list. Give an algorithm to find the missing integer.

eg- i.p- 1 2 4 6 3 7 8 
o/p-5

Algo 1- Sort n check - O(nlogn)
Algo 2 - get the summation n substract every ele -O(n)
*/

public class FindMissing
{
	public static void main(String args[])
	{
		int[] a={1,2,4,6,3,7,8};
		print(a);	
		//System.out.println("Missing ele : "+missing(a));

		

		System.out.println("Missing ele : "+missingEle(a));
		
	}


	// O(nlogn)

	public static int missing(int[] a)
	{
		MergerSortAlgo ms=new MergerSortAlgo();
	
		ms.mergesort(a,0,a.length-1);

		int i=0;

		while(i<a.length)
		{
			if(a[i]!=i+1)
				return i+1;
			i++;
		}
		
		return -1;
	}

	public static int missingEle(int[] a)
	{
		int n=a.length;
		int sum=((n+2)*(n+1))/2;
		
		for(int i=0;i<n;i++)
		{
			sum=sum-a[i];
		}

		return sum;
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();		
	}
}
