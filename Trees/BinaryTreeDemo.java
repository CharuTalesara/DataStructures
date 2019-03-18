

public class BinaryTreeDemo
{
	public static void main(String args[])
	{
		BinaryTree bt=new BinaryTree();

		bt.insert(1);
		bt.insert(2);
		bt.insert(3);
		bt.insert(4);
		bt.insert(5);
		bt.insert(6);
		bt.insert(7);
		bt.insert(8);
		bt.insert(9);
		bt.insert(10);
		bt.preorder(bt.root);
		System.out.println();

		System.out.println("If 7 is in the tree ? : "+bt.search(bt.root,7).data);
		System.out.println("If 10 is in the tree ? : "+bt.search(bt.root,10).data);
		System.out.println("If 1 is in the tree ? : "+bt.search(bt.root,1).data);
//		System.out.println("If 21 is in the tree ? : "+bt.search(bt.root,21).data);

		System.out.println("Max in BT : "+bt.maxBT(bt.root).data);

		System.out.println("Size of  BT : "+bt.size(bt.root));

		System.out.println("Deleting the node 6");
		bt.delete(bt.root,6);
		bt.preorder(bt.root);

		System.out.println("Parent of 10: "+bt.getParent(bt.root,10).data);

		System.out.println("Deleting the node 3");
		bt.delete(bt.root,3);
		bt.preorder(bt.root);
	}
}
