/*
LinkedList implementation of Stack 
*/

public class LinkedStack
{
	public static void main(String args[])
	{
		StackLinkedList sll=new StackLinkedList();
		System.out.println("Empty : "+sll.isEmpty());
		sll.push(1);
		sll.print();
		sll.push(2);
		sll.print();
		sll.push(3);
		sll.print();
		System.out.println("Empty : "+sll.isEmpty());
		System.out.println("Popped element : "+sll.pop());
		sll.print();

		System.out.println("Popped element : "+sll.pop());
		sll.print();

		System.out.println("Popped element : "+sll.pop());
		sll.print();

		System.out.println("Popped element : "+sll.pop());
		sll.print();
	}
}


class StackNode
{
	int data;
	StackNode next;

	public StackNode(int x)
	{
		this.data=x;
		next=null;
	}
}

class StackLinkedList
{
	StackNode top;
	int length;

	public 	StackLinkedList()
	{
		top=null;
		length=0;
	}

	public void push(int x)
	{
		StackNode temp=new StackNode(x);
		temp.next=top;
		top=temp;
		length++;
	}

	public int pop() throws StackEmptyException
	{
		if(isEmpty())
			throw new StackEmptyException("Stack is Empty");
		StackNode temp=top;
		int ret=temp.data;
		top=top.next;
		temp=null;
		length--;
		return ret;
	}

	public int getTop()
	{
		if(size()==0)
			return -1;
		else
			return top.data;
	}

	public boolean isEmpty()
	{
		return length==0;
	}

	public int size()
	{
		return length;
	}

	public void print()
	{
		StackNode currnode=top;
		System.out.println("Size : "+size());
		while(currnode!=null)
		{
			System.out.print(currnode.data+" ");
			currnode=currnode.next;
		}
		System.out.println();
		System.out.println("Top : "+getTop());
		System.out.println("****************");
	}
}
