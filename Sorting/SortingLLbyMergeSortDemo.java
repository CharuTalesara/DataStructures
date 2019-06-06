

public class SortingLLbyMergeSortDemo
{
	public static void main(String args[])
	{
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.insert(40);
		sll.insert(20);
		sll.insert(60);
		sll.insert(10);
		sll.insert(50);
		sll.insert(30);

		SortingLLUsingMergeSort s=new SortingLLUsingMergeSort(sll.head);
		
		System.out.println(s.getMiddle(s.sll.head).data);
		
		ListNode head=s.mergeSort(s.sll.head);

		sll.head=head;
		sll.print();
	}
}
