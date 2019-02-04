//Time Series Example 

public class ComputeSpan1
{
	public static void main(String args[])
	{
		int[] a={3,1,5,4,8,7,10,20,23,14};
		compute1(a,a.length);
		computeWithStack(a,a.length);
	}

	public static void computeWithStack(int[] a,int n)
	{ 
		ArrayStack d=new ArrayStack(n);
		int[] s=new int[n];
		for(int i=0;i<n;i++)
		{
			int h=0;
			boolean done = false;
			
			while(!(d.isEmpty() || done))
			{
				if(a[i]>=a[((Integer) d.top()).intValue()])
					d.pop();
				else
					done=true;
			}
			if(d.isEmpty())
				h=-1;
			else
				h=((Integer)d.top()).intValue();
			s[i]=i-h;
			d.push(i);
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			System.out.print(s[i]+" ");
		}
		System.out.println();
	}

	public static void compute1(int[] a,int n)
	{
		int[] s=new int[n];
		
		for(int i=0;i<n;i++)
		{
			int k=0;
			boolean done=false;
			while(k<=i && done==false )
			{
				if(a[i-k]<=a[i])
				{	
					k++;
				}
				else 
					done=true;
				
			}
			s[i]=k;
			System.out.println(s[i]);
		}

		
	}	
}
