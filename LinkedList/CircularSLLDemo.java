

public class CircularSLLDemo
{
	public static void main(String args[])
	{
		CircularSinglyLinkedList cll=new CircularSinglyLinkedList();
		
		cll.insert(1,1);
		cll.print();
		System.out.println("Length : "+cll.getLength());

		cll.insert(2,2);
		cll.print();
		System.out.println("Length : "+cll.getLength());

		cll.insert(3,3);
		cll.print();

		cll.insert(4,4);
		cll.print();

		cll.insert(5,3);
		cll.print();

		cll.insert(6,2);
		cll.print();

		cll.deleteHead();
		cll.print();

		cll.deleteHead();
		cll.print();

		cll.deleteTail();
		cll.print();

		cll.deleteTail();
		cll.print();

		cll.deleteTail();
		cll.print();

		cll.insert(1,1);
		cll.insert(3,3);
		cll.insert(4,3);
		cll.insert(5,3);
		cll.print();

		cll.deleteMatched(2);
		cll.print();


		cll.deleteMatched(4);
		cll.print();

		cll.deleteMatched(3);
		cll.print();

		cll.deleteMatched(5);
		cll.print();

		cll.insert(3,2);
		cll.insert(4,3);
		cll.insert(5,3);
		cll.print();

		cll.deletePosition(3);
		cll.print();

		cll.deletePosition(3);
		cll.print();

		cll.deletePosition(1);
		cll.print();
	}
}
