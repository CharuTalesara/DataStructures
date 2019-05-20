import java.lang.*;

public class CheckIfBSTIsAVLTree
{
	public static void main(String args[])
	{
		BinarySearchTree bt=new BinarySearchTree();

		/*bt.insert(5);
		bt.insert(3);
		bt.insert(8);
		bt.insert(2);
		bt.insert(4);
		bt.insert(7);
		bt.insert(9);
		bt.insert(10);*/
		//bt.insert(9);
		//bt.insert(10);

		bt.insert(2);
		bt.insert(1);
		bt.insert(3);
		/*bt.insert(4);
		bt.insert(5);
		bt.insert(6);
		bt.insert(7);
		bt.insert(8);*/

		System.out.println("<<<<<<< Binary Search Tree>>>>>>>>>>");
		bt.inorder(bt.root);
		System.out.println();
		System.out.println("<<<<<<< Binary Search Tree>>>>>>>>>>");

		System.out.println("Is AVL : "+isAVL(bt.root));
	}

	public static int isAVL(BinaryTreeNode root)
	{
		if(root==null)
			return 0;

		int height_left=isAVL(root.left);
			
		int height_right=isAVL(root.right);
		
		if(height_right==-1 || height_left==-1 ||Math.abs(height_left-height_right)>=2)
			return -1;

		else
			return Math.max(height_left,height_right)+1;	
	}
}
