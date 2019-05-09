


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
		
	}

	public static void reverseQueue(FixedSizeCircularArrayQueue q)
	{
		ArrayStack stack=new ArrayStack();
		System.out.println("<<<<<Prining Stack>>>>");
		
		int i=0;

		while(i<q.size())
		{
			int ele=q.dequeue();
			stack.push(ele);
			q.enQueue(ele);
			i++;
		}		

		while(!stack.isEmpty())
		{
			System.out.print(Integer.parseInt(stack.pop().toString())+" ");
		}
		System.out.println();
	}
}
