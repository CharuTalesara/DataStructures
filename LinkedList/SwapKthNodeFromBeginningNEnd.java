package linkdelists;

import java.util.Stack;

public class SwapKthNodeFromBeginningNEnd {

	public static void main(String[] args) 
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
		sll.insert(9,9);
		sll.insert(10,10);
		
		sll.print();
		
		swapKthNodes(sll.head,2);

	}
	
	public static ListNode swapKthNodes(ListNode head,int k)
	{
		if(head==null)
			return null;
		
		Stack<ListNode> stack=new Stack<>();
		
		ListNode currnode=head;
		int llength=0;
		
		while(currnode!=null)
		{
			stack.push(currnode);
			llength++;
			currnode=currnode.next;
		}
		
		if(k>llength)
			return head;
		
		int count=1;
		
		ListNode kprev=head;
		ListNode kcur=head;
		
		currnode=head;
		
		while(count<k && currnode!=null)
		{
			count++;
			kprev=kcur;
			currnode=currnode.next;
			kcur=currnode;
			
		}
		
		count=1;
		
		ListNode klast=head;
		ListNode kpnext=head;
		
		klast=stack.peek();
		kpnext=stack.peek();
		
		while(count<=k)
		{
			count++;
			klast=stack.pop();
			kpnext=stack.peek();
		}
		
		ListNode temp1=klast.next;
		if(k!=1)
			kprev.next=klast;
		klast.next=kcur.next;
		kpnext.next=kcur;
		kcur.next=temp1;
		
		if(k==1)
			head=klast;
		
		currnode=head;
		
		while(currnode!=null)
		{
			System.out.print(currnode.data+" ");
			currnode=currnode.next;
			//Thread.sleep(100000);
		}
		
		
		return head;
	}

}
