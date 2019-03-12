
public class InOrderTraveslsBT
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

		System.out.println();
		System.out.println("<<<<Inorder Traversal with Stack >>>>>>>>>>");
		inOrderWithStack(bst.root);
	
	}


	public static void inOrderWithStack(BinaryTreeNode x)
	{
		ArrayStack stack=new ArrayStack(20);
		boolean done = false;
		BinaryTreeNode currnode =x;

		while(!done)
		{
			if(currnode!=null)
			{
				stack.push(currnode);
				currnode=currnode.left;
			}
			else
			{
				if(stack.isEmpty())
					done=true;
				else
				{
					currnode =(BinaryTreeNode) stack.pop();
					System.out.print(currnode.data + " ");
					currnode=currnode.right;
				}
			}
		}

	}
}
