

public class LCABT
{
	public static void main(String args[])
	{
		BinaryTree bt=new BinaryTree();

		bt.insert(3);
		bt.insert(6);
		bt.insert(8);
		bt.insert(2);
		bt.insert(11);
		bt.insert(13);
		bt.insert(7);
		bt.insert(12);
		bt.insert(15);
		bt.insert(9);
		bt.insert(5);


		bt.preorder(bt.root);
		System.out.println();

	
		System.out.println("LCA of 3,2 : "+(leastCommonAncestor(bt.root,bt.search(bt.root,3),bt.search(bt.root,2))).data);
		System.out.println("LCA of 12,2 : "+(leastCommonAncestor(bt.root,bt.search(bt.root,12),bt.search(bt.root,2))).data);
		System.out.println("LCA of 15,7 : "+(leastCommonAncestor(bt.root,bt.search(bt.root,15),bt.search(bt.root,7))).data);
	} 

	public static BinaryTreeNode leastCommonAncestor(BinaryTreeNode root, BinaryTreeNode n1,BinaryTreeNode n2)
	{
		if(root==null)
			return  null;
		
		if(root==n1 || root==n2)
			return root;

		BinaryTreeNode left=leastCommonAncestor(root.left,n1,n2);
		BinaryTreeNode right=leastCommonAncestor(root.right,n1,n2);

		if(left!=null && right!=null)
			return root;

		if(left==null && right == null)
			return null;

		return left!=null ? left:right;
	}
}
