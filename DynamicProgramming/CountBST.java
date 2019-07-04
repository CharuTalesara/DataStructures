

public class CountBST
{
	public static void main(String args[])
	{
		print(countBSTsForN(5));	
	}

	public static int[] countBSTsForN(int n)
	{
		int[] nos=new int[n+1];
		
		nos[0]=1;
		nos[1]=1;

		for(int i=2;i<=n;i++)
		{
			nos[i]=0;
			for(int j=0;j<i;j++)
			{
				nos[i]=nos[i]+nos[j]*nos[i-j-1];
			}
		}

		return nos;
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
