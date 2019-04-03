/*

Suppose there are two linkedLists both of which intersects at some point and becomes a single linkedlist.
The head pointers of both the lists are known but the intersecting point is not known.
Also the number of nodes before the lists intersects is not known and may be different in each list.

Give an algorithm to find the merging point.

*/


public class IntersectingPointLLs
{
	public static void main(String args[])
	{
		SinglyLinkedList sll1=new SinglyLinkedList();

		sll1.insert(1,1);
		sll1.insert(5,2);
		sll1.insert(9,3);
		sll1.insert(4,4);
		sll1.insert(6,5);
		sll1.insert(3,6);
		sll1.insert(2,7);
		sll1.insert(8,7);

		System.out.println("Lisked List 1 before merging");
		sll1.print();


		SinglyLinkedList sll2=new SinglyLinkedList();

		sll2.insert(1,1);
		sll2.insert(2,2);
		sll2.insert(3,3);
		sll2.insert(4,4);
		sll2.insert(5,5);
		sll2.insert(10,6);
		sll2.insert(15,7);
		System.out.println("Lisked List 2 before merging");
		sll2.print();


		sll2.search(15).next=sll1.search(3);

		System.out.println("Lisked List 1 and 2 after merging");
		sll1.print();
		sll2.print();

		System.out.println("Length of List 1 :"+sll1.getLength());		
		System.out.println("Length of List 2 :"+sll2.getLength());

		System.out.println("Intersection of Lists : "+intersectingNodeWithStacks(sll1.head,sll2.head));

		System.out.println("Efficent algo "+intersectingNode(sll1.head,sll2.head));
	}


/*
Create 2 stacks for both the linkedlists and pop their elements till they are same..the same algo is implemented below

Another way- create an array that contains the next address of each node of both the lists and get the first repeating elemt.

Both the above algos taken O(m+n);
 
*/

	public static int intersectingNodeWithStacks(ListNode head1,ListNode head2)
	{
		ArrayStack stackLL1=new ArrayStack();
		ArrayStack stackLL2=new ArrayStack();

		ListNode curr1=head1;
		ListNode curr2=head2;

		while(curr1!=null)
		{
			stackLL1.push(curr1.data);
			curr1=curr1.next;
		}

		System.out.println("Printing Stack1");
		stackLL1.printStack();

		while(curr2!=null)
		{
			stackLL2.push(curr2.data);
			curr2=curr2.next;
		}
		System.out.println("Printing Stack1");
		stackLL2.printStack();

		int ret=0;

		while(stackLL1.top()==stackLL2.top())
		{
			ret=(Integer)stackLL1.top();
			stackLL1.pop();
			stackLL2.pop();
		}
	
		return ret;
		
	}

/*
Another algo- the most effiecient algo-->O(max(m,n))

Calcuate lengths of both the lists  (l1 and l2)

traverse the longer one d times (d=|l1-l2|)

traverse both the lists togehter till the same node is encountered

*/

	public static int intersectingNode(ListNode head1,ListNode head2)
	{
		ListNode curr1=head1;

		ListNode curr2=head2;

		int l1=0;
		int l2=0;

		while(curr1!=null)
		{
			l1++;
			curr1=curr1.next;
		}
		while(curr2!=null)
		{
			l2++;
			curr2=curr2.next;
		}

		System.out.println("l1 "+l1 +" l2"+l2);

		int d=0;
		
		ListNode travNode1=head1;
		ListNode travNode2=head2;
		
		if(l1>l2)
			d=l1-l2;
		else
		{
			d=l2-l1;
		}
		
		for(int i=0;i<d;i++)
		{
			if(l1>l2)
				travNode1=travNode1.next;
			else
				travNode2=travNode2.next;
		}
		
		while(travNode1.data!=travNode2.data)
		{
			travNode1=travNode1.next;
			travNode2=travNode2.next;
		}

		return travNode2.data;
	}

}
