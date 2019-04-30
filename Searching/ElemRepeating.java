/*
In an array number are there anging from 1 to n.
n-1 elements are repeating thrice and 1 ele is repeating twice
Find that ele.

*/


public class ElemRepeating
{
	public static void main(String args[])
	{
		int[] a={1,2,3,3,2,2,1,1};
		System.out.println(find(a,3));
		System.out.println(findbyXor(a,3));
	}

	public static int findbyXor(int[] a,int n)
	{		
		int xor=0;
		for(int i=0;i<a.length;i++)
			xor=xor^a[i];
		for(int i=1;i<=n;i++)
			xor=xor^i;
		return xor;
	}

	public static int find(int[] a,int n)
	{
		int[] count=new int[n+1];
		int even=-1;

		for(int i=0;i<a.length;i++)
			count[a[i]]++;

		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0 && count[i]%2==0)
				even = i;
		}

		return even;	
	}		
}
