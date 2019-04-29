




public class QueueWithPQDemo
{
	public static void main(String args[])
	{
		QueueWithPQ q=new QueueWithPQ();

		q.enQueue(2);
		q.enQueue(1);
		q.enQueue(3);
		q.enQueue(0);
		q.pq.printHeap();

		//System.out.println(stack.getTop());

		System.out.println(q.deQueue());
		q.pq.printHeap();

		q.enQueue(4);
		q.pq.printHeap();

		/*stack.push(0);
		stack.pq.printHeap();*/

		while(!q.isEmpty())
		{
			System.out.println(q.deQueue());
			q.pq.printHeap();	
		}
	}
}
