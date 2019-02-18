/*

Recursively remove all adjacnet duplicates : Given an array of numbers, recursively remove adjacent duplicate numbers.
The output array should not have any adjacent duplicates
eg- 1,5,6,8,8,8,0,1,1,0,6,5 - Output-1
    1,9,6,8,8,8,0,1,1,0,6,5- Output-1,9,5
*/



public class RemoveAdjacentDuplicates
{
	public static void main(String args[])
	{
		int[]a ={1,5,6,8,8,8,0,1,1,0,6,5};
		int[] b={1,9,6,8,8,8,0,1,1,0,6,5};
		int[] c={1,9,6,8,8,8,8,6,0,1,1,1,0,6,0,0,6};
		removeadjdupli(a);
		removeadjdupli(b);
		removeadjdupli(c);
		System.out.println(" ");
		removeadjdupli2(a);
		removeadjdupli2(b);
		removeadjdupli2(c);
	}


	//Stack implementation of the given problem

	public static void removeadjdupli(int[] a)
	{
		ArrayStack s =new ArrayStack(a.length);
		int i=0;
		int c=-1;
		while(i<a.length)
		{		
			if(!s.isEmpty() && a[i]==((Integer)s.top()).intValue())
			{
				i++;
				c++;
			}
			else
			{
				if(c==-1)
				{
					s.push(a[i]);
					i++;
				}
				else
				{
					s.pop();
					c=-1;
					if(a[i]==((Integer)s.top()).intValue())
						s.pop();
					else
						s.push(a[i]);
					i++;
				}
			}
		}
		while(!s.isEmpty())
		{
			System.out.print(((Integer)s.pop()).intValue());
		}
		System.out.println();
	}

	//Array Implementation of the given problem..
	public static void removeadjdupli2(int[] a)
	{
		int c=-1;
		int i=0;
		while(i<a.length)
		{
			if(c==-1 || a[c]!=a[i])
			{
				c++;
				a[c]=a[i];
				i++;
			}
			else
			{
				while(i<a.length && a[c]==a[i])
					i++;
				c--;		
			}
		}
		for(int j=0;j<=c;j++)
		{
			System.out.print(a[j]+" ");
		}
		System.out.println();
	}
	
}
