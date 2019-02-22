import java.util.Scanner;


public class DynamicArrayStackImplementation
{
	public static void main(String args[])
	{
		System.out.println("<<<<<<<<<<<<<<<Welcome to the world of dynamic stacks>>>>>>>>>>>");
		
		choosOps();
		
	}

	public static void choosOps()
	{
		System.out.println("Press 0 to exit ..else continue");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==0)
			System.exit(0);
		DynamicArrayStack stack=new DynamicArrayStack();
		while(choice!=0)
		{
			
			System.out.println("Press 0 to exit ..else continue");
			System.out.println("Press 1 to push an element to the stack");
			System.out.println("Press 2 to pop the element");
			System.out.println("Press 3 to get the top element ");
			
			choice=sc.nextInt();
			switch(choice)
			{
				case 1 : System.out.println("Enter the element to push");
					 int item=sc.nextInt();
					 stack.push(item);
					 stack.printStack();
					 break;
				case 2 : System.out.println(stack.pop());
					 stack.printStack();
					 break;
				case 3 : stack.top();
					 break;
				
				
			}
		}
	}
}

