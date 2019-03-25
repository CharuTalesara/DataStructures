


public class MaxBTRecursion
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
		bt.insert(15);


		bt.preorder(bt.root);
		System.out.println();

		System.out.println(maxBT(bt.root).data);
	}


	public static BinaryTreeNode maxBT(BinaryTreeNode root)
	{
		if(root==null)
			return null;

		if(root.left==null && root.right==null)
			return root;
		
		BinaryTreeNode left=maxBT(root.left);
		BinaryTreeNode right=maxBT(root.right);

		BinaryTreeNode max=root;

		// Check first if child is not null ..then only compare
		if(root.left!=null && max.data < left.data)
			max=left;

		if(root.right!=null && max.data < right.data)
			max=right;

		return max;
			
	}
}
