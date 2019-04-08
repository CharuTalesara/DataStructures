
/*
Given two sorted linkde lists,give an algorithm for printing the common elements

*/



public class CommonElements
{
	public static void main(String args[])
	{
		SinglyLinkedList sll=new SinglyLinkedList();

		sll.insert(1,1);
		sll.insert(2,2);
		sll.insert(3,3);
		sll.insert(4,4);
		sll.insert(8,5);
		sll.insert(16,6);
		sll.insert(17,7);
		/*sll.insert(8,8);
		sll.insert(9,9);
		sll.insert(10,10);*/

		sll.print();


		SinglyLinkedList sll2=new SinglyLinkedList();

		sll2.insert(0,1);
		sll2.insert(2,2);
		sll2.insert(4,3);
		sll2.insert(6,4);
		sll2.insert(7,5);
		sll2.insert(8,6);
		sll2.insert(10,7);
		sll2.insert(11,8);
		sll2.insert(16,9);
		
		sll2.print();

		printCommon(sll.head,sll2.head);
	}


		
	public static void printCommon(ListNode head1,ListNode head2)
	{
		ListNode ll1=head1;
		ListNode ll2=head2;
		

		while(ll1!=null && ll2!=null)
		{
			if(ll1.data==ll2.data)
			{
				System.out.print(ll1.data+" ");
				ll1=ll1.next;
				ll2=ll2.next;
			}		
			else if(ll1.data>ll2.data)
				ll2=ll2.next;
			else
				ll1=ll1.next;

		}

		System.out.println();
	}
}
