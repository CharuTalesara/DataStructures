// Given an oredered list ..remove duplicates in it


import java.util.*;

public class RemoveUnorderedDuplicates
{
	public static void main(String args[])
	{
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.insert(1,1);
		sll.insert(2,2);
		//sll.insert(2,2);
		sll.insert(3,3);
		sll.insert(1,4);
		sll.insert(2,5);
		sll.insert(3,6);
		sll.insert(4,7);
		sll.insert(6,8);
		sll.insert(7,9);
		sll.insert(4,10);
		sll.insert(8,11);
		//sll.insert(5,12);

		sll.print();
		removedup(sll.head);
		sll.print();

	}


	public static ListNode removedup(ListNode head)
	{
		ListNode currnode=head;
		ListNode prev=head;

		Hashtable<Integer,Integer> hm =new Hashtable<Integer, Integer>(); 
  
	
		while(currnode.next!=null)
		{
			if(hm.size()==0)
			{
				hm.put(currnode.data,currnode.data);
				currnode=currnode.next;
			}
			else
			{
				if(!hm.containsKey(currnode.data))
				{
					hm.put(currnode.data,currnode.data);
					prev=currnode;
					currnode=currnode.next;
				}
				else
				{
					prev.next=currnode.next;
					currnode=currnode.next;					
				}
			}			
		}
	
		System.out.println(hm);
		
		return head;
	}
}
