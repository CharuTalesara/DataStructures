public class RangePrinterRecursionBST
{
	static BinarySearchTree bst=new BinarySearchTree(); 

	public static void main(String args[])
	{
		
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

		System.out.println("<<<<Range Printer with REcursion>>>>>>>>>>");
		rangePrinterRec(bst.root,3,12);

	}

	// given a BST ..print all elements between nodes k1 and k2


	public  static void rangePrinterRec(BinaryTreeNode root,int a,int b)
	{
		if(root == null)
			return;
		if(root.data<=b)
			rangePrinterRec(root.left,a,b);
		if(root.data >=a && root.data<=b)
			System.out.print(root.data + " ");
		if(root.data>=a)
			rangePrinterRec(root.right,a,b);	
	}
	
}
