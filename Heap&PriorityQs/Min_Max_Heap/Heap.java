


public class Heap
{
	public Element[] array;  //elemets of the array
	public int count;    // Number of elements of the heap
	public int capacity; // size of the heap

		
	// Time Complexity- O(1) Constructor Calling
	
	public Heap(int capacity)
	{
		this.capacity=capacity;
		this.count=0;
		this.array=new Element[capacity];
	}

	public Heap()
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
	
	

	public Element getMax()
	{
		if(count==0)
			return null;
		return this.array[0];
	}

	// Time Compelxity=O(h) h=height of the tree=Log(n)

	public void max_heapify(int i)
	{
		int l=leftChild(i);
		int r=rightChild(i);

		int max=i;

		if(l!=-1 && array[l].data>array[i].data)
			max=l;

		if(r!=-1 && array[r].data>array[max].data)
			max=r;

		if(max!=i)
		{
			Element temp=array[max];
			array[max]=array[i];
			array[i]=temp;
	
			max_heapify(max);		
		}
	}

	public int search(int data)
	{
		for(int i=0;i<count;i++)
		{
			if(array[i].data==data)
				return i;
		}
		return -1;
	}

	public Element deleteIndexed(int index)
	{
		Element ret=array[index];
		array[index]=array[count-1];
		count--;
		max_heapify(index);
		return ret;
	}

	public void delete(int data)
	{
		int index=search(data);
		
		array[index]=array[count-1];
		count--;
		max_heapify(index);
	}

	public Heap build_max_heap(Element[] a)
	{
		this.array=a;

		this.count=a.length;

		for(int i=(a.length-1)/2;i>=0;i--)
		{
			max_heapify(i);			
		}

		return this;
	}

	public Heap build_max_heap(Element[] a,int a_len)
	{
		this.array=a;

		//this.count=a_len;
		this.count=a.length;

		for(int i=(a.length-1)/2;i>=0;i--)
		{
			max_heapify(i);			
		}

		return this;
	}



	// Time Complexity=O(n)

	public Element deleteMax()
	{
		if(count==0)
			return null;

		count--;

		Element ret=array[0];
		array[0]=array[count];

		max_heapify(0);

		return ret;
	}


	public void heapSort(Element[] a)
	{
		this.count=a.length;

		build_max_heap(a);

		while(count>0)
		{
			Element max=array[0];
			array[0]=array[count-1];
			array[count-1]=max;
			count--;
			max_heapify(0);
		}
		
		for(int i=0;i<array.length;i++)
			System.out.print(array[i].data+" ");
		System.out.println();
	
	}

	
	public void insert(int data)
	{
		Element ele=new Element(data);
		array[count]=ele;
		//count++;

		int parent_index=parent(count);
		int child_index=count;
		

		while(parent_index>=0 && array[parent_index].data<array[child_index].data)
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

	
	public  void printHeap()
	{
		for(int  i=0;i<count;i++)
		{
			System.out.print("Data : "+array[i].data+" , Ptr "+array[i].ptr.data);
			System.out.println();
		}
		System.out.println();
	}

	public void destroyHeap()
	{
		this.array=null;
		this.count=0;
	}	
}
