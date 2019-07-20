


public class BTHeightWithQ
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
		//bt.insert(8);
		//bt.insert(9);
		//bt.insert(10);
		//bt.insert(11);
		bt.preorder(bt.root);
		System.out.println();

		System.out.println("Height of the Binary Tree: "+heightBTWithq(bt.root));
	}

	// Returning number of nodes ...not the number of edges from root to deepest node..

	public static int heightBTWithq(BinaryTreeNode root)
	{
		int height = 0;
		
		if(root == null)
			return height;

		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(20);

		q.enQueue(root);
			
		while(true)
		{
			int nodeCount=q.size();

			if(nodeCount==0)
				return height;
		
			height++;

			while(nodeCount>0)
			{
				BinaryTreeNode currnode=q.dequeue();
				
				if(currnode.left!=null)
					q.enQueue(currnode.left);

				if(currnode.right!=null)
					q.enQueue(currnode.right);

				nodeCount--;
			}
		}
		return height;
	}
}
