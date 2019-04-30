/*
Given an array of n elements design an O(logn) algorthm to find a local minimum an idex i such that
a[i-1]<=a[i]<=a[i+1]

*/



public class LocalMinimum
{
	public static void main(String args[])
	{
		int[] a={1,3,2,0,5,4,8,10,8,9,1};
		print(a);
		localmin(a);
	}

	//O(n)
	public static void localmin(int[] a)
	{
		int min=-1;
		for(int i=1;i<a.length-1;i++)
		{
			if((a[i-1]<=a[i]) && a[i]<=a[i+1])
			{
				min=i;
				break;
			}
		}
		System.out.println(min+" "+a[min]);
	}

	public  static void print(int[] a)
	{
		for(int  i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
