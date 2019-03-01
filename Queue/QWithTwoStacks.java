
public class QWithTwoStacks
{
	public static void main(String args[])
	{
		System.out.println("Implementing Queue with 2 Stacks");
		Queue q=new Queue(5);
		//q.deq();
		q.enq(1);
		q.enq(2);

		q.enq(3);
		q.enq(4);
		q.enq(5);
		// Checking Q Full-q.enq(6);
		q.printq();
		q.deq();
		q.printq();
		q.deq();
		q.printq();
		q.enq(10);
		q.printq();
	}
}

class Queue
{
	ArrayStack stack1;// for enqueue
	ArrayStack stack2;//for dequeue

	public Queue(int cap)
	{
		stack1=new ArrayStack(cap);
		stack2=new ArrayStack(cap);
	}
	
	public void enq(int x)
	{		
		stack1.push(x);	
	}

	public int deq() throws QueueEmptyException
	{
		if(stack1.isEmpty())
			throw new QueueEmptyException("Oops .... Queue is Empty");
		else
		{
			int x=-1;

			while(!stack1.isEmpty())
				stack2.push(stack1.pop());
			
			x=((Integer)stack2.pop()).intValue();

			while(!stack2.isEmpty())
				stack1.push(stack2.pop());

			return x;
		}
	}	
	
	public void printq()
	{
		System.out.println("...Printing Queue....");
		stack1.printStack();
		//stack2.printStack();
	}
}
