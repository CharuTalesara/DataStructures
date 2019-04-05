/*
LL- 1->2->3->4->5->6->null
o/p- 2->1->4->3->6->5->null

*/

public class ReverseAdjacentNodesLL
{
	public static void main(String args[])
	{
		SinglyLinkedList sll=new SinglyLinkedList();

		sll.insert(1,1);
		sll.insert(2,2);
		sll.insert(3,3);
		sll.insert(4,4);
		sll.insert(5,5);
		sll.insert(6,6);
		sll.insert(7,7);
		sll.insert(8,8);
		sll.insert(9,9);
		/*sll.insert(10,10);*/

		sll.print();
		reverseadjacent(sll.head);

	}

	public static ListNode reverseadjacent(ListNode head)
	{
		if(head.next==null)
			return head;

		ListNode currnode=head;
		ListNode prev=head;

		head=head.next;

		ListNode nextcurr=currnode.next.next;
		

		while(currnode!=null && currnode.next!=null)
		{
			ListNode temp=currnode.next;

			nextcurr=temp.next;
	
			temp.next=currnode;

			prev.next=temp;

			prev=currnode;

			currnode=nextcurr;
				
		}

		prev.next=currnode;

		ListNode node=head;

		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}

		return head;
	}
}
