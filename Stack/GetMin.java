


public class GetMin
{
	public static void main(String args[])
	{
		ArrayStack s=new ArrayStack();
		s.push(5);
		s.push(1);
		s.push(10);
		s.push(0);
		System.out.println(getmin1(s));

		AdvancedStack as=new AdvancedStack();
		as.push(5);
		as.push(1);
		as.push(10);
		as.push(0);
		System.out.println(as.getmin());
	}

	//Below method calculates the min of the given stack with Order n   
	public static String getmin1(ArrayStack s)
	{
		ArrayStack mins=new ArrayStack();
		while(!s.isEmpty())
		{
			if(!(mins.isEmpty()) &&  Integer.parseInt((s.top()).toString())< Integer.parseInt((mins.top()).toString())  )
			{
				mins.pop();
				Object ele=s.pop();
				mins.push(ele);
			}
			else if(mins.isEmpty())
			{
				Object ele=s.pop();
				mins.push(ele);
			}
			else
				s.pop();
		}
		
		return (mins.pop()).toString();
	}
}
