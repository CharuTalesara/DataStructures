





public class MaxNMinInPairs	
{
	public static void main(String args[])
	{
		int[] a={4,2,1,7,6,9,3,8,5};
		print(a);
		maxNMin(a);	
	}

	public static void maxNMin(int[] a)
	{
		if(a.length<2)
		{
			System.out.println("Array has just one elemnt .. max n min are same : "+a[0]);
			return;
		}
		int max=a[0];
		int min=a[1];

		if(max<min)
		{
			min=a[0];
			max=a[1];
		}

		
		for(int i=2;i<a.length-1;i=i+2)
		{
			//System.out.println(i);
			if(a[i]>a[i+1])
			{
				if(a[i]>max)
					max=a[i];
				if(a[i+1]<min)
					min=a[i+1];
			}
			else
			{
				if(a[i]<min)
					min=a[i];
				if(a[i+1]>max)
					max=a[i+1];
			}
		}		

		System.out.println("Min : "+min +" Max : "+max);
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
