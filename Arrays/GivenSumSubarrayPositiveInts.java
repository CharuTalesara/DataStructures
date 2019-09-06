package arrays;

public class GivenSumSubarrayPositiveInts 
{
	public static void main(String args[])
	{
		 int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
	     int n = arr.length; 
	     int sum = 23; 
	     subArraySum(arr,23);
	     givenSumOfSubArray(arr,23);
	}
	
	
	//O(2n) i.e. O(n)
	public static void subArraySum(int[] a,int sum)
	{
		int curr_sum=a[0];
		int start=0;
		
		for(int i=1;i<a.length;i++)
		{
			if(curr_sum==sum)
			{
				System.out.println("SubArray started at : "+start+" ended at : "+(i-1));
				return;
			}
			while(curr_sum>sum && start<i-1)
			{
				curr_sum=curr_sum-a[start];
				start++;
			}
			if(curr_sum<sum)
				curr_sum+=a[i];
		}
	}
	
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
