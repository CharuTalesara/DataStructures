

public class BinarySearch
{
	public static void main(String args[])
	{
		int[] a={0,1,2,3,4,5,6,7,8,9};	
		System.out.println(bsearchrec(a,5,0,9));
		System.out.println(bsearchrec(a,15,0,9));
		System.out.println(bsearchrec(a,8,0,9));
		System.out.println(bsearchrec(a,2,0,9));
		System.out.println(bsearch(a,5));
	}
	
	//Iterative implementation
	public static int bsearch(int[] a,int k)
	{
		int low=0;
		int high=a.length-1;
		do
		{
			int mid=(low+high)/2;
			if(a[mid]==k)
				return mid;
			else
			{
				if(a[mid]<k)
				{
					low=mid+1;
				}
				else
					high=mid-1;
			}
		}while(low<=high);
		return -1;
	}

	//Input array has to be sorted for binary search

	// Recursive implementation
	public static int bsearchrec(int[] a,int k,int low,int high)
	{
		if(low>high)
			return -1;
		else
		{
			int mid=(low+high)/2;
			if(a[mid]==k)
				return mid;
			else
			{
				if(a[mid]>k)
					return bsearchrec(a,k,low,mid-1);
				else
					return bsearchrec(a,k,mid+1,high);
			}
		}
	}

}
