public class RangePrinterBST
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
		

		System.out.println("<<<<<<<<Range Printer with LCA >>>>>");
		rangePrinter(3,12);

		System.out.println("<<<<Range Printer with REcursion>>>>>>>>>>");
		rangePrinterRec(bst.root,3,12);

		System.out.println("<<<<<<Range Printer with Q>>>>>>");
		rangePrinterQ(bst.root,3,12);
	}

	// given a BST ..print all elements between nodes k1 and k2

	public static void rangePrinter(int a,int b)
	{
                LeastCommonAncestorBST	lcaBST=new LeastCommonAncestorBST();
		BinaryTreeNode lca=lcaBST.leastCommonAncestor(bst.root,a,b);
		
		BinaryTreeNode temp=lca;

		ArrayStack stack=new ArrayStack(20);

		stack.push(temp);

		while(!stack.isEmpty())
		{
			temp =(BinaryTreeNode) stack.pop();
			System.out.print(temp.data + " ");
			
			if(temp.right!=null && temp.right.data <= b)
				stack.push(temp.right); 
			if(temp.left!=null && temp.left.data >= a)
				stack.push(temp.left );
		}
		System.out.println();	
	}

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

	public static void rangePrinterQ(BinaryTreeNode root,int a,int b)
	{
		if(root == null)
			return;
		
		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(20); 
		
		q.enQueue(root);

		while(!q.isEmpty())
		{
			BinaryTreeNode temp=q.dequeue();
			
			if(temp.data>=a && temp.data<=b)
				System.out.print(temp.data+" ");
			if(temp.left!=null && temp.data>=a)
				q.enQueue(temp.left);
			if(temp.right!=null && temp.data<=b)
				q.enQueue(temp.right);
			//q.dequeue();
		}

	}


	
}
