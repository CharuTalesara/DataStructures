/*
Separate even and odd numbers- Given an array A[], write a function that segregates even n odd. The function should put all even numbers first and then the odds..the order of the numbers is not relevant

eg- i/p- 12 34 45 9 8 90 3
o/p      12 34 90 8 9 45 3

*/

public class SeparateEvenOdd
{
	public static void main(String args[])
	{
		int[] a={12,34,45,9,8,90,3};
		print(a);
		segregate(a);
		print(a);

		int[] b={12,34,45,9,8,90,3};
		print(b);
		segregateUsingQuickSort(b);
		print(b);
	}
	
	//O(n)

	public static void segregate(int[] a)
	{
		int i=0;
		
		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue();

		while(i<a.length)
		{
			if(a[i]%2!=0)
			{
				q.enQueue(i);
				
			}

			else
			{
				if(!q.isEmpty())
				{
					int j=q.dequeue();
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				
				}
				
			}
			i++;
		}
	}


	public static void segregateUsingQuickSort(int[] a)
	{
		int i=-1;
		int j=0;

		for(;j<a.length;j++)
		{
			if(a[j]%2==0)
			{
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
