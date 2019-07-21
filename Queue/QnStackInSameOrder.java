/*
Given a queue Q containing  n elements, transfer these items on the stack s(initially empty) 
so that the front element of the q appears on the top of the stack
*/

public class QnStackInSameOrder
{
	public static void main(String args[])
	{
		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(10);
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
		ArrayStack stack=stacknQ(q);
		System.out.println("<<<<<Prining Stack>>>>");
		stack.printStack();
	}

	public static ArrayStack stacknQ(FixedSizeCircularArrayQueue q)
	{
		int n=q.size();

		ArrayStack stack = new ArrayStack(n);


		// Push all the elemets of Q onto stack--> reverse
		while(!q.isEmpty())
			stack.push(q.dequeue());


		// Enq all stack ele --> Q reversed
		while(!stack.isEmpty())		
			q.enQueue(((Integer)stack.pop()).intValue());

		// Push all the elements of Q onto stack ... front ele of original q being on top of stack

		while(!q.isEmpty())
			stack.push(q.dequeue());


		return stack;
	}
}
