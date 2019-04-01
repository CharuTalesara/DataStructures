
/*
We know the range of the elements
We know the elements are integers

Works best when the range of integers to be sorted isnt too wide that is not greater than the number of elements.
Generally it works best for the smaller intergers

Non recursive 

Non comparison 

inplace-No

Time complexity-O(n+k)
	where n=no. of elements in the array to be sorted
	k= range of elements to be sorted

*/

public class CountingSort
{
	public static void main(String args[])
	{
		int[] a={1,4,1,2,7,5,2};
		print(a);
		
		sort(a,7);
			
		int[] c={9,4,1,7,9,1,2,0};
		print(c);
		sort(c,9);
		
	
		int[] b={3,6,1,2,0,5,8,9,4,7};
		print(b);
		sort(b,9);	
	}

	public static int[] sort(int[] a,int range)
	{
		int[] count_a=new int[range+1];

		for(int i=0;i<a.length;i++)
		{
			count_a[a[i]]++;
		}

		//print(count_a);	

		for(int i=1;i<count_a.length;i++)
		{
			count_a[i]=count_a[i]+count_a[i-1];
		}

		//print(count_a);

		int[] a_sort=new int[a.length];

		for(int i=0;i<a.length;i++)
		{
			a_sort[count_a[a[i]]-1]=a[i];
			count_a[a[i]]--;
		}

		
		print(a_sort);
			

		return a_sort;
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
