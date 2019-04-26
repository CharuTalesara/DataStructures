/*
Sort an array of 0s 1s n 2s / RGBs
Given an array of 0,1,2s give an algo to segregate 0s first, then all 1s and then all 2s 
*/


public class Sorting012s
{
	public static void main(String args[])
	{
		int a[]={0,1,1,0,1,2,1,2,0,0,0,2,2};
		print(a);
		segregateInOn(a);
		print(a);
	}
	

	public static void segregateInOn(int[] a)
	{
		int i=0;
		int j=0;
		int k=a.length-1;

		while(j<=k)
		{
			switch(a[j])
			{
				case 0 : int temp=a[j];
					 a[j]=a[i];		
				 	 a[i]=temp; 
					 j++;
					 i++;
					 break;

				case 1 : j++;
					 break;

				case 2 : int temp1=a[j];
					 a[j]=a[k];
					 a[k]=temp1;
					 k--;			
					 break;		
			}	
		}
	}

	//O(nlogn)

	public static void segregate(int[] a)
	{
		MergerSortAlgo ag=new MergerSortAlgo();
		ag.mergesort(a,0,a.length-1);
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
