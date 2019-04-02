


public class MergerSortAlgo
{

	public static void main(String args[])
	{
		int[] a={38,27,43,3,9,82,10};
		print(a);				
		mergesort(a,0,a.length-1);
		print(a);
	}

	public static void mergesort(int[] a,int left,int right)
	{

		if(left<right)
		{
			int mid=(right+left)/2;
			mergesort(a,left,mid);
			mergesort(a,mid+1,right);
			merge(a,left,mid,right);
		}

	}


	public static void merge(int[] a,int left,int mid,int right)
	{
		int n1=mid-left+1;
		int n2=right-mid;

		int[] l=new int[n1];
		int[] r=new int[n2];

		for(int i=0;i<n1;i++)
			l[i]=a[left+i];

		for(int i=0;i<n2;i++)
			r[i]=a[mid+i+1];

		int i=0;
		int j=0;
		int k=left;	

		while(i<n1 && j<n2)
		{
			if(l[i]<r[j])
			{
				a[k]=l[i];
				i++;
				k++;
			}
			else
			{
				a[k]=r[j];
				j++;
				k++;
			}
		}

		if(i<n1)
		{
			for(;i<n1;i++)
			{
				a[k]=l[i];
				k++;
			}
		}
		
		if(j<n2)
		{
			for(;j<n2;j++)
			{
				a[k]=r[j];
				k++;
			}
		}
		//print(a);
		
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
