

public class InsertInSortedList
{
	public static SinglyLinkedList sll=new SinglyLinkedList();

		
	public static void main(String args[])	
	{
		sll.insert(1,1);
		sll.insert(2,2);
		sll.insert(3,3);
		;
		sll.insert(5,4);
		sll.insert(6,5);
		sll.insert(7,6);

		sll.print();

		insertSorted(0);
		sll.print();

		insertSorted(4);
		sll.print();

		insertSorted(8);
		sll.print();
	}

	public static ListNode insertSorted(int key)
	{
		ListNode node=new ListNode(key);
		sll.length++;
		
		if(sll.head.data>key)
		{
			node.next=sll.head;
			sll.head=node;
			return sll.head;
		}

		ListNode currnode=sll.head;

		while(currnode.next!=null && currnode.next.data<key)
			currnode=currnode.next;

		node.next=currnode.next;
		currnode.next=node;		
	
		return sll.head;
	}
}

		
