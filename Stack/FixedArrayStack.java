import java.util.Scanner;


public class FixedArrayStack
{
	public static void main(String args[])
	{
		System.out.println("<<<<<<<<<<<<<<<Welcome to the world of stacks>>>>>>>>>>>");
		
		//stack.push(1);
		//System.out.println(stack.getTopIndex());
		choosOps();
		
	}

	public static void choosOps()
	{
		System.out.println("Press 0 to exit ..else continue");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==0)
			System.exit(0);
		Stack stack=new Stack();
		while(choice!=0)
		{
			
			System.out.println("Press 0 to exit ..else continue");
			System.out.println("Press 1 to push an element to the stack");
			System.out.println("Press 2 to pop the element");
			System.out.println("Press 3 to get the top element index");
			System.out.println("Press 4 to check if stack is full");
			System.out.println("Press 5 to check if stack is empty");
			
			choice=sc.nextInt();
			switch(choice)
			{
				case 1 : System.out.println("Enter the element to push");
					 int item=sc.nextInt();
					 stack.push(item);
					 break;
				case 2 : System.out.println(stack.pop());
					 stack.printStack();
					 break;
				case 3 : stack.getTopIndex();
					 break;
				case 4 : System.out.println(stack.isStackFull());
					 break;
				case 5 : System.out.println(stack.isStackEmpty());
					 break;
				
			}
		}
	}
}


class Stack
{
	final int CAPACITY = 10;
	int top; // gives the index of the last element inserted
	int size;
	int[] stackarray;

	public Stack()
	{
		top=-1;
		size=0;	
		stackarray=new int[CAPACITY];
	}

	public void push(int item)
	{
		if(top+1==CAPACITY)
		{
			System.out.println("<<<<< Stack is Full>>>>>");
			return;
		}
		top++;
		stackarray[top]=item;
		printStack();
	}

	public int getTopIndex()
	{
		return top;
	}

	public int pop()
	{
		if(top==-1)
		{
			System.out.println("********No element to pop*****************");
			return -1;
		}
		int popIndex=top;
		top--;
		return stackarray[popIndex];
		
	}

	public boolean isStackEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}

	public boolean isStackFull()
	{
		if(top+1==CAPACITY)
			return true;
		else
			return false;
	}

	public void printStack()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.print(stackarray[i]+" ");
		}
		System.out.println();
	}
}
