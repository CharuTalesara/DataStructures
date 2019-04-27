/*
An element is a majority if it appears more than n/2 times.
Give an algorithm that takes an array of n elements as argument and identiifies a majority if it exists.
*/
/*
Algorithm 1 :- Sort n count -O(nlogn)
Algorithn 2 : - Since the number appeared more than n/2 times ..it has to be a median of the array
		Calculate the median in O(n) time n the count its occurance in O(n) time 

*/

public class CheckMajority
{
	public static void main(String args[])
	{
		int[] b={0,1,2,3,1,2,3,4,3,3,3,3,1,3};//n=14, 3=7times	
		int[] a={0,1,2,3,3,2,3,4,3,3,3,3,1,3};//n=14, 3=8times	
		int[] c={0,1,2,2,3,4,3,3,3,3,1,3};

		System.out.println(findMajority(a));
		System.out.println(findMajority(b));
	}
		System.out.println(findMajority(c));

	public static int findMajority(int[] a)
	{
		int maj=-1;
		
		print(a);

		QuickSortAlgo mg=new QuickSortAlgo();
		mg.quickSort(a,0,a.length-1);
		print(a);

		int count_maj=0;
		int count_local=0;

		for(int i=1;i<a.length;i++)
		{
			if(a[i]==a[i-1])
				count_local++;
			else
			{
				if(count_maj<count_local)
					count_maj=count_local;	
				count_local=1;
			}			
		}

		if(count_maj>a.length/2)
			return count_maj;
		System.out.println(count_maj);

		return maj;
	}

	public static void print(int[] a)
	{
		System.out.println("***************");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
