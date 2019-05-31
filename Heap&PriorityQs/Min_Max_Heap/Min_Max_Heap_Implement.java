

public class Min_Max_Heap_Implement
{
	public static void main(String args[])
	{
		Min_Max_Heap mmheap=new Min_Max_Heap();
		mmheap.insert(1);
		mmheap.insert(2);
		mmheap.insert(3);
		mmheap.insert(4);
		mmheap.insert(5);
		mmheap.insert(6);
		mmheap.insert(7);
		mmheap.delete(3);
		mmheap.print();

		System.out.println("Max : "+mmheap.findMax());
		System.out.println("Min : "+mmheap.findMin());
	}
}
