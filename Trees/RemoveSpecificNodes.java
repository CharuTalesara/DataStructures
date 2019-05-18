/*
Remove leaf nodes n nodes woth one child in a binary search tree
*/

public class RemoveSpecificNodes
{
	public static void main(String args[])
	{
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(12);
		bst.insert(5);
		bst.insert(3);
		bst.insert(1);
		bst.insert(8);
		bst.insert(7);
		bst.insert(9);
		bst.insert(15);
		bst.insert(14);
		bst.insert(13);
		bst.insert(17);
		

		bst.inorder(bst.root);
		System.out.println();


		removeNodesWithOnechild(bst.root);
		bst.inorder(bst.root);
		System.out.println();
		
	}
	
	// Removing leaf nodes

	public static BinaryTreeNode removeLeaves(BinaryTreeNode x)
	{
		if(x!=null)
		{
			if(x.left==null && x.right==null)
				x=null;
			else
			{
				x.left=removeLeaves(x.left);
				x.right=removeLeaves(x.right);
			}
		}

		return x;
	}


	// Removing nodes with one chile ...remember we should not touch the leaf

	public static BinaryTreeNode removeNodesWithOnechild(BinaryTreeNode x)
	{
		if(x!=null)
		{
			if(x.left==null && x.right!=null)
			{
				x.data=x.right.data;
				x.right=null;
			}
			else if(x.left!=null && x.right==null)
			{
				x.data=x.left.data;
				x.left=null;
			} 
			else
			{
				x.left=removeNodesWithOnechild(x.left);
				x.right=removeNodesWithOnechild(x.right);
			}
		}

		return x;
	}

}


