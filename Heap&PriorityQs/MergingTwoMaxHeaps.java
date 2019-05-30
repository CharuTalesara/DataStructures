

public class MergingTwoMaxHeaps
{
	public static void main(String args[])
	{
		Heap heap1=new Heap(20);
		Heap heap2=new Heap(7);

		heap1.insert(3);
		heap1.insert(2);	
		heap1.insert(1);
		heap1.insert(9);
		heap1.insert(7);
		heap1.insert(8);
		heap1.insert(12);
		heap1.insert(18);
		heap1.insert(10);
		heap1.insert(21);
		heap1.insert(31);		
		
		System.out.println("<<<<<Heap 1 >>>>>>>");
		heap1.printHeap();
		
		System.out.println("<<<<<Heap 2 >>>>>>>");
		int[] b={17,13,6,0,4,3,5};
		heap2.build_max_heap(b);
		heap2.printHeap();

		merge(heap1,heap2);

		System.out.println("<<<<<Heap 1 >>>>>>>");
		heap1.printHeap();		
	}

	public static Heap merge(Heap heap1,Heap heap2)
	{
		while(heap2.count>0)
		{
			heap1.insert(heap2.deleteIndexed(0));
		}
		return heap1;
	}
}
