
/*
Check if a linkedList is palindrome or not
*/

public class CheckIfLLPalindrome
{
	public static void main(String args[])
	{
		SinglyLinkedList sll=new SinglyLinkedList();

		sll.insert(1,1);
		sll.insert(2,2);
		sll.insert(3,3);
		sll.insert(2,4);
		sll.insert(1,5);
		//sll.insert(6,6);

		sll.print();

		System.out.println("If Palindrome : "+checkpalindrome(sll.head,sll.getLength()));
	}

/*
	Insert elements of ll in the stack 
	and check stack top and currentnode
		
	Time Complexity-O(n)
	Space Complexity-O(n)



Another algo-
	reverse the second half of the linkdelist and compare the first and the second half	

	O(n) and O(1)-time and space complexity

*/
	public static boolean checkpalindrome(ListNode head,int n)
	{
		
		ArrayStack stack=new ArrayStack();
		
		ListNode currnode=head;

		while(currnode!=null)
		{
			stack.push(currnode.data);
			currnode=currnode.next;
		}

		System.out.println("Printing Stack");
		stack.printStack();

		currnode=head;
		while(!stack.isEmpty() && currnode!=null && (Integer)stack.top()==currnode.data)
		{
			stack.pop();
			currnode=currnode.next;
		}
		
		if(stack.isEmpty() && currnode==null)
			return true;
			
		return false;
	}

	

}
