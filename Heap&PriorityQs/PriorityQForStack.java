




public class PriorityQForStack
{
	public Element[] array;  //elemets of the array
	public int count;    // Number of elements of the heap
	public int capacity; // size of the heap

		
	// Time Complexity- O(1) Constructor Calling
	
	public PriorityQForStack(int capacity)
	{
		this.capacity=capacity;
		this.count=0;
		this.array=new Element[capacity];
	}

	public PriorityQForStack()
	{
		this.capacity=20;
		this.count=0;
		this.array=new Element[capacity];
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
		return this.array[0].data;
	}

		

	// Time Compelxity=O(h) h=height of the tree=Log(n)

	public void max_heapify(int i)
	{
		int l=leftChild(i);
		int r=rightChild(i);

		int max=i;

		if(l!=-1 && array[l].key>array[i].key)
			max=l;

		if(r!=-1 && array[r].key>array[max].key)
			max=r;

		if(max!=i)
		{
			Element temp=array[max];
			array[max]=array[i];
			array[i]=temp;
	
			max_heapify(max);		
		}
	}

	public int deleteMax()
	{
		if(count==0)
			return -1;

		count--;

		int ret=array[0].data;
		array[0]=array[count];

		max_heapify(0);

		return ret;
	}


	
	public void insert(int data)
	{
		Element ele=new Element(data,count);

		array[count]=ele;

		int parent_index=parent(count);
		int child_index=count;
		

		while(parent_index>=0 && array[parent_index].key<array[child_index].key)
		{
			Element temp=array[child_index];
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

	public boolean isEmpty()
	{
		if(count==0)
			return true;
		return false;
	}
	
	public  void printHeap()
	{
		for(int  i=0;i<count;i++)
		{
			System.out.print("Data : "+array[i].data+" key : "+array[i].key+" ");
			System.out.println();
		}
		System.out.println("*********************");
	}

	public void destroyHeap()
	{
		this.array=null;
		this.count=0;
	}	
}
