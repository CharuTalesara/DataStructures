
public class DLLNode
{
	int data;
	DLLNode next;
	DLLNode prev;

	public DLLNode(int data)
	{
		this.data=data;
		next=null;
		prev=null;
	}

	public int getData()
	{
		return this.data;
	}

	public DLLNode getPrev()
	{
		return this.prev;
	}

	public DLLNode getNext()
	{
		return this.next;
	}

	public void setData(int data)
	{
		this.data=data;
	}

	public void setPrev(DLLNode prev)
	{
		this.prev=prev;
	}

	public void setNext(DLLNode next)
	{
		this.next=next;
	}
}
