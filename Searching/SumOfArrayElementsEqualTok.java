

public class SumOfArrayElementsEqualTok
{
	public static void main(String args[])
	{
		int[] a={1,3,2,6,5,4,7,9,8,0};
		findele(a,5);
		findele(a,9);

		//find(a,5);
		find(a,9);
	}


	// Brute Force solution ...O(n^2)

	public static void findele(int[] a,int k)
	{
		int first=-1;
		int second=-1;
		int i=0;
		int j=0;

		for(i=0;i<a.length-1;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==k)
				{
					first=a[i];			
					second=a[j];
					break;
				}
			}

			if(first!=-1 && second !=-1)
				break;
		}

		System.out.println("Sum : "+k+" first : "+a[i]+" second : "+a[j]);
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}


	//O(nlogn)

	public static void find(int[] a,int k)
	{
		int first=-1;
		int second=-1;
		int i=0;

		print(a);
		
		QuickSortAlgo qs=new QuickSortAlgo();
		qs.quickSort(a,0,a.length-1);

		print(a);

		int j=a.length-1;		

		while(i<j)
		{
			int temp=a[i]+a[j];

			if(temp==k)
			{
				first=i;
				second=j;
				System.out.println("Sum : "+k+" first : "+a[i]+" second: "+a[j]);
				return;
			}

			if(temp<k)
				i++;
			else
				j--;	
		}	
	}
}
