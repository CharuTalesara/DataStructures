

import java.io.*;

/*
No. of 4s from 1-9=1
No. of 4s from 1-99=10*1+10=20
No. of 4s from 1-999=10*(20)+100=300	  
No. of 4s from 1-9999=1=10*(300)+1000=4000

4s(n)=10*(4s(n-1))+10^(n-1);

*/ 
  
class NoOf4sFrom1ToNDP
{ 
	public static void main(String args[])
	{
		System.out.println(has4upto99s(5));
		System.out.println(has4upto99s(100));  
		System.out.println(has4upto99s(328));
		System.out.println(has4upto99s(728));   
     	}

	public static int count4sUptoN(int n,int[] a)
	{
		if(n<4)
			return 0;

		if(n<10)
			return 1;

		int d=(int)Math.log10(n);
		int p=(int)Math.pow(10,d);

		int msd=n/p;

		int ret=0;

		if(msd<4)
			ret=msd*a[d]+count4sUptoN(n%p,a);

		else if(msd==4)
			ret=msd*a[d]+(n%((int)Math.pow(10,d))+1)+count4sUptoN(n%p,a);
		else
			ret=msd*a[d]+(int)Math.pow(10,d)+count4sUptoN(n%p,a);
		
		return ret;
	}

	public static int has4upto99s(int n)
	{
		int d=(int)Math.log10(n);	
		int[] a=new int[d+1];
		a[0]=0;

		if(n<10)
			return  count4sUptoN(n,a);

		a[1]=1;

		for(int i=2;i<=d;i++)
			a[i]=a[i-1]*10+(int)Math.pow(10,i-1);

		return count4sUptoN(n,a);		
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
} 
