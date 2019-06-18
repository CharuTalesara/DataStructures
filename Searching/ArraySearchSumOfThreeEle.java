/*
given an arrya of n elements; find 3 elements in the array such that their sum is equal to the given sum.
*/


public class ArraySearchSumOfThreeEle
{	
	public static void main(String args[])
	{
		int[] a={5,3,7,6,1,9,8,0,2,4};
		bruteForce(a,13);
		System.out.println("***********");
		search(a,13);	
	}

	public static void search(int[] a,int sum)
	{
		MergerSortAlgo ms=new MergerSortAlgo();
	
		ms.mergesort(a,0,a.length-1);

		int n=a.length;
		
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1,k=n-1;j<k;)
			{
				int temp=a[i]+a[j]+a[k];
				
				if(temp<sum)
					j++;
				else if(temp>sum)
					k--;
				else
				{
					System.out.println(a[i]+" +"+a[j]+" +"+a[k]+" ="+sum);
					j++;
					k--;
				}
			}
		}
	}

	public static void bruteForce(int[] a,int sum)
	{
		int n=a.length;

		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==sum)
					{
						System.out.println(a[i]+" +"+a[j]+" +"+a[k]+" ="+sum);
					}
				}
			}
		}	
	}
}
