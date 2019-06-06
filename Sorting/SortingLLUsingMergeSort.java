

public class SortingLLUsingMergeSort
{
	SinglyLinkedList sll;

	public SortingLLUsingMergeSort(ListNode head)
	{
		sll=new SinglyLinkedList();
		sll.head=head;
		sll.print();
	}

	public ListNode mergeSort(ListNode head)
	{
		if(head==null || head.next==null)
			return head;

		ListNode middle=getMiddle(head);
		ListNode middlesnext=middle.next;

		middle.next=null;

		ListNode left=mergeSort(head);
		ListNode right=mergeSort(middlesnext);
		
		return merge(left,right);
	}

	public ListNode merge(ListNode left,ListNode right)
	{
		if(left==null && right==null)
			return null;

		if(right==null)
			return left;

		if(left==null)
			return right;

		
		ListNode head=left;

		if(left.data>right.data)
		{
			head=right;
			head.next=merge(left,right.next);			
		}
		else
		{
			head.next=merge(left.next,right);
		}
		
		return head;
	}

	public ListNode getMiddle(ListNode head)
	{
		if(head==null || head.next==null)
			return head;
		
		ListNode fastptr=head.next;
		ListNode slowptr=head;

		while(fastptr!=null)
		{
			fastptr=fastptr.next;
			
			if(fastptr!=null)
			{
				slowptr=slowptr.next;
				fastptr=fastptr.next;
			}
		}

		return slowptr;
	}
	
}
