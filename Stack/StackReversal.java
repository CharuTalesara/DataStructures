/*
Reverse the elements of the stack -
eg- 10,8,7,5
output- 5,7,8,10
*/


public class StackReversal
{
	public static void main(String args[])
	{
		ArrayStack s=new ArrayStack();
		s.push(10);
		s.push(8);
		s.push(7);
		s.push(5);
		System.out.println(s.top().toString());
		reversal1(s);
		System.out.println(s.top().toString());
		reversal2(s);
		System.out.println(s.top().toString());
	}
	

	// Using an array to shore the elements -- Hence space complexity O(n) and time O(n)
	public static void reversal1(ArrayStack s)
	{
		int[] a=new int[s.size()];
		int i=0;
		while(!s.isEmpty())
		{
			a[i]=((Integer)s.pop()).intValue();
			i++;
		}
		int j=0;
		while(j<a.length)
		{
			s.push(a[j]);
			j++;
		}

		System.out.println(s.top().toString());	
	}

	// Using operations push n pop --extensive use of recursion

	public static void reversal2(ArrayStack s)
	{
		if(s.isEmpty() )
			return;
		int temp=((Integer)s.pop()).intValue();
		reversal2(s);
		insertAtBottom(s,temp);

	}


	private static void insertAtBottom(ArrayStack s,int data)
	{
		if(s.isEmpty())
		{
			s.push(data);
			return;
		}

		int temp=((Integer)s.pop()).intValue();
		insertAtBottom(s,data);
		s.push(temp);
	}
}
