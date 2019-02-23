
public class StackSort
{
	public static void main(String args[])
	{
		ArrayStack stack=new ArrayStack(5);
		stack.push(3);
		stack.push(1);
		stack.push(4);
		stack.push(5);
		stack.push(2);
		stack.printStack();
		sort(stack).printStack();
	}

	//Time Complexity-O(n^2)

	public static ArrayStack sort(ArrayStack stack)
	{
		ArrayStack revstack=new ArrayStack(stack.size());
		
		while(!stack.isEmpty())
		{
			if(revstack.isEmpty())
				revstack.push(stack.pop());
			else
			{
				if(((Integer)stack.top()).intValue()>((Integer)revstack.top()).intValue())
				{
					int x=((Integer)stack.pop()).intValue();
					while( !revstack.isEmpty() && ((Integer)revstack.top()).intValue()<x)
					{
						stack.push(revstack.pop());
					}
					revstack.push(x);
				}
				else
					revstack.push(stack.pop());
			}
		}

		return revstack;
	}
}
