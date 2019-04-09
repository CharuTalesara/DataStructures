/*

Given 2 LLs representing two non negative numbers.The digits are stored in reverse order and each of their nodes contains a single digit. Add the two numbers and return that as a linked list.

For eg- 3->4->3 + 5->6->4 => 8->0->8


*/

public class Add2LLs
{
	public static void main(String args[])
	{
		SinglyLinkedList sll=new SinglyLinkedList();

		sll.insert(1,1);
		sll.insert(2,2);
		sll.insert(3,3);
		sll.insert(4,4);
		sll.insert(5,5);

		sll.print();

		SinglyLinkedList sll1=new SinglyLinkedList();

		sll1.insert(6,1);
		sll1.insert(7,2);
		sll1.insert(8,3);
		sll1.insert(9,4);
		sll1.insert(1,5);

		sll1.print();

		add(sll.head,sll1.head);
	}

	public static void add(ListNode head1,ListNode head2)
	{
		ListNode curr1=head1;
		ListNode curr2=head2;

		SinglyLinkedList sll=new SinglyLinkedList();
		int insertat=1;
		
		while(curr1!=null && curr2!=null)
		{
			int  data=curr1.data+curr2.data;

			if(data>9)
			{
				int temp=data;
				data=data%10;
				temp=temp/10;
				curr1.next.data=temp+curr1.next.data;
			}
			
			sll.insert(data,insertat);
		
			insertat++;
			curr1=curr1.next;
			curr2=curr2.next;			
		} 	

		sll.print();
	}
}
