/*
Given a singlyLinedlist find the last element from the beginning whose n%k==0, n=total nodes k=integer
	n=19,k=3 -> return 18th node
 
*/



public class FindModularNodeLL
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
		//sll.insert(9,9);
		/*sll.insert(10,10);*/

		sll.print();

		System.out.println("N : "+sll.getLength()+" k : 3 "+"Node data : "+modularNode(sll.head,sll.getLength(),3).data);

		System.out.println("N : "+sll.getLength()+" k : 4 "+"Node data : "+modularNode(sll.head,sll.getLength(),4).data);

		System.out.println("N : "+sll.getLength()+" k : 5 "+"Node data : "+modularNode(sll.head,sll.getLength(),5).data);
	}

	public static ListNode modularNode(ListNode head,int n,int k)
	{
		int max=n/k;

		ListNode currnode=head;		

		for(int i=1;i<max*k;i++)
			currnode=currnode.next;

		return currnode;
	}
}
