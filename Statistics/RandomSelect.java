import java.util.Random;


public class RandomSelect
{
	public static void main(String args[])
	{
		int[] a={4,2,1,7,6,9,3,8,5};

		System.out.println(random_select(a,0,a.length-1,5));	
	}

	public static int random_select(int []a, int p,int r,int i)
	{
		if(p==r)
			return a[p];
	
		int q=randomized_partition(a,p,r);
		
		int k=q-p+1; //calculates the number of elements in the lower side of the subarray

		if(i==k)
			return a[q];
		else if(i<k)
			return random_select(a,p,q,i);
		else
			return random_select(a,q+1,r,i-k);
		 
	}

	public static int randomized_partition(int[] a,int p,int r)
	{
		Random rand=new Random();

		int i=rand.nextInt(9);
		 
		int temp=a[r];
		a[r]=a[i];
		a[i]=temp;

		return partition(a,p,r);
	}

	public static int partition(int[] a,int p,int r)
	{
		int i=p-1;
		int x=a[r];

		for(int j=p;j<r;j++)
		{
			if(a[j]<=x)
			{
				i++;
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}

		int temp=a[i+1];
		a[i+1]=a[r];
		a[r]=temp;

		return i+1;
	}
}
