
/*
Given 3 arrays A,B and C and a no K ; find if there exists an a,b,c such that a+b+c=kbsearch
the algo should have a complexity of O(nlogn)
*/


public class SumToKInArrays
{
	public static void main(String args[])
	{
		int[] a={5,2,3,7,9,10,1,15};
		int[] b={7,3,5,8,10,12,0,1};
		int[] c={2,5,3,1,4,0,9,7};

		checkSum(a,b,c,18);
	}	

	public static boolean checkSum(int[] a,int[] b,int[] c,int k)
	{
		QuickSortAlgo qc=new QuickSortAlgo();
		
		qc.quickSort(a,0,7);
		qc.quickSort(b,0,7);
		qc.quickSort(c,0,7);

		print(a);
		print(b);
		print(c);

		BinarySearch bs=new BinarySearch();


		for(int i=0;i<a.length && a[i]<=k;i++)
		{
			int k1=k-a[i];

			for(int j=0;j<b.length && b[j]<=k1;j++)
			{
				int k2=k1-b[j];
				int c1=bs.bsearch(c,k2);
				if(c1>=0)
				{
					System.out.println("a,b,c "+a[i]+" "+b[j]+" "+c[c1]);
					return true;
				}
			}		

			
		}
		
		return true;
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
