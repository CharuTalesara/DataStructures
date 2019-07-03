

public class MaxValSubSeqDP
{
	public static void main(String args[])
	{
		int[] a={-2,11,-4,13,-5,2};
		int[] b={1,-3,4,-2,-1,6};

		System.out.println(maxsubseq(a));
		System.out.println(maxsubseq(b));
	}

	public static int maxsubseq(int[] a)
	{
		int max_sum=a[0];
		int curr_max=a[0];

		for(int i=0;i<a.length;i++)
		{
			curr_max=max(a[i],curr_max+a[i]);
			if(curr_max>max_sum)
				max_sum=curr_max;
		}

		return max_sum;
	}

	public static int max(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
}
