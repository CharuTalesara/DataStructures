

public class StackWithPQDemo
{
	public static void main(String args[])
	{
		StackWithPQ stack=new StackWithPQ();

		stack.push(2);
		stack.push(1);
		stack.push(3);
		stack.push(0);
		stack.pq.printHeap();

		System.out.println(stack.getTop());

		System.out.println(stack.pop());
		stack.pq.printHeap();

		stack.push(4);
		stack.pq.printHeap();

		stack.push(0);
		stack.pq.printHeap();

		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
			stack.pq.printHeap();	
		}
	}
}
