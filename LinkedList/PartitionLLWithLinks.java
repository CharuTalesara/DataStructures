/*
Given a linkedList and a value k; partition it such that all the nodes less than k come before nodes greater than or equal to k
The original relative order of the nodes in each of the two partitions should be preserved
1->4->3->2->5->2 k=3 ===> 1->2->2->4->3->5
*/

public class PartitionLLWithLinks
{
	public static SinglyLinkedList sll=new SinglyLinkedList();
		
	public static void main(String args[])
	{
		sll.insert(1,1);
		sll.insert(4,2);
		sll.insert(3,3);
		sll.insert(2,4);
		sll.insert(5,5);
		sll.insert(2,6);

		sll.print();
		
		partition(3);
		sll.print();

		

	}


	// Partitioning with links Modified

	public static ListNode partition(int k)
	{
		ListNode currnode=sll.head;
		ListNode ls=sll.head;//ls=last smaller
		ListNode lg=sll.head; //lg==last greater 

		while(currnode!=null)
		{
			if(currnode.data>=k)
			{
				lg=currnode;
				currnode=currnode.next;
			}	

			else if(ls!=lg && currnode.data<k)
			{
				lg.next=currnode.next;

				currnode.next=ls.next;

				ls.next=currnode;

				ls=ls.next;

				currnode=lg.next;

				if(lg.next!=null && lg.data<lg.next.data)
					lg=lg.next;
			}
			else
			{
				currnode=currnode.next;
			}
		}

		return sll.head;
	}
}
