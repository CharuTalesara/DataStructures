/*
Create a queue using an array in circular fashion
*/

public class FixedSizeCircularArrayQueue
{
	Vertex[] qdata;
	int front,rear,size;
	private static int CAPACITY=1024;
	
	public FixedSizeCircularArrayQueue()
	{
		qdata=new Vertex[CAPACITY];		
		front=0;
		rear=0;
		size=0;
	}

	public FixedSizeCircularArrayQueue(int qlen)
	{
		CAPACITY=qlen;
		qdata=new Vertex[qlen];
		front=0;
		rear=0;
		size=0;
	}
		
	public boolean isEmpty()
	{
		return size==0;
	}

	public boolean isFull()
	{
		return (size==CAPACITY);
	}

	public int size()
	{
		return size;
	}

	public  Vertex frontele()
	{
		return qdata[front];
	}

	public void enQueue(Vertex x) throws QueueFullException
	{
		if(isFull())
			throw new QueueFullException("...Queue is Full ..");
		qdata[rear]=x;
		rear=(rear+1)%CAPACITY;
		size++;	
	}

	public Vertex dequeue() throws QueueEmptyException
	{
		if(isEmpty())
			throw new QueueEmptyException("..Queue is Empty..");
		Vertex ret=qdata[front];
		front=(front+1)%CAPACITY;
		size--;
		return ret;	
	}	

	public void printQ()
	{
		System.out.println("*****************************************");
		int j=front;
		for(int i=0;i<size;i++)
		{
			if(j>=CAPACITY)
				j=j%CAPACITY;
			qdata[j].printVertex();
			j++;
		}
		System.out.println();
		System.out.println("********************************");		
	}
}

class QueueFullException extends RuntimeException
{
	public QueueFullException(String s)
	{
		super(s);
	}
}

class QueueEmptyException extends RuntimeException
{
	public QueueEmptyException(String s)
	{
		super(s);
	}
}
