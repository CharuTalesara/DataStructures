
/*
Given two sorted linkedlist ..we need to merge them in sorted order

*/


public class Merge2LL
{
	public static void main(String args[])
	{
		SinglyLinkedList sll1=new SinglyLinkedList();

		sll1.insert(1,1);
		sll1.insert(3,2);
		sll1.insert(5,3);
		sll1.insert(7,4);
		sll1.insert(8,5);
		
		sll1.print();			

		SinglyLinkedList sll2=new SinglyLinkedList();

		sll2.insert(0,1);
		sll2.insert(2,2);
		sll2.insert(4,3);
		sll2.insert(6,4);
		//sll1.insert(8,5);
		
		sll2.print();
		
		merge(sll1.head,sll2.head);

		ListNode head=mergedRec(sll1.head,sll2.head);

		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
	}

	public static ListNode merge(ListNode head1,ListNode head2)
	{
		SinglyLinkedList mergedLL=new SinglyLinkedList();

		ListNode node1=head1;
		ListNode node2=head2;

		

		while(node1!=null && node2!=null)
		{
			if(node1.data<node2.data)
			{
				mergedLL.insert(node1.data);
				node1=node1.next;			
			}		
			else	
			{
				mergedLL.insert(node2.data);		
				node2=node2.next;
			}
		}

		if(node1==null)
		{
			while(node2!=null)
			{
				mergedLL.insert(node2.data);		
				node2=node2.next;
			}
		}

		if(node2==null)
		{
			while(node1!=null)
			{
				mergedLL.insert(node1.data);		
				node1=node1.next;
			}
		}

		mergedLL.print();

		return mergedLL.head;
		
	}


	public static ListNode mergedRec(ListNode head1,ListNode head2)
	{
		if(head1==null)
			return head2;

		if(head2==null)
			return head1;

		ListNode node=new ListNode(0);

		if(head1.data<head2.data)
		{
			node=head1;
			node.next=mergedRec(head1.next,head2);
		}
		else
		{
			node=head2;
			node.next=mergedRec(head1,head2.next);
		}	
		return node;

	}
}
