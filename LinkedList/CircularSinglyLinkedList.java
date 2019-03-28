
public class CircularSinglyLinkedList
{
	ListNode head;
	int length;

	public CircularSinglyLinkedList()
	{
		length=0;
		head=null;
	}

	public void insert(int data,int position)
	{
		ListNode node=new ListNode(data);

		if(head==null)
		{
			head=node;
			node.next=head;
			length++;
			return;
		}
		
		ListNode currnode=head;

		if(position==length+1)
		{
			while(currnode.next!=head)
				currnode=currnode.next;
			
			currnode.next=node;
			node.next=head;
			length++;
			return;	
		}

		for(int i=1;i<position-1;i++)
			currnode=currnode.next;

		node.next=currnode.next;
		currnode.next=node;
		length++;
		return;
	}

	public void deleteHead()
	{
		if(length==1)
		{
			head=null;
			length--;
			return;
		}
		
		ListNode currnode=head;

		while(currnode.next!=head)
			currnode=currnode.next;

		currnode.next=head.next;
		head=head.next;
		length--;
		return;		
	}

	public void deleteTail()
	{
		if(length==1)
		{
			head=null;
			length--;
			return;
		}
		
		ListNode currnode=head;
		
		while(currnode.next.next!=head)
			currnode=currnode.next;

		currnode.next=head;
		length--;
		return;
	}

	public void deletePosition(int position)
	{
		if(position==1)
		{
			deleteHead();
			return;
		}

		if(position==length)
		{
			deleteTail();
			return;
		}

		ListNode currnode=head;

		for(int i=1;i<position-1;i++)
		{
			currnode=currnode.next;
		}

		currnode.next=currnode.next.next;
		length--;
		return;
	}

	public void deleteMatched(int key)
	{
		if(head.data==key)
		{
			deleteHead();
			return;
		}

		ListNode currnode=head;

		while(currnode.next.data!=key)	
			currnode=currnode.next;

		currnode.next=currnode.next.next;
		length--;
		return;
	}

	public int getLength()
	{
		return length;
	}

	public void print()
	{
		ListNode currnode=head;

		System.out.print(currnode.data+" ");
		
		while(currnode.next!=head)
		{
			System.out.print(currnode.next.data+" ");
			currnode=currnode.next;
		}
		
		System.out.println();
	}
}
