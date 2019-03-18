


public class MaximumWidthBT
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
		bt.insert(12);
		bt.insert(13);
		bt.insert(14);
		bt.preorder(bt.root);
		System.out.println();

		System.out.println("Max Width of BT : "+maxWidthBT(bt.root));
		bt.delete(bt.root,7);
		System.out.println();	
		bt.preorder(bt.root);
		System.out.println("Max Width of BT : "+maxWidthBT(bt.root));

		bt.delete(bt.root,8);
		bt.delete(bt.root,9);
		bt.delete(bt.root,10);
		bt.delete(bt.root,11);
		System.out.println("Max Width of BT : "+maxWidthBT(bt.root));
		
	}


	public static int maxWidthBT(BinaryTreeNode root)
	{
		int maxSum = 0;
		
		if(root == null)
			return 0;

		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(20);

		q.enQueue(root);

		int maxWidth=1;
			
		while(!q.isEmpty())
		{
			int nodeCount=q.size();

			if(nodeCount==0)
				return maxWidth;

			if(nodeCount>maxWidth)
				maxWidth=nodeCount;
			

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
		return maxWidth;
	}
}
