

public class HeightBtRecursion
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
		bt.insert(12);
		bt.insert(13);
		bt.insert(14);
		bt.insert(15);
		bt.insert(16);


		bt.preorder(bt.root);
		System.out.println();

		System.out.println("Height : "+height(bt.root));
	}

	public static int height(BinaryTreeNode root)
	{
		if(root == null)
			return 0;
		
		if(root.left==null && root.right==null)
			return 1;

		return (height(root.left)>height(root.right)?height(root.left)+1:height(root.right)+1);
	}
}
