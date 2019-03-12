
public class PreOrderTraveslsBT
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

		System.out.println("<<<<Preorder Traversal with recursion >>>>>>>>>>");
		preOrderRec(bst.root);
		System.out.println();
		System.out.println("<<<<Preorder Traversal with Stack >>>>>>>>>>");
		preOrderWithStack(bst.root);
	
	}

	public static void preOrderWithStack(BinaryTreeNode x)
	{
		ArrayStack stack=new ArrayStack(20);

		stack.push(x);

		while(!stack.isEmpty())
		{
			BinaryTreeNode temp =(BinaryTreeNode) stack.pop();
			System.out.print(temp.data + " ");
			
			if(temp.right!=null)
				stack.push(temp.right);
			if(temp.left!=null)
				stack.push(temp.left);
		}
		System.out.println();
	}


	public static void preOrderRec(BinaryTreeNode root)
	{
		if(root!=null)
		{
			System.out.print(root.data+" ");
			preOrderRec(root.left);
			preOrderRec(root.right);
		}
	}

	
}
