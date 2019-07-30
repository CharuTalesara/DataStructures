/*
 * Given an array of no- add 1 to the number
 * 
 */


public class AddOneToArrayOfNumber {

	public static void main(String[] args)
	{
		int[] a= {9,9,9,9,9};
		print(a);
		print(addOne(a,1));
	}
	
	public static int[] addOne(int[] a,int toadd)
	{
		int carry=toadd;
		
		for(int i=a.length-1;i>=0;i--)
		{
			int temp=a[i];
			a[i]=(a[i]+carry)%10;
			carry=(temp+carry)/10;			
		}
		if(carry!=0)
		{
			int[] b=new int[a.length+1];
			b[0]=carry;
			for(int i=1;i<b.length;i++)
				b[i]=a[i-1];
			return b;
		}
		return a;
	}
	
	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}

}
