
import java.util.*;



public class SumOfDigitsFrom1ToNDP
{
	public static void main(String args[])
	{
		System.out.println(sumupto99s(328));
		System.out.println(sumupto99s(10));
	}

	public static int sumOfDigistUptoN(int n,int[] a)
	{
		if(n<10)
			return (n*(n+1))/2;

		int d=(int)Math.log10(n);

		int p=(int)Math.pow(10,d);

		int msd=n/p;

		
		int ret=a[d]*msd+(int)Math.pow(10,d)*((msd)*(msd-1)/2)+msd*(n%((int)Math.pow(10,d))+1)+sumOfDigistUptoN(n%((int)Math.pow(10,d)),a);
		
		return ret;
	}

	public static int sumupto99s(int n)
	{
		int d=(int)Math.log10(n);
		int[] a=new int[d+1];
		a[0]=0;
		a[1]=45;

		for(int i=2;i<=d;i++)
			a[i]=a[i-1]*10+(int)Math.pow(10,i-1)*45;

		return sumOfDigistUptoN(n,a);		
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
