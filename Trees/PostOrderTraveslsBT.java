
public class PostOrderTraveslsBT
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

		System.out.println("<<<<Postorder Traversal with recursion >>>>>>>>>>");
		postOrderRec(bst.root);
		System.out.println();
		System.out.println("<<<<Postorder Traversal with Stack >>>>>>>>>>");
		postOrderWithStack(bst.root);
	
	}


	public static void postOrderRec(BinaryTreeNode root)
	{
		if(root!=null)
		{
			postOrderRec(root.left);
			postOrderRec(root.right);
			System.out.print(root.data+" ");
		}
	}

	// Time Complexity - O(n) and Space complexity-O(h)--can also be used to find max height of tree

	public static void postOrderWithStack(BinaryTreeNode x)
	{
		ArrayStack stack=new ArrayStack(20);
		
		BinaryTreeNode currnode =x;

		while(currnode !=null || !stack.isEmpty())
		{
			if(currnode!=null)
			{
				stack.push(currnode);
				currnode=currnode.left;
			}
			else
			{
				BinaryTreeNode temp=((BinaryTreeNode)stack.top()).right;

				if(temp==null)
				{
					temp=(BinaryTreeNode)stack.pop();
					System.out.print(temp.data+" ");

					while(!stack.isEmpty() && temp==((BinaryTreeNode)stack.top()).right)
					{
						temp=(BinaryTreeNode)stack.pop();
						System.out.print(temp.data+" ");
					}
				}
				else
					currnode=temp;
			}
		}
		
	}
}
