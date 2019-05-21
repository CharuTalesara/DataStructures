

public class PruneBST
{
	public static void main(String args[])
	{
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(49);
		bst.insert(37);
		bst.insert(13);
		bst.insert(41);
		bst.insert(53);
		bst.insert(7);
		bst.insert(19);
		bst.insert(9);
		bst.insert(12);
		bst.insert(25);
		bst.insert(71);
		bst.insert(60);
		bst.insert(82);
		bst.insert(89);
		

		bst.inorder(bst.root);
		System.out.println();

		prune(bst,bst.root,53,79);
		
		
		bst.inorder(bst.root);
		System.out.println();

	}

	public static BinaryTreeNode prune(BinarySearchTree t,BinaryTreeNode root,int a,int b)
	{
		if(root==null)
			return null;

		root.left=prune(t,root.left,a,b);
		root.right=prune(t,root.right,a,b);

		if(root.data>=a && root.data<=b)
			return root;
		
		if(root.data<a)
		{
			BinaryTreeNode node=root.right;
			root=null;
			return node;			
		}

		if(root.data>b)
		{
			BinaryTreeNode node=root.left;
			root=null;
			return node;
		}

		return root;
	}
}
