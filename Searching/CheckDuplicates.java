
/*
Given an array of n numbers,give an algorithm for checking whehter there are any duplicates in thearray or not.


Brute Force Solution will take order of n^2 
But if we sort the elements first n then check then it will take worst O(nLogn)
*/


import java.lang.Math;

public class CheckDuplicates
{
	public static void main(String args[])
	{
		int[] a={1,2,3,4,5,6,3,7,8,9,1};
		print(a);
		//checkdupli(a);
		//checkDup(a);
		//print(a);

		checkDupl2(a);

		int[] b={1,2,3,4,5,6,7,8,9};
		print(b);
		
		//checkDupl2(a);
		
		//checkdupli(b);
	}

	// Complexity-O(n^2)

	public static void checkdupli(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					System.out.println("duplicates exists "+a[i]);
			}
			
		}
	}


	//O(nlogn)
	
	public static void checkDup(int[] a)
	{
		MergerSortAlgo ms=new MergerSortAlgo();
	
		ms.mergesort(a,0,a.length-1);

		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
				System.out.println("Duplicates exits : "+a[i]);
		}
	
	}

	/*
		Improvisd algorithm with assumption that the elements of the array are +ve and are in the range 
		0 to n-1
		O(n)
	*/

	public static void checkDupl2(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.println("Duplicates exits "+a[i]);
				
			}			
			else
				a[a[i]]=-a[a[i]];
		}
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
