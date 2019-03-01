/*
Create a queue using an array in circular fashion
*/

public class FixedSizeCircularArrayQueue
{
	int[] qdata;
	int front,rear,size;
	private static int CAPACITY=10;
	
	public FixedSizeCircularArrayQueue()
	{
		qdata=new int[CAPACITY];		
		front=0;
		rear=0;
		size=0;
	}

	public FixedSizeCircularArrayQueue(int qlen)
	{
		CAPACITY=qlen;
		qdata=new int[qlen];
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

	public void enQueue(int x) throws QueueFullException
	{
		if(isFull())
			throw new QueueFullException("...Queue is Full ..");
		qdata[rear]=x;
		rear=(rear+1)%CAPACITY;
		size++;	
	}

	public int dequeue() throws QueueEmptyException
	{
		if(isEmpty())
			throw new QueueEmptyException("..Queue is Empty..");
		int ret=qdata[front];
		front=(front+1)%CAPACITY;
		size--;
		return ret;	
	}	

	public void printQ()
	{
		System.out.println("Size : "+size);
		System.out.println("Front : "+front);
		System.out.println("Rear : "+rear);
		int j=front;
		
		for(int i=0;i<size;i++)
		{
			if(j>=CAPACITY)
				j=j%CAPACITY;
			System.out.print(qdata[j]+" ");
			j++;
		}
		System.out.println();
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
