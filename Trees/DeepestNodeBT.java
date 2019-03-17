


public class DeepestNodeBT
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
		//bt.insert(11);
		bt.preorder(bt.root);
		System.out.println();

		System.out.println("Height of the Binary Tree: "+deepestNode(bt.root).data);
	}

	// Returning number of nodes ...not the number of edges from root to deepest node..

	public static BinaryTreeNode deepestNode(BinaryTreeNode root)
	{
			
		if(root == null)
			return null;

		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(20);

		q.enQueue(root);
		BinaryTreeNode currnode=q.front();
			
		while(!q.isEmpty())
		{
			currnode=q.front();
			if(currnode.left != null)
				q.enQueue(currnode.left);
			if(currnode.right!=null)
				q.enQueue(currnode.right);
			
			q.dequeue();
		}
		return currnode;
	}
}
