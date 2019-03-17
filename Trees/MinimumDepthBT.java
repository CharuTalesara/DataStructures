


public class MinimumDepthBT
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
		bt.insert(15);
		bt.preorder(bt.root);
		System.out.println();

		System.out.println("Minimum Depth Of the Binary Tree: "+minDepthStack(bt.root));
		System.out.println("Minimum Depth Of the Binary Tree: "+minDepthQ(bt.root));
	}

	

	public static int minDepthStack(BinaryTreeNode root)
	{
			
		if(root == null)
			return 0;

		ArrayStack stack=new ArrayStack(20);

		stack.push(root);
		
		int mindepth=1;
			
		while(!stack.isEmpty())
		{
			BinaryTreeNode currnode=(BinaryTreeNode)stack.pop();
			if(currnode.left !=null && currnode.right!=null)
			{
				stack.push(currnode.left);
				stack.push(currnode.right);
				mindepth++;
			}
			else
				break;
		}
		return mindepth;
	}

	public static int minDepthQ(BinaryTreeNode root)
	{
		if(root == null)
			return 0;

		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(20);

		q.enQueue(root);
		
		int mindepth=1;

		while(true)
		{
			int nodeCount = q.size();
			while(nodeCount>0)
			{
				BinaryTreeNode currnode = q.front();

				if(currnode.left==null || currnode.right==null)
					return mindepth;
				
				if(nodeCount==q.size())
					mindepth++;
				
				q.dequeue();
				q.enQueue(currnode.right);
				q.enQueue(currnode.left);
				
				nodeCount--;
			}
			
		}
	}
}
