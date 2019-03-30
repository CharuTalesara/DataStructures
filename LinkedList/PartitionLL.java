/*
Given a linkedList and a value k; partition it such that all the nodes less than k come before nodes greater than or equal to k
The original relative order of the nodes in each of the two partitions should be preserved

1->4->3->2->5->2 k=3 ===> 1->2->2->4->3->5


*/

public class PartitionLL
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
		//partition(3);
		//sll.print();

		partition2(3);
		sll.print();

		

	}


	// Just changes the data of the nodes ..not the links ...
	public static ListNode partition(int k)
	{
		ListNode currnode=sll.head;

		while(currnode!=null)
		{
			if(currnode.data>=k)
			{
				ListNode lnode=currnode.next;
	
				while(lnode !=null && lnode.data>=k)
					lnode=lnode.next;

				int temp=currnode.data;
				currnode.data=lnode.data;
				lnode.data=temp;

				if(lnode.next==null)
					break;
			}

			currnode=currnode.next;
		}

		return sll.head;
	}
}
