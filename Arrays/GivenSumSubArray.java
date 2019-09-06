package arrays;

public class GivenSumSubArray {

	public static void main(String[] args) 
	{
		int[] a= {-2,-3,4,-1,-2,1,5,-3};
		givenSumOfSubArray(a,7);
	}

	
	/*
	 * O(n^2);
	 */
	public static void givenSumOfSubArray(int[] a,int k)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int sum=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				sum=sum+a[j];
				if(sum==k)
				{
					System.out.println("SubArray Index : "+i+" "+j);
					System.out.println("SubArray Starting at : "+a[i]+" n ending at : "+a[j]);
					return;
				}
			}
		}
	}
}
