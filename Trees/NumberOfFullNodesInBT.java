


public class NumberOfFullNodesInBT
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

		System.out.println("Full Nodes Count : "+fullNodesCount_Rec(bt.root));
	}

	public static int fullNodesCount_Rec(BinaryTreeNode root)
	{
		if(root==null)
			return 0;
		if(root.left!=null && root.right!=null)
			return 1+fullNodesCount_Rec(root.right)+fullNodesCount_Rec(root.left);
		else if(root.right!=null)
			return fullNodesCount_Rec(root.right);
		else
			return fullNodesCount_Rec(root.left);
			
	}

	public static int fullNodesCount(BinaryTreeNode root)
	{
		int count = 0;

		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(20);
		
		q.enQueue(root);
		
			
		while(!q.isEmpty())
		{
			BinaryTreeNode currnode=q.front();

			if(currnode.left!=null && currnode.right!=null)
			{
				count++;
				q.enQueue(currnode.left);
				q.enQueue(currnode.right);				
			}

			else if(currnode.left != null)
				q.enQueue(currnode.left);
			else if(currnode.right!=null)
				q.enQueue(currnode.right);
			
			q.dequeue();
		}

		return count;
	}
}
