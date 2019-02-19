import java.util.Scanner;


public class ArrayWithTwoStacksExample
{
	public static void main(String args[])
	{
		System.out.println("<<Two Stacks Not Two States >>>>");
		choosOps();
	}

	public static void choosOps()
	{
		System.out.println("Press 0 to exit ..else continue");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==0)
			System.exit(0);
		ArrayWithTwoStacks ast=new ArrayWithTwoStacks(5);
		while(choice!=0)
		{
			
			System.out.println("Press 0 to exit ..else continue");
			System.out.println("Press 1 to push an element to the stack");
			System.out.println("Press 2 to pop the element");
			System.out.println("Press 3 to get the top element");
			System.out.println("Press 4 to check if stack is empty");
			
			choice=sc.nextInt();
			switch(choice)
			{
				case 1 : System.out.println("Enter the stackID you want to push element to");
					 int stackID1=sc.nextInt();
					 System.out.println("Enter the element to push");
					 int item=sc.nextInt();
					 ast.push(stackID1,item);
					 ast.printStacks();
					 break;
				case 2 : System.out.println("Enter the stackID you want to pop element from");
					 int stackID2=sc.nextInt();
					 System.out.println(ast.pop(stackID2));
					 ast.printStacks();
					 break;
				case 3 : System.out.println("Enter the stackID you want to know top element of");
					 int stackID3=sc.nextInt();
					 System.out.println((ast.top(stackID3).toString()));
					 break;
				case 4 : System.out.println("Enter the stackID you want to know if empty");
					 int stackID4=sc.nextInt();
					 System.out.println(ast.isEmpty(stackID4));
					 break;
				
				
			}
		}
	}
}
