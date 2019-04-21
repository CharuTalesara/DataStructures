


public class MaxSubArray
{
	public static void main(String args[])
	{
		int[] a={-2,-5,6,-2,-3,1,5,-6};	
		print(a);
		maxSubArrayBruteForce(a);

		int[] b={13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
		print(b);
		maxSubArrayBruteForce(b);

		int[] c={-2,-5,-6,-2,-3,-1,-5,-6};	
		print(c);
		maxSubArrayBruteForce(c);

		print(a);
		kadanesAlgoForMaxSubarray(a);

		print(b);
		kadanesAlgoForMaxSubarray(b);

		print(c);
		kadanesAlgoForMaxSubarray(c);
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		
	}


	//O(n^2)

	public static void maxSubArrayBruteForce(int[] a)
	{
		int max_left=0	;
		int max_right=0;
		int max_sum=-1000;


		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			int j=i;
			for(;j<a.length;j++)
			{
				sum=sum+a[j];

				if(max_sum<sum)
				{
					max_sum=sum;
					max_left=i;
					max_right=j;
				}
			}
		}

		System.out.println("Max Sum : "+max_sum+" with starting from : "+max_left+" ending at : "+max_right);
	}

	public static int max(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}

	public static void kadanesAlgoForMaxSubarray(int[] a)
	{
		int max_global=a[0];
		int curr_max=a[0];

		for(int i=1;i<a.length;i++)
		{
			curr_max=max(a[i],a[i]+curr_max);		
			if(curr_max>max_global)
				max_global=curr_max;			
		}

		System.out.println(max_global);
	}
}
