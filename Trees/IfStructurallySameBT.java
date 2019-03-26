

public class IfStructurallySameBT
{
	public static void main(String args[])
	{
		BinaryTree bt1=new BinaryTree();

		bt1.insert(1);
		bt1.insert(2);
		bt1.insert(3);
		bt1.insert(4);
		bt1.insert(5);
		bt1.insert(6);
		//bt1.insert(7);
		//bt1.insert(8);


		BinaryTree bt2=new BinaryTree();

		bt2.insert(1);
		bt2.insert(2);
		bt2.insert(3);
		bt2.insert(4);
		bt2.insert(5);
		bt2.insert(6);
		bt2.insert(7);
		//bt2.insert(8);

		System.out.println("Same BT ? : "+ifSameBT(bt1.root,bt2.root));
		
	}

	public static boolean ifSameBT(BinaryTreeNode root1,BinaryTreeNode root2)
	{
		if(root1==null && root2==null)
			return true;

		if((root1==null && root2!=null) || (root1!=null && root2==null))
			return false;		
		
		if(root1.data!=root2.data)
			return false;

		return (ifSameBT(root1.left,root2.left) && ifSameBT(root1.right,root2.right));
	}
}
