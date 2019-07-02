
/*
Given a linked list with even and odd numbers, create an algorithm for making changes to the list in such a way that all even numbers appear at the beginning.

*/


public class EvenOddLL
{
	public static void main(String args[])
	{
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.insert(0,1);
		sll.insert(1,2);
		//sll.insert(2,2);
		sll.insert(3,3);
		sll.insert(4,4);
		sll.insert(5,5);
		sll.insert(6,6);
		sll.insert(7,7);
		sll.insert(8,8);
		sll.insert(9,9);
		sll.insert(10,10);

		sll.print();

		evenodd1(sll.head);		

		sll.print();

	}


	public static ListNode evenodd1(ListNode head)
	{
		if(head==null || head.next==null)
			return head;	
		
		ListNode currnode=head.next;
		
		ListNode fo=null;
		ListNode currprev=head;
		ListNode le=null;		

		if(head.data%2==1)
			fo=head; //fo=first odd;	
		else 
			le=head; //le=last even

		while(currnode!=null)
		{
			if(currnode.data%2==1)
			{
				if(fo==null)
					fo=currnode;
				currprev=currnode;
				currnode=currnode.next;
			}

			else
			{
				if(le==null)
					le=currnode;
	
				ListNode temp=currnode.next;

				le.next=currnode;
				currprev.next=currnode.next;

				if(fo!=null)
					currnode.next=fo;
				le=currnode;
				currnode=temp;			
			}

		}

		return head;
	


	}


	// Time Complexity=O(n).. space=O(1)

	/*
		In this algorithm links of the nodes are changed ..head node check has been done after that
		Another approach is to create another linked list with odd data nodes of existing ll and then 
		append both the lists.

	*/		
	
	public static ListNode evenodd(ListNode head)
	{
		if(head==null || head.next==null)
			return head;	
		
		ListNode curreven=head;

		ListNode currodd=head;

		while(curreven.next!=null && currodd.next!=null && currodd.next.next!=null)
		{
			if(curreven.next.data%2==0)
				curreven=curreven.next;

			else
			{
				currodd=curreven.next;

				while(currodd.next!=null && currodd.next.data%2==1)
					currodd=currodd.next;

				
				ListNode temp1=curreven.next;
				ListNode temp2=currodd.next;

				curreven.next=currodd.next;
				currodd.next=currodd.next.next;
				temp2.next=temp1;				
			}

		}

		if(head.data%2==1)
		{
			ListNode currnode=head;

			ListNode temp=head.next;

			while(currnode.next.data%2==0)
				currnode=currnode.next;

			ListNode temp2=currnode.next;
			currnode.next=head;
			head.next=temp2;

			head=temp;
		}

		return head;
	


	}
}
