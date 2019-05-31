

public class MinHeapImplement
{
	public static void main(String args[])
	{
		MinHeap heap=new MinHeap();

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
			System.out.print("Parent of "+heap.array[i]);
			
			if(heap.parent(i)>=0)
				System.out.print(" "+heap.array[heap.parent(i)]);
			System.out.println();			
		}


		for(int i=0;i<heap.count/2;i++)
		{
			System.out.println("************");
			System.out.println("Left Child of "+heap.array[i]);

			if(heap.leftChild(i)>=0)
				System.out.print(" "+heap.array[heap.leftChild(i)]);

			if(heap.rightChild(i)>=0)
				System.out.print(" n Right Child "+heap.array[heap.rightChild(i)]);

			System.out.println();
		}

		System.out.println("Min "+heap.getMin());

		System.out.println("Deleting Min : "+heap.deleteMin());
		System.out.println("Heap After deletion");
		heap.printHeap();

		
		heap.delete(4);
		System.out.println("After deleting 4");
		heap.printHeap();

		heap.deleteIndexed(2);
		heap.printHeap();
	}
}
