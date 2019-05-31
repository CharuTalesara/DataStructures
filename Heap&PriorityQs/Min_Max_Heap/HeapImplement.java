

public class HeapImplement
{
	public static void main(String args[])
	{
		Heap heap=new Heap();

		heap.insert(3);
		heap.insert(1);
		heap.insert(2);
		heap.insert(4);
		heap.insert(5);
		heap.insert(6);
		heap.insert(7);
		heap.insert(8);
		heap.insert(9);
		heap.insert(0);
		heap.insert(10);
		heap.printHeap();

		for(int i=0;i<heap.count;i++)
		{
			System.out.println("************");
			System.out.println("Parent of "+heap.array[i]+" "+heap.parent(i));
			
		}


		/*for(int i=0;i<heap.count;i++)
		{
			System.out.println("************");
			System.out.println("Left Child of "+heap.array[i]+" "+heap.array[heap.leftChild(i)]);
			System.out.println("Right Child of "+heap.array[i]+" "+heap.array[heap.rightChild(i)]);
		}*/

		System.out.println("Max "+heap.getMax());

		System.out.println("Deleting Max : "+heap.deleteMax());
		System.out.println("Heap After deletion");
		heap.printHeap();

		//int b[]={4,1,3,2,16,9,10,14,8,7};
		//heap.build_max_heap(b);
		//System.out.println("Sorting");
		//heap.heapSort(b);
		
		heap.printHeap();
		heap.delete(4);
		System.out.println("After deleting 4");
		heap.printHeap();

		heap.deleteIndexed(2);
		heap.printHeap();
	}
}
