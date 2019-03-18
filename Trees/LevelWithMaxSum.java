


public class LevelWithMaxSum
{
	public static void main(String args[])
	{
		BinaryTree bt=new BinaryTree();

		bt.insert(12);
		bt.insert(50);
		bt.insert(3);
		bt.insert(60);
		bt.insert(5);
		bt.insert(6);
		bt.insert(7);
		//bt.insert(8);
		//bt.insert(9);
		//bt.insert(10);
		//bt.insert(11);
		bt.preorder(bt.root);
		System.out.println();

		System.out.println("Maximum Sum  of a partiular level: "+maximumSumOfaLevel(bt.root));
		System.out.println("Level Having Maximum Sum : "+levelwithMaxSum(bt.root));
	}


	public static int levelwithMaxSum(BinaryTreeNode root)
	{
		int maxSum = 0;
		int height = 0;
		int retLevel=0;
		
		if(root == null)
			return 0;

		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(20);

		q.enQueue(root);
			
		while(true)
		{
			int nodeCount=q.size();

			if(nodeCount==0)
				return retLevel;

			int levelSum=0;	
			height++;
			
			while(nodeCount>0)
			{
				BinaryTreeNode currnode=q.dequeue();
				levelSum=levelSum+currnode.data;
				
				if(currnode.left!=null)
					q.enQueue(currnode.left);

				if(currnode.right!=null)
					q.enQueue(currnode.right);

				nodeCount--;
			}
			
			if(levelSum>maxSum)
			{
				maxSum=levelSum;
				retLevel=height;
			}
		}
	}

	public static int maximumSumOfaLevel(BinaryTreeNode root)
	{
		int maxSum = 0;
		
		if(root == null)
			return 0;

		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(20);

		q.enQueue(root);
		
		int height=0;
			
		while(true)
		{
			int nodeCount=q.size();

			if(nodeCount==0)
				return maxSum;

			int levelSum=0;	
			height++;		
			
			while(nodeCount>0)
			{
				BinaryTreeNode currnode=q.dequeue();
				levelSum=levelSum+currnode.data;
				
				if(currnode.left!=null)
					q.enQueue(currnode.left);

				if(currnode.right!=null)
					q.enQueue(currnode.right);

				nodeCount--;
			}
			
			if(levelSum>maxSum)
				maxSum=levelSum;
		}
	}
}
