


public class DynamicArrayStack 
{
	public static  int CAPACITY=2;
	//private int N;
	private Object S[];
	private int top=-1;
	
	public DynamicArrayStack()
	{
		this(CAPACITY);
	}

	public DynamicArrayStack(int cap)
	{
		CAPACITY=cap;
		S=new Object[CAPACITY];
	}

	public int size()
	{
		return(top+1);
	}

	public boolean isEmpty()
	{
		return(top<0);
	}

	public void push(Object element) 
	{
		if(size()==CAPACITY)
		{
			expand();	
		}
		S[++top]=element;
	}

	public void expand()
	{
		int length=size();
		CAPACITY=CAPACITY*2;
		Object[] newS=new Object[CAPACITY];
		System.arraycopy(S,0,newS,0,length);
		S=newS;
	}

	public void printStack()
	{
		System.out.println("*****Size : "+size());
		System.out.println("*******Capacity : "+CAPACITY);
		for(int i=0;i<=top;i++)
		{
			System.out.print(S[i]+" ");
		}
		System.out.println();
	}

	public Object top() throws StackEmptyException
	{
		if(isEmpty())
			throw new StackEmptyException("Stack Is Empty");
		return S[top];
	}

	public Object pop() throws StackEmptyException
	{
		Object ele;
		if(isEmpty())
			throw new StackEmptyException("Stack is Empty");
		else
		{
			ele=S[top];
			S[top--]=null;
			shrink();
		}
		return ele;
	}

	public void shrink()
	{
		if(size()<=.25*CAPACITY)
		{
			int length=size();
			CAPACITY=CAPACITY/2;
			Object[] newS=new Object[CAPACITY];
			System.arraycopy(S,0,newS,0,length);
			S=newS;
		}	
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
