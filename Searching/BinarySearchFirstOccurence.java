/*
Given a sorted array a of n elements,possibly with duplicates, find the index of the first occurence of the elelemt in O(logn) time 
*/


public class BinarySearchFirstOccurence
{
	public static void main(String args[])
	{
		int[] a={0,0,1,1,1,1,2,3,3,3,4,5,5,6,6,7,8,9,9};
		print(a);

		int key=1;
		System.out.println("First Ocuurence : "+key+" index : "+bsearch(a,key,0,a.length-1));	

		key=5;
		System.out.println("First Ocuurence : "+key+" index : "+bsearch(a,key,0,a.length-1));	
		
		key=6;
		System.out.println("First Ocuurence : "+key+" index : "+bsearch(a,key,0,a.length-1));	

		key=9;
		System.out.println("First Ocuurence : "+key+" index : "+bsearch(a,key,0,a.length-1));	
	}

	public static int bsearch(int[] a,int key,int low,int high)
	{
		if(low>high)
			return -1;

		else
		{
			int mid=(low+high)/2;
		
			if(a[mid]==key && a[mid]>a[mid-1])
				return mid;

			else if(a[mid]>=key)
				return bsearch(a,key,low,mid-1);
			else
				return bsearch(a,key,mid+1,high);
		}
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		for(int i=0;i<a.length;i++)
			System.out.print(i+" ");
		System.out.println();
	}
}
