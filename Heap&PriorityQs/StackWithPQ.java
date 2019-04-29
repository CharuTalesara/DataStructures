

public class StackWithPQ
{
	PriorityQForStack pq;
	

	public StackWithPQ()
	{
		pq=new PriorityQForStack();
		//priority=-1;
	}

	public  void push(int data)
	{
		pq.insert(data);
	}

	public int getTop()
	{
		return pq.getMax();
	}

	public int pop()
	{
		return pq.deleteMax();
	}

	public boolean isEmpty()
	{
		return pq.isEmpty();
	}
}
