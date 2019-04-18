
//Including count variable to get the number of inversions

public class MergerSortAlgo
{
	static int count=0;
	public static void main(String args[])
	{
		//int[] a={38,27,43,3,9,82,10};

		int[] a={2,3,8,6,1};
		
		print(a);				
		mergesort(a,0,a.length-1);
		print(a);
		System.out.println(count);
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
				//count++;
				
			}
			else
			{
				a[k]=r[j];
				j++;
				k++;
				count++;
			}
		}

		if(i<n1)
		{
			for(;i<n1;i++)
			{
				a[k]=l[i];
				k++;
				count++;
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
