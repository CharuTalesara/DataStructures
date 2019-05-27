


public class ListNode
{
	Vertex keyVertex;
	ListNode next;

	public ListNode(Vertex data)
	{
		this.keyVertex=data;
		next=null;
	}

	public Vertex getData()
	{
		return this.keyVertex;
	}

	public ListNode getNext()
	{
		return this.next;
	}

	public void setData(Vertex data)
	{
		this.keyVertex = data;
	}

	public void setNext(ListNode next)
	{
		this.next=next;
	}

	
}

