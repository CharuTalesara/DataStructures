


public class AllAncestors
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
		bt.insert(11);


		bt.preorder(bt.root);
		System.out.println();

		System.out.println("............Printing all ancestos  of 11...........");

		printAllAncestors(bt.root,11);
	
		System.out.println("............Printing all ancestos  of 7...........");

		printAllAncestors(bt.root,7);
	}


	public static boolean printAllAncestors(BinaryTreeNode root,int key)
	{
		if(root==null)
			return false;
			
		if(root.data==key)
		{
			return true;
		} 

		if(printAllAncestors(root.left,key) || printAllAncestors(root.right,key))
		{
			System.out.println(root.data);
			return true;
		}

		return false;
	}
}

