

public class ReverseLL
{

	public static SinglyLinkedList sll=new SinglyLinkedList();	

	public static void main(String args[])
	{
		sll.insert(1,1);
		sll.insert(2,2);
		sll.insert(3,3);
		sll.insert(4,4);
		sll.insert(5,5);
		sll.insert(6,6);

		sll.print();
		reverse();
		sll.print();

	}

	public static ListNode reverse()
	{
		if(sll.getLength()==1 || sll.head==null)
			return sll.head;

		if(sll.getLength()==2)
		{
			ListNode currnode=sll.head;
			sll.head=sll.head.next;
			sll.head.next=currnode;
			return sll.head;
		}
		
		else
		{
			ListNode currnode=sll.head;
			ListNode prev=null;
			
			while(currnode!=null)
			{
				ListNode next=currnode.next;
				currnode.next=prev;
				prev=currnode;
				currnode=next;	
			}

			sll.head=prev;
			return prev;
		}

		
		
	}


}
