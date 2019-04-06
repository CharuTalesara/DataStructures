


public class CheckDuplicates
{
	public static void main(String args[])
	{
		int[] a={1,2,3,4,5,3,2,7,8,9};
		print(a);

		System.out.println("Does a has duplicates "+checkdup(a));

		
		int[] b={1,2,3,4,5};
		print(b);

		System.out.println("Does b has duplicates "+checkdup(b));

		System.out.println(checkdup2(a));
		System.out.println(checkdup2(b));

	}

	// O(n^2)

	public static boolean checkdup(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					return true;
			}
		}

		return false;
	}

	//O(nlogn)

	public static boolean checkdup2(int[] a)
	{
		QuickSortAlgo q=new QuickSortAlgo();
		q.quickSort(a,0,a.length-1);
		print(a);

		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
				return true;
		}
		return false;

		
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();

		
	}
}
