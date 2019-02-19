/*
Implement two stacks using only one array.
Our stack routine should not indicate an exception unless every slot in the array is used.
*/


class ArrayWithTwoStacks
{
	private Object[] dataArray;
	private int n;
	public static final int CAPACITY=1024;
	private int topfront=-1;// top for stackid 1
	private int toprear=n;//top for stackid 2
	
	public ArrayWithTwoStacks()
	{
		this(CAPACITY);
	}
	
	public ArrayWithTwoStacks(int cap)
	{
		n=cap;
		toprear=n;
		dataArray=new Object[n];
	}

	public void printStacks()
	{
		System.out.println("Elements in Stack 1");
		for(int i=0;i<=topfront;i++)
			System.out.print(dataArray[i].toString()+" ");
		System.out.println();
		System.out.println("Elements in Stack 2");
		for(int i=n-1;i>=toprear;i--)
			System.out.print(dataArray[i].toString()+" ");
		System.out.println();
	}

	public int size()
	{
		return (topfront+n-toprear+1);
	}

	public void push(int stackid,int item) throws StackFullException
	{
		if(size()>=n)
			throw new StackFullException("Stack Overflow");
		if(stackid ==1)
		{
			topfront++;
			dataArray[topfront]=item;
		}
		else
		{
			toprear--;
			dataArray[toprear]=item;
		}	
	}

	public Object top(int stackid) throws StackEmptyException
	{
		Object ret=null;
		if(stackid==1)
		{
			if(topfront==-1)
				throw new StackEmptyException("Stack 1 is empty");
			ret=dataArray[topfront];
		}
		else
		{
			if(toprear==n)
				throw new StackEmptyException("Stack 2 is empty");
			ret=dataArray[toprear];
		}
		return ret;
	}

	public boolean isEmpty(int stackid) 
	{
		if(stackid == 1)
			return topfront==-1;
		else
			return toprear==n;
	}
	
	
	public Object pop(int stackid) throws StackEmptyException
	{
		Object ret=null;
		if(stackid==1)
		{
			if(topfront==-1)
				throw new StackEmptyException("Stack 1 is empty");
			ret=dataArray[topfront];
			dataArray[topfront]=null;
			topfront--;
		}
		else
		{
			if(toprear==n)
				throw new StackEmptyException("Stack 2 is empty");
			ret=dataArray[toprear];
			dataArray[toprear]=null;
			toprear++;
		}
		return ret;
	}
}
	
