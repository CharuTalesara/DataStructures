


public class ArrayStack implements Stack
{
	public static final int CAPACITY=1024;
	private int N;
	private Object S[];
	private int t=-1;
	
	public ArrayStack()
	{
		this(CAPACITY);
	}

	public ArrayStack(int cap)
	{
		N=cap;
		S=new Object[N];
	}

	public int size()
	{
		return(t+1);
	}

	public boolean isEmpty()
	{
		return(t<0);
	}

	public void push(Object element) throws StackFullException
	{
		if(size()==N)
			throw new StackFullException("Stack Overflow");
		S[++t]=element;
	}

	public Object top() throws StackEmptyException
	{
		if(isEmpty())
			throw new StackEmptyException("Stack Is Empty");
		return S[t];
	}

	public Object pop() throws StackEmptyException
	{
		Object ele;
		if(isEmpty())
			throw new StackEmptyException("Stack is Empty");
		else
		{
			ele=S[t];
			S[t--]=null;
		}
		return ele;
	}
}

class StackFullException extends RuntimeException
{
	public StackFullException(String s)
	{
		super(s);
	}
}

class StackEmptyException extends RuntimeException
{
	public StackEmptyException(String s)
	{
		super(s);
	}
}
