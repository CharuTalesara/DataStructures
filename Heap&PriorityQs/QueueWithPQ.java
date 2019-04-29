

public class QueueWithPQ
{
	int priority=-1;
	PriorityQForQueue pq=new PriorityQForQueue();

	public void enQueue(int data)
	{
		priority++;
		Element ele=new Element(data,priority);
		pq.insert(ele);
	}

	public int deQueue()
	{
		//priority--;
		return pq.deleteMin();
	}

	public boolean isEmpty()
	{
		return pq.isEmpty();
	}

	
}
