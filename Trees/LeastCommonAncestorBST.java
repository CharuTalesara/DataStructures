
public class LeastCommonAncestorBST
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
		bst.insert(17);

		System.out.println("LCA : "+leastCommonAncestor(bst.root,3,9).data);
		System.out.println("LCA : "+leastCommonAncestor(bst.root,5,15).data);
	
	}


	// Least Common Ancestor --given that the two values are there in the tree (a,b) ..first node with data lying between a and b 		while preorder traversal 

	public static BinaryTreeNode leastCommonAncestor(BinaryTreeNode root,int a,int b)
	{
		if(root==null)
			return null;
		
		// assuming a<b
		
		if(root.data>b)
			return leastCommonAncestor(root.left,a,b);
	
		else if(root.data<a)
			return leastCommonAncestor(root.right,a,b);

		else
			return root;

	}

}


