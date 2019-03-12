public class LevelOrderTravelBST
{
	public static void main(String args[])
	{
		BinarySearchTree bst=new BinarySearchTree();
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

		levelOrder(bst.root);
	}

		// Time Complexity- O(n) ..space -O(n)	

	public static void levelOrder(BinaryTreeNode root)
	{
		if(root == null)
			return;
		
		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(20);
		
		q.enQueue(root);
		
			
		while(!q.isEmpty())
		{
			BinaryTreeNode currnode=q.front();
			if(currnode.left != null)
				q.enQueue(currnode.left);
			if(currnode.right!=null)
				q.enQueue(currnode.right);
			
			System.out.print(currnode.data+" ");
			q.dequeue();
		}

		System.out.println();
	}
}


