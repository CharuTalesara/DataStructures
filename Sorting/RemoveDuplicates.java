


public class RemoveDuplicates
{
	public static void main(String args[])
	{
		int[] a={1,1,1,1,2,3,3,3,4,4,5,5,5,6,7,7,8};

		print(a,a.length);

		print(a,removedup(a));

	}

	public static int removedup(int[] a)
	{
		int lastindex=1;

		for(int i=1;i<a.length;i++)
		{
			if(a[i]!=a[i-1])
			{		
				a[lastindex]=a[i];
				lastindex++;
			}
		}

		System.out.println(lastindex);		

		return lastindex;
	}

	public static void print(int[] a,int len)
	{
		for(int i=0;i<len;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
