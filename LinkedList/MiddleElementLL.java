

public class MiddleElementLL
{
	public static SinglyLinkedList sll=new SinglyLinkedList();

	public static void main(String args[])
	{
		sll.insert(1,1);
		sll.insert(4,2);
		sll.insert(3,3);
		sll.insert(2,4);
		sll.insert(5,5);
		//sll.insert(2,6);

		sll.print();

		System.out.println(middleNode().data);
	}
	
	public static ListNode middleNode()
	{
		int n=sll.getLength();
		
		ListNode currnode=sll.head;

		for(int i=0;i<n/2;i++)
			currnode=currnode.next;

		return currnode;
		
	}
}
