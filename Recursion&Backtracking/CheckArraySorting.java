public class CheckArraySorting
{
	public static void main(String args[])
	{
		int[] a={1,2,3,4,5,6,7,8};
		System.out.println("Is a sorted : "+isArraySorted(a,a.length-1));
		int[] b={1,2,0,4,5,6,7,8};
		System.out.println("Is b sorted : "+isArraySorted(b,b.length-1));	
	}
	

	// Time complexity-O(n)..space complexity -O(n) for recursive stack space.
	public static boolean isArraySorted(int[] a,int index)
	{
		if(a.length==1 || index==0)
		{
			return true;
		}
		else
		{
			if(a[index]>a[index-1])
				return isArraySorted(a,index-1);
			else
				return false;
		}
	}
}


