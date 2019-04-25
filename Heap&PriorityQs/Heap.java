


public class Heap
{
	public int[] array;  //elemets of the array
	public int count;    // Number of elements of the heap
	public int capacity; // size of the heap
	public int heap_type; // Max or Min heap

		
	// Time Complexity- O(1) Constructor Calling
	
	public Heap(int capacity,int heap_type)
	{
		this.capacity=capacity;
		this.count=0;
		this.heap_type=heap_type;
		this.array=new int[capacity];
	}

	public Heap()
	{
		this.capacity=20;
		this.count=0;
		this.heap_type=0; // 0 for max,
		this.array=new int[capacity];
	}


	// Fetching Parent index O(1)

	public int parent(int i)
	{
		if(i<=0 || i>count)
			return -1;
		else
			return (i-1)/2;
	}

	// Fetching child O(1)

	public int leftChild(int i)
	{
		int lc=2*i+1;
		
		if(lc>this.count-1)
			return -1;
		else
			return lc;				
	}

	// Fetching child O(1)

	public int rightChild(int i)
	{
		int rc=2*i+2;
		
		if(rc>this.count-1)
			return -1;
		else
			return rc;				
	}
	

	public int getMax()
	{
		if(count==0)
			return -1;
		return this.array[0];
	}

	// Time Compelxity=O(h) h=height of the tree=Log(n)

	public void max_heapify(int i)
	{
		int l=leftChild(i);
		int r=rightChild(i);

		int max=i;

		if(l!=-1 && array[l]>array[i])
			max=l;

		if(r!=-1 && array[r]>array[max])
			max=r;

		if(max!=i)
		{
			int temp=array[max];
			array[max]=array[i];
			array[i]=temp;
	
			max_heapify(max);		
		}
	}

	public void build_max_heap(int[] a)
	{
		this.array=a;

		this.count=a.length;

		printHeap();

		for(int i=(a.length-1)/2;i>=0;i--)
		{
			max_heapify(i);			
		}

		printHeap();
	}


	// Time Complexity=O(n)

	public int deleteMax()
	{
		if(count==0)
			return -1;

		count--;

		int ret=array[0];
		array[0]=array[count];

		max_heapify(0);

		return ret;
	}

	
	public void insert(int data)
	{
		array[count]=data;

		int parent_index=parent(count);
		int child_index=count;
		

		while(parent_index>=0 && array[parent_index]<array[child_index])
		{
			int temp=array[child_index];
			array[child_index]=array[parent_index];
			array[parent_index]=temp;

			child_index=parent_index;

			parent_index=parent(parent_index);
			
		}

		count++;
	}

	public void percolateDown(int i)
	{
		max_heapify(i);
	}

	
	public  void printHeap()
	{
		for(int  i=0;i<count;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}

	public void destroyHeap()
	{
		this.array=null;
		this.count=0;
	}	
}
