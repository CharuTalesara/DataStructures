

public class SinglyLinkedList
{
	ListNode head;
	int length;

	public SinglyLinkedList()
	{
		head=null;
		length=0; //though really not need this ..as default value is 0 only.
	}

	public ListNode insert(int data)
	{
		ListNode node=new ListNode(data);
		
		if(head==null)
		{
			head=node;
			return head;
		}

		ListNode currnode=head;

		while(currnode.next!=null)
			currnode=currnode.next;

		currnode.next=node;

		return head;
	}

	public ListNode insert(int data,int position)
	{
		ListNode node=new ListNode(data);

		if(length==0)
		{
			head=node;
			length++;
			return head;
		}

		if(position==1)
		{
			node.next=head;
			head=node;
			length++;
			return head;
		}
		
		if(position==length+1)
		{
			ListNode currnode=head;
			while(currnode.next!=null)
				currnode=currnode.next;
			currnode.next=node;
		}

		else
		{
			ListNode currnode=head;
			for(int i=1;i<position-1;i++)
				currnode=currnode.next;
			node.next=currnode.next;		
			currnode.next=node;			
		}

		length++;
		
		return head;	
	}

	public ListNode removeFromBeginning()
	{
		head=head.next;
		length--;
		return head;
	}

	public ListNode removeFromEnd()
	{		
		if(length==1 || length==0)
			head=null;

		length--;
		
		ListNode currnode=head;

		while(currnode.next.next!=null)
			currnode=currnode.next;

		currnode.next=null;
			
		return head;
	}

	public ListNode removeMatched(int key)
	{
		if(length==0 || head==null)
			return null;

		if(head.data==key)
			head=head.next;
		
		ListNode currnode=head;

		while(currnode.next.data!=key)
			currnode=currnode.next;
			
		currnode.next=currnode.next.next;
		length--;
		
		return head;
	}

	public ListNode removeFromPosition(int position)
	{
		if(position>length || position<=0)
			return null;

		if(position==1)
			return removeFromBeginning();

		if(position==length)
			return removeFromEnd();
		
		ListNode currnode=head;
	
		for(int i=1;i<position-1;i++)
			currnode=currnode.next;

		currnode.next=currnode.next.next;
		length--;		
		
		return head;
		
	}

	public ListNode search(int key)
	{
		if(head.data==key)
			return head;

		ListNode currnode=head;

		while(currnode!=null && currnode.data!=key)
			currnode=currnode.next;

		return currnode;
	}

	public int getPosition(int data)
	{
		ListNode currnode=head;
		
		int pos=1;

		while(currnode.data!=data)
		{
			currnode=currnode.next;
			pos++;
		}

		return pos;
	}
	
	public int getLength()
	{
		return length;
	}

	public void print()
	{
		ListNode currnode=head;
		while(currnode!=null)
		{
			System.out.print(currnode.data+" ");
			currnode=currnode.next;
		}
		System.out.println();
	}

		
}
