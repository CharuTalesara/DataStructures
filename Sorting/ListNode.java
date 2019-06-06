
public class ListNode
{
	int data;
	ListNode next;

	public ListNode(int data)
	{
		this.data=data;
		next=null;
	}

	public int getData()
	{
		return this.data;
	}

	public ListNode getNext()
	{
		return this.next;
	}

	public void setData(int data)
	{
		this.data = data;
	}

	public void setNext(ListNode next)
	{
		this.next=next;
	}
}

