

public class MaxSumInSlidingWindow
{
	public static void main(String args[])
	{
		int[] a={100,3,-1,-3,5,3,6,7};
				
		
		maxInSlidingWindow(a,3);
	}


	public static void maxInSlidingWindow(int[] a,int w)
	{
		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(w);
		int max=-10000;

		for(int i=0;i<a.length;i++)
		{
			if(i<w)
				q.enQueue(a[i]);
			else
			{
				
				int deletedele=q.dequeue();
				if(max==deletedele)
					max=q.frontele();
				q.enQueue(a[i]);
				
			}
			q.printQ();
			
			if(max<a[i])
				max=a[i];
			System.out.println("Max of Q : "+max);
		}
		
	}
}
