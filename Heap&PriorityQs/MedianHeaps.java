/*
We need 2 heaps-Min Heap and Max heap
Each heap contains about one half of the data 
Every element in min heap>=median
Every Element in max heap<=median

if the minheap contains one more ele than the maxheap then median is the top of the minheap
else if maxheap has one more ele then top of max heap
if both contains the same number of ele then avg of the two.

While inserting --if the new element is greater than the current median then insert in the minheap.
else in maxheap. 
After inserting in any of the heap if the difference between the number of nodes in these heaps is more than 1 then rebalance that ..by transfering the root of the heap having more nodes to the one having less n heapify that tree
*/

public class MedianHeaps
{
	Heap maxheap;
	MinHeap minheap;
	int median;

	public MedianHeaps()
	{
		maxheap=new Heap();
		minheap=new MinHeap();
		median=0;
	}

	public void insert(int data)
	{
		int currMedian=getMedian();
		if(currMedian>=data)
			maxheap.insert(data);
		else
			minheap.insert(data);
		balanceTrees();
		
	}

	public void balanceTrees()
	{
		if(maxheap.count==minheap.count || maxheap.count==minheap.count+1 || maxheap.count+1==minheap.count)
			return;

		if(maxheap.count>minheap.count)
		{
			int data=maxheap.deleteMax();
			minheap.insert(data);
		}
		else
		{
			int data=minheap.deleteMin();
			maxheap.insert(data);
		}
	}

	public void print()
	{
		System.out.println("....Prining MaxHeap.....");
		maxheap.printHeap();
		System.out.println("....Prining MinHeap.....");
		minheap.printHeap();
		System.out.println("....Printing Median.....");
		System.out.println("Median : "+getMedian());
		System.out.println("************************************");
	}

	public int getMedian()
	{
		if(maxheap.count==0 && minheap.count==0)
			return 0;
		if(maxheap.count>minheap.count)
			return maxheap.getMax();
		else if(minheap.count>maxheap.count)
			return minheap.getMin();
		else
			return (maxheap.getMax()+minheap.getMin())/2;
		
	}
}
