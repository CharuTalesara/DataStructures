package dp;

public class LongestIncreasingSubSequence {

	public static void main(String[] args) 
	{
		int[] a= {5,6,2,3,4,1,9,9,8,9,5};
		System.out.println(longestIncSS(a));
		
		int[] b= {3,4,-1,0,6,2,3};
		System.out.println(longestIncSS(b));
		
		int[] c= {2,5,1,8,3};
		System.out.println(longestIncSS(c));
	}
	
	public static int longestIncSS(int[] a)
	{
		int[] c=new int[a.length];
		
		for(int i=0;i<a.length;i++)
			c[i]=1;
		
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[i]>a[j] && c[i]<=c[j])
					c[i]=c[j]+1;
			}
		}
		
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+" ");
		System.out.println();
		
		int max=c[0];
		
		for(int i=1;i<c.length;i++)
		{
			if(c[i]>max)
				max=c[i];
		}
		
		return max;
	}
	
	
	

}
