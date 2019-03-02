/*
Given an integer k and a q of integers ..reverse the order of the first k elements of the q.
eg- k=4 Q=1,2,3,4,5,6,7,8
o/p- 4,3,2,1,5,6,7,8
*/


public class ReverseQFirstKElements
{
	public static void main(String args[])
	{
		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(10);
		q.enQueue(0);
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(6);
		q.enQueue(7);
		q.enQueue(8);
		q.enQueue(9);

		reverseK(q,4);
		q.printQ();
	}

	public static FixedSizeCircularArrayQueue reverseK(FixedSizeCircularArrayQueue q,int k)
	{
		ArrayStack stack=new ArrayStack(k);
		
		for(int i=0;i<k;i++)
			stack.push(q.dequeue());
						
		while(!stack.isEmpty())
			q.enQueue(((Integer)stack.pop()).intValue());
		
		for(int i=k;i<q.size();i++)
		{
			q.enQueue(q.dequeue());
		}
		
		return q;
	}
}
