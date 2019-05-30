

public class MergeKSortedLists
{
	static int[] k1={3,7,9,10,15};
	static int[] k2={1,6,14,17,19};
	static int[] k3={2,5,8,16,18};
	static int[] k4={0,4,11,13,20};
	static int[] k5={12,21,24,35,40};


	public static void main(String args[])
	{
		
		print(k1);
		print(k2);
		print(k3);
		print(k4);
		print(k5);

		int[] a=merge(k1,k2,k3,k4,k5);
		print(a);
	}

	public static int[] merge(int[] k1,int[] k2,int[] k3,int[] k4,int[] k5)
	{
		int i_k1=0;
		int i_k2=0;
		int i_k3=0;
		int i_k4=0;
		int i_k5=0;


		int[] op=new int[k1.length*5];

		int i_op=0;

		MinHeap heap=new MinHeap();

		
		heap.insert(k1[i_k1]);
		i_k1++;

		heap.insert(k2[i_k2]);
		i_k2++;

		heap.insert(k3[i_k3]);
		i_k3++;

		heap.insert(k4[i_k4]);
		i_k4++;

		heap.insert(k5[i_k5]);
		i_k5++;

		while(i_k1<5 || i_k2<5 || i_k3<5 ||i_k4<5 ||i_k5<5 || !heap.isEmpty())
		{
			int ele=heap.deleteMin();
			op[i_op]=ele;
			i_op++;
		
			int ar=findElesArray(ele);
			if(ar==1 && i_k1<5 )
			{
				heap.insert(k1[i_k1]);
				i_k1++;
			}
			if(ar==2 && i_k2<5)
			{
				heap.insert(k2[i_k2]);		
				i_k2++;
			}
			if(ar==3 && i_k3<5)
			{
				heap.insert(k3[i_k3]);		
				i_k3++;
			}
			if(ar==4 && i_k4<5)
			{
				heap.insert(k4[i_k4]);
				i_k4++;		
			}
			if(ar==5 && i_k5<5)
			{
				heap.insert(k5[i_k5]);
				i_k5++;		
			}
		}
		
		
		heap.printHeap();

		return op;
	}

	public static int findElesArray(int ele)
	{
		for(int i=0;i<k1.length;i++)
		{
			if(k1[i]==ele)
				return 1;
			if(k2[i]==ele)
				return 2;
			if(k3[i]==ele)
				return 3;
			if(k4[i]==ele)
				return 4;
			if(k5[i]==ele)
				return 5;
		}
		return -1;
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
