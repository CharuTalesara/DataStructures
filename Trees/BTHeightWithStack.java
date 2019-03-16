


public class BTHeightWithStack
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

		System.out.println("Height of the Binary Tree: "+heightBTWithStack(bt.root));
	}

	// Returning number of nodes ...not the number of edges from root to deepest node..

	public static int heightBTWithStack(BinaryTreeNode root)
	{
		int height = 0;
		
		if(root == null)
			return height;

		ArrayStack stack=new ArrayStack(20);

		stack.push(root);
			
		while(!stack.isEmpty())
		{
			BinaryTreeNode currnode=(BinaryTreeNode)stack.pop();

			if(currnode.left!=null && currnode.right!=null)
			{
				height++;
				stack.push(currnode.left);
				stack.push(currnode.right);				
			}

			else if(currnode.left != null)
			{
				height++;
				stack.push(currnode.left);
			}
			else if(currnode.right!=null)
			{
				height++;
				stack.push(currnode.right);
			}
		}

		return height; 
	}
}
