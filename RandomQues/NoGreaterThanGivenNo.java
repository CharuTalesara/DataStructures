import java.util.Arrays;


public class NoGreaterThanGivenNo
{
	public static void main(String[] args)
	{
		int[] b= {4,3,6,1};
		int[] a= {4,3,6,5,1};
		print(a);
		print(leastgreaterNo(a));
		print(b);
		print(leastgreaterNo(b)); // required o/p-5467
	}
	
	public static int[] leastgreaterNo(int[] a)
	{
		int j=a.length-1;
		
		for(;j>0;j--)
		{
			if(a[j]>a[j-1])
			{
				int min_index=findLeastgreaterIndex(a,j-1);
				if(min_index==-1)
					return a;
				int temp=a[j-1];
				a[j-1]=a[min_index];
				a[min_index]=temp;
				sortSubarray(a,j);
				return a;
			}
		}
		return a;
	}
	
	public static int findLeastgreaterIndex(int[] a,int index)
	{
		if(index>=a.length-1)
			return -1;
		int min=a[a.length-1];
		int min_index=index;
		for(int i=index+1;i<a.length;i++)
		{
			if(a[i]>a[index])
			{
				min=a[i];
				min_index=i;
			}
		}
		return min_index;
	}
	
	public static int[] sortSubarray(int[] a,int i)
	{
		if(i>=a.length)
			return null;
		for(;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		return a;
	}
	
	public static void print(int[] a)
	{
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		System.out.println();
	}
}
