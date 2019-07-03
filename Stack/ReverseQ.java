


public class ReverseQ
{
	public static void main(String args[])
	{
		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue();
		q.enQueue(11);
		q.enQueue(12);
		q.enQueue(13);
		q.enQueue(14);
		q.enQueue(15);
		q.enQueue(16);
		q.enQueue(17);
		q.enQueue(18);
		q.enQueue(19);
		q.enQueue(20);
		

		q.printQ();
		reverseQueue(q);
		q.printQ();
		
	}

	public static FixedSizeCircularArrayQueue reverseQueue(FixedSizeCircularArrayQueue q)
	{
		ArrayStack stack=new ArrayStack();

		while(!q.isEmpty())
		{
			int ele=q.dequeue();
			stack.push(ele);
		}

		while(!stack.isEmpty())
		{
			int x=(int)stack.pop();
			q.enQueue(x);	
		}		
	
		return q;
	}
}
