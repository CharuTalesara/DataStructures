
public class DoublyLinkedList
{
	DLLNode head;
	DLLNode tail;

	int length;

	public DoublyLinkedList()
	{
		head=null;
		tail=null;
		length=0;
	}

	public void insertAtBeginning(int data)
	{
		DLLNode node=new DLLNode(data);
		node.next=head;
		head=node;
		if(length==0)
			tail=head;
		length++;
		return;
	}

	public void insertAtEnd(int data)
	{
		DLLNode node=new DLLNode(data);
		
		DLLNode currnode=head;
		
		while(currnode.next!=null)
			currnode=currnode.next;

		node.prev=currnode;
		currnode.next=node;
		tail=node;
		length++;
		return;
	}

	public void insert(int data,int position)
	{
		if(position<=0 || position>length)
			return;
		
		if(position==1)
		{
			insertAtBeginning(data);
			return;
		}

		if(position==length)
		{
			insertAtEnd(data);
			return;
		}

		DLLNode currnode=head;

		DLLNode node=new DLLNode(data);

		for(int i=1;i<position-1;i++)
			currnode=currnode.next;

		node.prev=currnode;
		node.next=currnode.next;
		currnode.next.prev=node;
		currnode.next=node;
		length++;
		return;
	}


	public void deleteHead()
	{
		if(length==0)
			return;
		if(length==1)
			tail=null;

		head=head.next;
		length--;
		return ;
	}

	public void deleteTail()
	{
		DLLNode currnode=head;
		
		if(length==0)
			return;

		tail.prev.next=null;
		tail=tail.prev;		

		length--;	
	}

	public void deleteMatched(int data)
	{
		if(head.data==data)
		{
			head=head.next;
			return;
		}

		if(length==2 && head.next.data==data)
		{
			head.next=head.next.next;
			length--;
			return;
		}		

		DLLNode currnode=head;

		while(currnode.next!=null && currnode.data!=data)
		{
			currnode=currnode.next;
		}

		currnode.prev.next=currnode.next;
		currnode.next.prev=currnode.prev;
		length--;
	}

	public void delete(int position)
	{
		if(position<=0 || position>length)
			return;

		if(position==1)
		{
			deleteHead();
			return;
		}

		if(head==null)
			return;		

		if(position==length)
		{
			deleteTail();
			return;
		}

		DLLNode currnode=head;

		for(int i=1;i<position-1;i++)
			currnode=currnode.next;

		currnode.next.next.prev=currnode;
		currnode.next=currnode.next.next;
		length--;
	}

	public DLLNode getHead()
	{
		return head;
	}

	public DLLNode getTail()
	{
		return tail;
	}
	public void print()
	{
		DLLNode currnode=head;

		while(currnode!=null)
		{
			System.out.print(currnode.data+" ");
			currnode=currnode.next;
		}
		System.out.println();
	}

	public int getLength()
	{
		return length;
	}

	
}
