package linkdelists;

import java.util.LinkedList;
import java.util.List;

public class LoopInLL
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
		
	//	sll.print();
		
		sll.insert(9,sll.search(4));
		sll.print();
		
		//System.out.println(sll.search(9).next.data);
		System.out.println(loopStartingNode(sll.head).data);
		System.out.println(Looplength(sll.head));
		System.out.println(listLength(sll.head));
		
	}
	
	public static boolean loopdetect(ListNode head)
	{
		ListNode currnode=head;
		
		ListNode slwptr=head;
		ListNode fstptr=head;
		
		while(slwptr!=null && fstptr!=null && fstptr.next!=null)
		{
			slwptr=slwptr.next;
			fstptr=fstptr.next;
			
			if(fstptr.next!=null)
				fstptr=fstptr.next;
			
			if(slwptr==fstptr)
				return true;
			
		}
		
		return false;
	}
	
	public static int Looplength(ListNode head)
	{
		if(head==null)
			return 0;
		
		int count=1;
		
		ListNode stpt=loopStartingNode(head);
		ListNode currnode=stpt;
		
		while(currnode.next!=stpt)
		{
			count++;
			currnode=currnode.next;
			
			
		}
		return count;
	}
	
	public static ListNode loopStartingNode(ListNode head)
	{
		if(loopdetect(head)==false)
			return null;
		
		ListNode currnode=head;
		
		ListNode slwptr=head;
		ListNode fstptr=head;
		
		while(slwptr!=null && fstptr!=null && fstptr.next!=null)
		{
			slwptr=slwptr.next;
			fstptr=fstptr.next;
			
			if(fstptr.next!=null)
				fstptr=fstptr.next;
			
			if(slwptr==fstptr)
			{
				slwptr=head;
				break;
			}
		}
		
		while(slwptr!=fstptr)
		{
			slwptr=slwptr.next;
			fstptr=fstptr.next;
		}
		
		return slwptr;
	}
	
	public static int listLength(ListNode head)
	{
		int count = Looplength(head);
		
		ListNode loopstart=loopStartingNode(head);
		
		ListNode currnode=head;
		
		while(currnode!=loopstart)
		{
			count++;
			currnode=currnode.next;
		}
		return count;
	}
	
}
