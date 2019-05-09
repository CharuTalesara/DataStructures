
// Computes minimum of the stack with O(1)

public class AdvancedStack extends ArrayStack
{
	ArrayStack mins=new ArrayStack();

	public void push(Object element) throws StackFullException
	{
		if(mins.isEmpty())
		{
			mins.push(element);
		}		
		else
		{
			if(Integer.parseInt(mins.top().toString())> Integer.parseInt(element.toString()))
			{
				mins.push(element);
			}
		}
		super.push(element);
	}

	public Object pop() throws StackEmptyException
	{
		if(mins.isEmpty())
		{
			return null;
		}		
		else
		{
			if(Integer.parseInt(mins.top().toString())== Integer.parseInt(S[super.size()-1].toString()))
			{
				mins.pop();
				
			}
		}
		return super.pop();
	}

	public void printStack()
	{
		super.printStack();
		for(int i=0;i<mins.size();i++)
			System.out.print(mins.S[i].toString()+" ");
		System.out.println();
	}
	
	public Object getmin()
	{
		return mins.top();
	}
}

	
