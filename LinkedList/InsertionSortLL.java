/*

*/


public class InsertionSortLL
{
	public static void main(String args[])
	{
		SinglyLinkedList sll=new SinglyLinkedList();

		sll.insert(1,1);
		sll.insert(2,2);
		sll.insert(5,3);
		sll.insert(4,4);
		sll.insert(3,5);
		sll.insert(7,6);
		sll.insert(6,7);
		sll.insert(9,8);
		sll.insert(8,9);
		sll.insert(11,10);

		sll.print();
		sortLL(sll.head);
		sll.print();
	}

	public static ListNode sortLL(ListNode head)
	{
		if(head==null || head.next==null)
			return head;

		ListNode currnode=head.next;
		ListNode insertionptr=head;
		ListNode insertionprev=head;
		ListNode currprev=head;

		while(currnode!=null)
		{	
			if(currnode.data>currprev.data)
			{
				currprev=currnode;
				currnode=currnode.next;
			}
			else
			{
				while(insertionptr.data<currnode.data)
				{
					insertionprev=insertionptr;
					insertionptr=insertionptr.next;
				}
					
				ListNode temp1=insertionptr.next;
				ListNode temp2=currnode.next;

				currprev.next=currnode.next;
				currnode.next=insertionptr;

				insertionprev.next=currnode;

				currnode=temp2;
				
				insertionptr=head;
				insertionprev=head;	
				
			}
						
		}

		
		return head;
	}
}
