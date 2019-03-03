/*
Dynamic Circular Queue Array- Implementation
*/


public class DynamicArrayQ
{
	public static void main(String	args[])
	{
		DynamicCircularQ q=new DynamicCircularQ(2);
		q.enQueue(2);
		q.enQueue(4);
		q.enQueue(6);
		q.enQueue(8);
		q.enQueue(10);
		q.printQ();
	}
}

class DynamicCircularQ
{
	int[] qdata;
	int front,rear,size;
	private static int CAPACITY=10;
	
	public DynamicCircularQ()
	{
		qdata=new int[CAPACITY];		
		front=0;
		rear=0;
		size=0;
	}

	public DynamicCircularQ(int qlen)
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

	public int size()
	{
		return size;
	}

	public void enQueue(int x) 
	{
		if(isFull())
			expand();
		qdata[rear]=x;
		rear=(rear+1)%CAPACITY;
		size++;	
	}


	public void expand()
	{
		CAPACITY=CAPACITY*2;
		int[] newq=new int[CAPACITY];
		
		int j=front;
		int x=j;
		for(int i=0;i<size;i++)
		{
			if(j>=CAPACITY)
				j=j%CAPACITY;
			newq[x]=qdata[j];
			j++;
			x++;
		}
		rear=x;
		qdata=new int[CAPACITY];
		qdata=newq;
	}	
	
	public int dequeue()  throws QueueEmptyException
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
		System.out.println("*****************************************");
		System.out.println("Size : "+size);
		System.out.println("Front : "+front);
		System.out.println("Rear : "+rear);
		System.out.println("*****************************************");

		int j=front;
		for(int i=0;i<size;i++)
		{
			if(j>=CAPACITY)
				j=j%CAPACITY;
			System.out.print(qdata[j]+" ");
			j++;
		}
		System.out.println();
		System.out.println("********************************");		
	}
}

