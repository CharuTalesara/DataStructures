
/*
Given a linkedlist l1->l2->l3->l4->....->ln-1->ln
output-	l1->ln->l2->ln-1....

*/


public class ReorderLists
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
		sll.insert(10,10);

		sll.print();
		reorder(sll.head,sll.length);
		
	}


	public static void reorder(ListNode head,int n)
	{
		int mid=n/2;

		ListNode currnode=head;
		
		for(int i=0;i<mid-1;i++)
			currnode=currnode.next;

		ListNode newhead=currnode.next;
		currnode.next=null;
	
		ListNode curr1=head;
		ListNode curr2=newhead;


		print(head);

		print(newhead);

		ArrayStack stack=new ArrayStack();
		
		while(curr2!=null)
		{
			stack.push(curr2);
			curr2=curr2.next;
		}
		
		while(curr1!=null || !stack.isEmpty())
		{
			ListNode node=(ListNode)(stack.pop());
			ListNode temp2=curr1.next;
			
			curr1.next=node;
			node.next=temp2;

			curr1=temp2;			
		
		}

		print(head);
	}

	public static void print(ListNode currnode)
	{
		while(currnode!=null)
		{
			System.out.print(currnode.data+" ");
			currnode=currnode.next;
		}
		System.out.println();
	}
}
