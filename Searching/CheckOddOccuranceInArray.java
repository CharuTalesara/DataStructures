


public class CheckOddOccuranceInArray
{
	public static void main(String args[])
	{
		int[] a={1,5,5,1,2,3,4,2,1,2,1,2,3,2,4};

		int x=0;


		for(int i=0;i<a.length;i++)
		{
			x=x^a[i];
		}

		System.out.println(x);
	}
}
