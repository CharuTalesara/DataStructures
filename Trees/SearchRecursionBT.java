
public class SearchRecursionBT
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

		System.out.println("IS 7 present : "+search(bt.root,7));
		System.out.println("IS 18 present : "+search(bt.root,18));
	}


	public static boolean search(BinaryTreeNode root,int key)
	{
		if(root==null)
			return false;
		
		if(root.data==key)
			return true;

		return(search(root.left,key) || search(root.right,key));
		
	}
}
