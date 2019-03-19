

public class MirrorBT
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

		BinaryTree bt2=new BinaryTree();

		bt2.insert(1);
		bt2.insert(3);
		bt2.insert(2);
		bt2.insert(7);
		bt2.insert(6);
		bt2.insert(5);
		bt2.insert(4);
		
		bt.preorder(bt.root);
		System.out.println();
		BinaryTreeNode mi=mirror(bt.root);
		bt.preorder(bt.root);
		System.out.println();
		bt2.preorder(bt.root);
		
		System.out.println("Are Mirrors : "+areMirror(bt.root,mi));
		
	}

	public static BinaryTreeNode mirror(BinaryTreeNode root)
	{
		if(root!=null)
		{
			
			BinaryTreeNode temp=root.left;
			root.left=root.right;
			root.right=temp;

			mirror(root.left);
			mirror(root.right);
		}
		return root;
	}

	public static boolean areMirror(BinaryTreeNode root1,BinaryTreeNode root2)
	{
		if(root1==null && root2==null)
			return true;		
		if(root1.data!=root2.data)
			return false;
		if(root1==null || root2==null)
			return false;

		else
			return (areMirror(root1.left,root2.right) && areMirror(root1.right,root2.left));
	}
}

