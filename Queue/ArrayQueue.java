/*
*/


import java.util.*;

public class ArrayQueue
{
	public static void main(String args[])
	{
		System.out.println("Welcome ..Lets start the Queues");
		choosOps();
	}

	public static void choosOps()
	{
		System.out.println("Press 0 to exit ..else continue");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==0)
			System.exit(0);
		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(5);
		while(choice!=0)
		{
			
			System.out.println("Press 0 to exit ..else continue");
			System.out.println("Press 1 to enqueue");
			System.out.println("Press 2 to dequeue");
			System.out.println("Press 3 to check if queue is full");
			System.out.println("Press 4 to check if queue is empty");
			
			choice=sc.nextInt();
			switch(choice)
			{
				case 1 : System.out.println("Enter the element to enqueue");
					 int item=sc.nextInt();
					 q.enQueue(item);
					 break;
				case 2 : System.out.println(q.dequeue());
					 break;
				case 3 : System.out.println(q.isFull());
					 break;
				case 4 : System.out.println(q.isEmpty());
					 break;
				
			}
			q.printQ();
		}
	}
}
