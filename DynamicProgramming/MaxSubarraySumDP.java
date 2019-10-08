package dp;

public class MaxSubarraySumDP {

	public static void main(String[] args) 
	{
		int[] a= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxsubarraySum(a));
	}
	
	public static int maxsubarraySum(int[] a)
	{
		int[] c=new int[a.length];
		
		c[0]=a[0];
		int max=c[0];
		
		for(int i=1;i<a.length;i++)
		{
			c[i]=Math.max(a[i],a[i]+c[i-1]);
			if(max<c[i])
				max=c[i];
		}
		
		return max;
	}

}
