
// Given an oredered list ..remove duplicates in it

public class RemoveDuplicates
{
	public static void main(String args[])
	{
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.insert(1,1);
		sll.insert(1,2);
		//sll.insert(2,2);
		sll.insert(1,3);
		sll.insert(2,4);
		sll.insert(2,5);
		sll.insert(3,6);
		sll.insert(3,7);
		sll.insert(3,8);
		sll.insert(3,9);
		sll.insert(4,10);
		sll.insert(4,11);
		//sll.insert(5,12);

		sll.print();
		removedup(sll.head);
		sll.print();

	}


	public static ListNode removedup(ListNode head)
	{
		ListNode currnode=head;

		while(currnode.next!=null)
		{
			if(currnode.data==currnode.next.data)
				currnode.next=currnode.next.next;
			else
				currnode=currnode.next;
		}
	
		return head;
	}
}
