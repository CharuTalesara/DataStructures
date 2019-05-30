

public class FindingKthSmallestEleInMinHeap
{
	public static void main(String args[])
	{
		int a[]={1,2,5,3,4,6,7};

		MinHeap heap=new MinHeap();
		heap=heap.build_min_heap(a);
		heap.printHeap();

		System.out.println(findKthsmallest(heap,4));	
		//heap.printHeap(); -- Retained 
	}

	public static int findKthsmallest(MinHeap heap,int k)
	{
		MinHeap auxheap=new MinHeap();

		auxheap.insert(heap.getMin());
		int count=1;

		while(count<k)
		{
			int ele=auxheap.deleteMin();
			System.out.println("Ele : "+ele);
			
			if(heap.leftChild(heap.search(ele))!=-1)
			{
				System.out.println("lEFT: "+heap.leftChild(heap.search(ele)));
				auxheap.insert(heap.array[heap.leftChild(heap.search(ele))]);				
			}
			if(heap.rightChild(heap.search(ele))!=-1)
			{
				auxheap.insert(heap.array[heap.rightChild(heap.search(ele))]);				
			}
			count++;
		}

		return auxheap.deleteMin();
	}
}

