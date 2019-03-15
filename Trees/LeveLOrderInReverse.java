

public class LeveLOrderInReverse
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
		bt.preorder(bt.root);
		System.out.println();
		System.out.println("......Printing Level Order in Reverse.......");
		levelOrderReverse(bt.root);
	}

	public static void levelOrderReverse(BinaryTreeNode root)
	{
		if(root == null)
			return;
		
		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(20);
		
		q.enQueue(root);

		ArrayStack stack=new ArrayStack(20);
		
		while(!q.isEmpty())
		{
			BinaryTreeNode currnode =q.dequeue();
			stack.push(currnode);

			// Pusing right child first so that while retreving we get the elements in the required order
			if(currnode.right!=null)
				q.enQueue(currnode.right);
			if(currnode.left!=null)
				q.enQueue(currnode.left);
			
		}

		while(!stack.isEmpty())
		{
			System.out.print(((BinaryTreeNode)stack.pop()).data+" ");
		}
		System.out.println();
	}
}
