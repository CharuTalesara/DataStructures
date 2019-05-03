/*
Real time median in a continuous data stream ...
since real time - cant use array becos we need something dynamic 
so going with heaps...
*/


public class MedianHeapImplement
{
	public static void main(String args[])
	{
		MedianHeaps h=new MedianHeaps();
		h.insert(1);
		h.print();
		h.insert(10);
		h.print();
		h.insert(5);
		h.print();
		h.insert(20);
		h.print();
		h.insert(25);
		h.insert(35);
		h.print();
		h.insert(50);
		h.print();
		h.insert(60);
		h.print();

		System.out.println("Median : "+h.getMedian());
	}
}
