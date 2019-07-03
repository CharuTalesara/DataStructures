



public class MaxValSubSeq
{
	public static void main(String args[])
	{
		int[] a={-2,11,-4,13,-5,2};
		int[] b={1,-3,4,-2,-1,6};

		System.out.println(bruteForce(a));
		System.out.println(bruteForce(b));
	}

	public static int bruteForce(int[] a)
	{
		int max_sum=a[0];

		for(int i=0;i<a.length;i++)
		{
			int curr_sum=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				curr_sum+=a[j];
				if(curr_sum>max_sum)	
					max_sum=curr_sum;			
			}
		}

		return max_sum;
	}
}
