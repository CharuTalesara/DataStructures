

public class ListNode
{
	int key;
	int data;
	ListNode next;

	public ListNode(int key,int data)
	{
		this.setKey(key);
		this.setData(data);
	}

	public int getKey()
	{
		return this.key;
	}

	public  int getData()
	{
		return this.data;
	}

	public ListNode getNext()
	{
		return this.next;
	}

	public void setData( int data)
	{
		this.data=data;
	}

	public void setNext(ListNode next)
	{
		this.next=next;
	}

	public void setKey(int key)
	{
		this.key=key;
	}
}
