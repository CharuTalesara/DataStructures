/*
Given a list; rotate the list by K places,where k>=0
1->2->3->4->5->null rotate by 2=> 4->5->1->2->3->null..

*/

public class RotateListByK 
{
	public static SinglyLinkedList sll=new SinglyLinkedList();

	public static void main(String args[])
	{
		
		sll.insert(1,1);
		sll.insert(2,2);
		sll.insert(3,3);
		sll.insert(4,4);
		sll.insert(5,5);
		sll.insert(6,6);

		rotatebyK(sll.head,3);
		sll.print();
	}

	public static ListNode rotatebyK(ListNode node,int k)
	{
		if(node==null|| k>sll.getLength())
			return null;
	
		ListNode currnode=sll.head;

		int n=sll.getLength()-k;

		

		while(currnode.next!=null)
			currnode=currnode.next;

		// Linking the last node's next to head(start node)

		currnode.next=sll.head;
		
		ListNode lnode=sll.head;

		for(int i=1;i<n;i++)
		{
			lnode=lnode.next;
		}

		// Changing the head pointer

		sll.head=lnode.next;

		//for termination of the list.

		lnode.next=null;

	
		return sll.head;
	}
}
