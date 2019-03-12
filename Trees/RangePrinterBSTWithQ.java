public class RangePrinterBSTWithQ
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
		
		System.out.println("<<<<<<Range Printer with Q>>>>>>");
		rangePrinterQ(bst.root,3,12);
		System.out.println();
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
