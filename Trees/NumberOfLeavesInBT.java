


public class NumberOfLeavesInBT
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
		bt.preorder(bt.root);
		System.out.println();

		System.out.println("Leaves Count : "+leavesCount(bt.root));
	}

	public static int leavesCount(BinaryTreeNode root)
	{
		int count = 0;

		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(20);
		
		q.enQueue(root);
		
			
		while(!q.isEmpty())
		{
			BinaryTreeNode currnode=q.front();

			if(currnode.left==null && currnode.right==null)
				count++;

			if(currnode.left != null)
				q.enQueue(currnode.left);
			if(currnode.right!=null)
				q.enQueue(currnode.right);
			
			q.dequeue();
		}

		return count;
	}
}
