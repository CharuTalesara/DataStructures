
/*
Queue-[11,12,13,14,15,16,17,18,19,20]
Output Q-[11,16,12,17,13,18,14,19,15,20]
*/


public class InterIeavingQueue
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
		pairedQ(q);
		q.printQ();

		q=pairedQWithStacks(q);
		q.printQ();
	
	}


	// Time Complexity - O(n) n space complexity-O(n)...using only queues data structure ...my instictive approach 
	public static FixedSizeCircularArrayQueue pairedQ(FixedSizeCircularArrayQueue q)
	{
		int n=q.size();
		int sizeq=n/2;
		
		FixedSizeCircularArrayQueue q1=new FixedSizeCircularArrayQueue(n);
		FixedSizeCircularArrayQueue q2=new FixedSizeCircularArrayQueue(n);

		// Enqueue the first half of the given queue in new queue
		
		for(int i=0;i<sizeq;i++)
			q1.enQueue(q.dequeue());

		// Enqueue the second half of the given queue in new queue
		
		for(int i=0;i<sizeq;i++)
			q2.enQueue(q.dequeue());
		
		
		// Dequeue the newly created qs one by one n enq the same in the given q

		while(!q1.isEmpty() && !q2.isEmpty())
		{
			q.enQueue(q1.dequeue());
			q.enQueue(q2.dequeue());
			
		}
		return q;
	}

	//Using stack O(n)-time and space complexity

	public static FixedSizeCircularArrayQueue pairedQWithStacks(FixedSizeCircularArrayQueue q)
	{
		int n=q.size();
		int sizeStack=n/2;
		ArrayStack stack=new ArrayStack(sizeStack);

		// push first half of q in the stack

		for(int i=0;i<sizeStack;i++)
			stack.push(q.dequeue());

		//enq all the elem of stack 

		while(!stack.isEmpty())
			q.enQueue(((Integer)stack.pop()).intValue());

		// wrap around the first half of queue

		for(int i=0;i<sizeStack;i++)
			q.enQueue(q.dequeue());

		//push the first half of the q to the stack

		for(int i=0;i<sizeStack;i++)
			stack.push(q.dequeue());

		//Poping from stack and wrap around from q will give the resulting q

		while(!stack.isEmpty())
		{
			q.enQueue(((Integer)stack.pop()).intValue());
			q.enQueue(q.dequeue());
		}

		return q;
	}
}
