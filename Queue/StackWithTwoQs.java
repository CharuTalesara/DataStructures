
/*
Implementing Stack with two queues.
*/


public class StackWithTwoQs
{
	public static void main(String args[])
	{
		StackQ stack=new StackQ(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(4);
		//stack.push(4);
		System.out.println("Printing Stack");
		stack.printStack();
		stack.pop();
		stack.printStack();
		
		stack.pop();
		stack.printStack();
	}
}

class StackQ
{

	public FixedSizeCircularArrayQueue q1;
	public FixedSizeCircularArrayQueue q2;
	int top=-1;

	public StackQ(int cap)
	{
		q1=new FixedSizeCircularArrayQueue(cap);
		q2=new FixedSizeCircularArrayQueue(cap);	
	}

	public void push(int x)
	{
		top++;
		q1.enQueue(x);
	}

	public int pop()
	{
		int i=0;
		while(i<top)
		{
			q2.enQueue(q1.dequeue());
			i++;
		}
		int ret=q1.dequeue();
		while(!q2.isEmpty())
			q1.enQueue(q2.dequeue());
		top--;
		return ret;
	}	

	public int top()
	{
		int i=0;
		while(i<top)
		{
			q2.enQueue(q1.dequeue());
			i++;
		}
		int ret=q1.dequeue();
		while(!q2.isEmpty())
			q1.enQueue(q2.dequeue());
		q1.enQueue(ret);
		return ret;
	}	

	public void printStack()
	{
		System.out.println("Top : "+top());
		q1.printQ();
	}
}
