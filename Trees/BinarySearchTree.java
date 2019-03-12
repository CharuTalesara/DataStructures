

public class BinarySearchTree
{
	BinaryTreeNode root=null;

	public void insert(int key)
	{
		BinaryTreeNode node=new BinaryTreeNode(key);
		
		if(root==null)
		{
			root = node;
			return;
		}
		
		BinaryTreeNode x=root;
		
		BinaryTreeNode y=x;
	
		while(x!=null)
		{
			y=x;
			if(x.data<key)
				x=x.right;
			else
				x=x.left;
		}

		if(y.data>key)
			y.left=node;
	
		else
			y.right=node;
	}

	
	public void inorder(BinaryTreeNode x)
	{
		if(x!=null)
		{
			inorder(x.left);
			System.out.print(x.data+" ");
			inorder(x.right);
		}
		
	}

	public BinaryTreeNode getMin(BinaryTreeNode x)
	{
		if(x.left==null)
			return x;
		else
			return getMin(x.left);
	}

	public BinaryTreeNode getMax(BinaryTreeNode x)
	{
		if(x.right==null)
			return x;
		else
			return getMax(x.right);
	}

	public BinaryTreeNode search(BinaryTreeNode root,int x)
	{
		if(root.data== x || root==null)
			return root;
		if(root.data < x)
			return search(root.right,x);
		else
			return search(root.left,x);
	}

	public BinaryTreeNode getSuccessor(BinaryTreeNode x)
	{
		BinaryTreeNode currnode = search(root,x.data);

		if(currnode ==null)
			return null;		
		
		if(currnode.right!=null)
			return getMin(currnode.right);
		
		else
		{
			BinaryTreeNode y=root;
			BinaryTreeNode successor = null;

			while(x.data!=y.data)
			{
				if(y.data> x.data)
				{
					successor=y;
					y=y.left;
				}
				else
					y=y.right;
			}

			return successor;
		}
	}

	public BinaryTreeNode getPredecessor(BinaryTreeNode x)
	{
		BinaryTreeNode currnode = search(root,x.data);

		if(currnode ==null)
			return null;		
		
		if(currnode.left!=null)
			return getMax(currnode.left);
		
		else
		{
			BinaryTreeNode y=root;
			BinaryTreeNode predecessor = null;

			while(x.data!=y.data)
			{
				if(y.data> x.data)
					y=y.left;
				
				else
				{
					predecessor=y;
					y=y.right;
				}
			}

			return predecessor;
		}
	}


	public BinaryTreeNode delete(BinaryTreeNode root,int key)
	{
		if(root == null)
			return root;
				
		else if(root.data>key)
			root.left= delete(root.left,key);

		else if(root.data<key)
			root.right= delete(root.right,key);

		else	// Got the node to be deleted
		{
			if(root.left==null && root.right==null)
				root=null;
			else if(root.left==null)
				root=root.right;
			else if(root.right==null)
				root=root.left;

			else
			{
				BinaryTreeNode temp=getSuccessor(root);
				root.data=temp.data;
				root.right=delete(root.right,temp.data);
			}
		}
		return root;
	}
}















