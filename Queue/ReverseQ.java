


public class ReverseQ
{
	public static void main(String args[])
	{
		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(5);
		
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.printQ();
		reverseQueue(q);
		q.printQ();
	}

	public static FixedSizeCircularArrayQueue reverseQueue(FixedSizeCircularArrayQueue q)
	{
		ArrayStack stack=new ArrayStack();
		
		while(!q.isEmpty())
		{
			stack.push(q.dequeue());
		}
		while(!stack.isEmpty())		
		{
			q.enQueue(((Integer)stack.pop()).intValue());
		}
		return q;
	}
}
