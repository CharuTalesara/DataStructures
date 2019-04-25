

public class HeapImplement
{
	public static void main(String args[])
	{
		Heap heap=new Heap();

		heap.insert(30);
		heap.insert(10);
		heap.insert(20);
		heap.insert(40);
		heap.insert(50);
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

		int b[]={4,1,3,2,16,9,10,14,8,7};

		heap.build_max_heap(b);
	}
}
