

public class DoublyLinkedListDemo
{
	public static void main(String args[])
	{
		DoublyLinkedList dll=new DoublyLinkedList();

		dll.insertAtBeginning(1);
		dll.print();
		dll.insertAtEnd(2);
		dll.print();
		dll.insertAtBeginning(3);
		dll.print();
		dll.insertAtEnd(4);
		dll.print();

		dll.insertAtEnd(5);
		dll.print();

		System.out.println("Length : "+dll.getLength());

		dll.insert(6,3);
		dll.print();
		dll.insert(7,3);
		dll.print();
		
		System.out.println("Get Head : "+dll.getHead().data);
		System.out.println("Get Tail : "+dll.getTail().data);

		dll.deleteHead();
		dll.print();

		dll.deleteHead();
		dll.print();

		dll.insert(8,3);
		dll.insert(9,2);
		dll.print();

		dll.deleteTail();
		dll.print();
		System.out.println("Get Tail : "+dll.getTail().data);

		dll.deleteTail();
		dll.print();
		dll.deleteTail();
		dll.print();
		dll.deleteTail();
		dll.print();

		
		dll.deleteTail();
		dll.print();

		dll.deleteTail();
		dll.print();

		System.out.println("Get Head : "+dll.getHead().data);
		System.out.println("Get Tail : "+dll.getTail().data);

		dll.insertAtEnd(8);
		dll.insertAtEnd(9);
		dll.insertAtEnd(1);
		dll.insertAtEnd(2);
		dll.print();

		//dll.delete(3);
		//dll.print();

		dll.deleteMatched(9);
		dll.print();

		dll.deleteMatched(8);
		dll.print();

		dll.deleteMatched(1);
		dll.print();

		dll.deleteMatched(2);
		dll.print();
	}
}
