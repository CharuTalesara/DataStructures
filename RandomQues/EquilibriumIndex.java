
/*
 * Equilibrium index of an array is the index k such that sum of ele from 0 to k-1 = sum from k+1 to n
 * 
 * 
 */


public class EquilibriumIndex {

	public static void main(String[] args)
	{
		int[] a= {-7,1,5,2,-4,3,0};

		print(a);
		System.out.println(equiIndex(a));
		
	}
	
	public static int equiIndex(int[] a)
	{
		int sumleft=0;
		int sumright=-1;
		
		for(int i=1;i<a.length-1;i++)
		{
			for(int j=i-1;j>=0;j--)
				sumleft=sumleft+a[j];
			for(int k=i+1;k<a.length;k++)
				sumright=sumright+a[k];
			if(sumleft==sumright)
				return i;
			else
			{
				sumleft=0;
				sumright=0;
			}
		}
		
		return -1;
	}
	
	
	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}

}
