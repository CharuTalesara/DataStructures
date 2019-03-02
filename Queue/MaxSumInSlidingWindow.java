

public class MaxSumInSlidingWindow
{
	public static void main(String args[])
	{
		int[] a={1,3,-1,-3,5,3,6,7};
				
		
		maxInSlidingWindow(a,3);
	}

	public static void maxInSlidingWindow(int[] a,int w)
	{
		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(w);
		int max=a[0];

		for(int i=0;i<w;i++)
		{
			q.enQueue(a[i]);
			if(max<a[i])
				max=a[i];		
		}		
		q.printQ();
		System.out.println("Max of Q : "+max);
		
		for(int i=w;i<a.length;i++)
		{
			q.dequeue();
			q.enQueue(a[i]);
			q.printQ();
			if(max<a[i])
				max=a[i];
			System.out.println("Max of Q : "+max);
		}
		
	}
}
