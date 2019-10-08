package dp;

public class MaxSumIncreaseSubsequence {

	public static void main(String[] args) 
	{
		int[] a= {1,101,2,3,100,4,5};
		System.out.println(maxSumSubseq(a));
		
		int[] b= {3,4,5,10};
		System.out.println(maxSumSubseq(b));
	}
	
	public static int maxSumSubseq(int[] a)
	{
		int[] c=new int[a.length];
		
		for(int i=0;i<a.length;i++)
			c[i]=a[i];
		
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[j]<=a[i])
					c[i]=c[i]+a[j];
			}
		}
		
		int max=c[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<c[i])
				max=c[i];
			System.out.print(c[i]+" ");
		}
		System.out.println();
		
		return max;
	}

}
