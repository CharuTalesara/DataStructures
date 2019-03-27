

public class  SinglyLinkedListdemo
{
	public static void main(String args[])
	{
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.insert(1,1);
		sll.insert(2,2);
		sll.insert(3,2);
		sll.insert(4,2);
		sll.insert(5,1);
		sll.insert(6,6);
		sll.insert(7,6);
		sll.insert(8,8);
		sll.print();
		sll.removeFromBeginning();
		sll.print();
		sll.removeFromEnd();
		sll.print();
		System.out.println(sll.getLength());

		sll.removeMatched(4);
		sll.print();
		sll.removeMatched(6);
		sll.print();
		
		sll.insert(9,5);
		sll.print();
		sll.insert(10,6);
		sll.print();

		sll.removeFromPosition(4);
		sll.print();


		sll.removeFromPosition(2);
		sll.print();

		System.out.println("Position of 1 : "+sll.getPosition(1));
		System.out.println("Position of 9 : "+sll.getPosition(9));
		System.out.println("Position of 2 : "+sll.getPosition(2));
	}
}
