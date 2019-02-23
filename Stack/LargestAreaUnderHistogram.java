/*
Given an array with heights of rectangle(breadth being 1) wen need to find out the largest rectangle  possible.
eg. - 3,2,5,6,1,4,4 -- area=10;
*/

public class LargestAreaUnderHistogram
{
	public static void main(String args[])
	{
		int[] a={3,2,5,6,5,1,4,4};
		System.out.println(maxhistarea(a));
		int[] b={3,2,5,6,5,500,1,4,4};
		System.out.println(maxhistarea(b));
		System.out.println();
		System.out.println(maxhistarea1(b));
		System.out.println(maxhistarea1(a));
	}
		
	// Taking O(n*n) time 
	public static int maxhistarea(int[] a)
	{
		int maxarea=0;
		int area=0;
		
		for(int i=0;i<a.length;i++)
		{
			int b=1;
			int h=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>=a[i])
					b++;
				else
					break;
			}
			area=b*a[i];
			System.out.println(a[i]+" "+area);
			if(area>maxarea)
				maxarea=area;
		}
		return maxarea;
	}

	// With stake -- Order of n

	public static int maxhistarea1(int[] a)
	{
		ArrayStack s=new ArrayStack(a.length);
		int i=0;
		int maxarea=0;
		
		while(i<a.length)
		{
			if(s.isEmpty() || a[((Integer)s.top()).intValue()]<=a[i])
			{
				s.push(i++);
			}
			else
			{
				int top=((Integer)s.pop()).intValue();
				maxarea=Math.max(maxarea,a[top]*(s.isEmpty()?i:i-((Integer)s.top()).intValue()-1));
			}
		}

		while(!s.isEmpty())	
		{
			int top=((Integer)s.pop()).intValue();
			maxarea=Math.max(maxarea,a[top]*(s.isEmpty()?i:i-((Integer)s.top()).intValue()-1));
		}
		return maxarea;
	}
}
