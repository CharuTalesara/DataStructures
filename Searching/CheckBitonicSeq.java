/*
Bitonic - increasing sequence of integers followed by the decreasing seq.
*/


public class CheckBitonicSeq
{
	public static void main(String args[])
	{
		int[] a={5,6,7,8,4,3,2};
		print(a);
		System.out.println("Bitonic Seq : "+checSeq(a));

		int[] b={5,6,7,8,4,3,9};
		print(b);
		System.out.println("Bitonic Seq : "+checSeq(b));

		int[] c={5,10,7,8,4,3,2};
		print(c);
		System.out.println("Bitonic Seq : "+checSeq(c));

		int[] d={20,10,7,8,4,3,2};
		print(d);
		System.out.println("Bitonic Seq : "+checSeq(d));
	}

	//O(n)
	/*
		Below algorithm counts the number of turns in the sequence from increasing to decreasing n from 		decreasing to increasing if its more than 2 then returns false
	*/

	public static boolean checSeq(int[] a)
	{
		boolean decreasing=false;
		boolean increasing=false;
		int count=1;

		for(int i=1;i<a.length;i++)
		{
			if(a[i]>a[i-1])
			{
				if(decreasing==true)
					count++;
				decreasing=false;
			}
			else
			{	
				if(decreasing==false)
					count++;		
				decreasing=true;
			}	
		}

		System.out.println("Count : "+count);
		
		if(count==2)// && decreasing==true)
			return true;
		return false;
	}
	

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
