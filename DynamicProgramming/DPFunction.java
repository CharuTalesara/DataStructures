



public class DPFunction
{
	public static void main(String args[])
	{
		func(4);
	}

	/*
		T(0)=T(1)=2;
		T(n)=Summation over (i=1 to n-1)[2*T(i)*T(i-1)]
		
	*/

	public static void func(int n)
	{
		int[] f=new int[n+1];
		
		f[0]=2;
		f[1]=2;	
		f[2]=8;
		
		for(int i=3;i<=n;i++)
		{
			f[i]=f[i-1]+2*f[i-1]*f[i-2];
		}


		for(int i=0;i<f.length;i++)
			System.out.print(f[i]+" ");

		System.out.println();

		
	}
}
