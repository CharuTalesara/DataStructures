

public class Min_Max_Heap
{
	Heap maxheap;
	MinHeap minheap;

	public Min_Max_Heap()
	{
		maxheap = new Heap();
		minheap = new MinHeap();
	}

	public int findMin()
	{
		return minheap.getMin().data;
	}

	public int findMax()
	{
		return maxheap.getMax().data;
	}

	public void insert(int data)
	{
		//Element ele = new Element(data);
		
		minheap.insert(data);
		maxheap.insert(data);

		int i=minheap.search(data);
		minheap.array[i].ptr=maxheap.array[maxheap.search(data)];

		int j=maxheap.search(data);
		maxheap.array[j].ptr=minheap.array[minheap.search(data)];
			
		//maxheap.insert(data);
	}

	public void delete(int data)
	{
		int i=minheap.search(data);
		minheap.array[i].ptr=null;
		minheap.delete(data);

		i=maxheap.search(data);
		maxheap.array[i].ptr=null;
		maxheap.delete(data);

	}

	public void print()
	{
		maxheap.printHeap();
		minheap.printHeap();
	}
}
