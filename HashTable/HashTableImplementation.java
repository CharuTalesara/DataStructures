

public class HashTableImplementation
{
	public static void main(String args[])
	{
		HastTable ht=new HastTable(9);
		ht.insert(5);
		ht.insert(28);
		ht.insert(19);
		ht.insert(15);
		ht.insert(2);
		ht.insert(33);
		ht.insert(12);
		ht.insert(17);
		ht.insert(10);
		ht.insert(10);
		ht.insert(10);
		ht.print();
		ht.search(15);
		ht.search(30);
		ht.search(33);
	}
}
