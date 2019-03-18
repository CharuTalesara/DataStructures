// In Binary Tree every operation takes place at a particular level -- so we are supposed to traverse level order wheever we perform any operation ... whehter its searching / inserting... 

// For deleting a node v need to traverse depth first ..as we need the pointers to the childern node 


public class BinaryTree
{
	BinaryTreeNode root=null;

	public void insert(int k)
	{
		BinaryTreeNode node=new BinaryTreeNode(k);
		
		if(root==null)
		{
			root = node;
			return;
		}

		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(20);
		
		q.enQueue(root);
	
		while(!q.isEmpty())
		{
			BinaryTreeNode currnode=q.dequeue();
			
			if(currnode.left!=null)
				q.enQueue(currnode.left);
			else
			{
				currnode.left=node;
				return;
			}

			if(currnode.right!=null)
				q.enQueue(currnode.right);
			else
			{
				currnode.right=node;
				return ;
			}
		}
	}

	public BinaryTreeNode search(BinaryTreeNode x,int key)
	{
		if(root.data == key || root==null)
			return root;

		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(20);
		
		q.enQueue(root);
		BinaryTreeNode currnode=null;

		while(!q.isEmpty())
		{
			currnode=q.dequeue();
			if(currnode.data==key)
				return currnode;
			if(currnode.left!=null)
				q.enQueue(currnode.left);
			if(currnode.right!=null)
				q.enQueue(currnode.right);
		}
		return currnode;
	}


	public BinaryTreeNode getParent(BinaryTreeNode root,int key)
	{
		if(root.data == key || root==null)
			return null;

		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(20);
		
		q.enQueue(root);
		BinaryTreeNode currnode=null;

		while(!q.isEmpty())
		{
			currnode=q.dequeue();

			if(currnode.left.data==key  || currnode.right.data==key)
				return currnode;

			if(currnode.left!=null)
				q.enQueue(currnode.left);
			if(currnode.right!=null)
				q.enQueue(currnode.right);
		}
		return currnode;
	}

	/*
		For deleting a node in binary tree find the node to be deleted and then find the deepest node 
		Replace the data of deepest node in the node to be deleted
		Delete the deepest node..
	*/
	public  BinaryTreeNode delete(BinaryTreeNode root, int key)
	{
		BinaryTreeNode node=search(root,key);

		DeepestNodeBT bt = new DeepestNodeBT();
		BinaryTreeNode deepestNode=bt.deepestNode(root);

		BinaryTreeNode deepestNodeParent=getParent(root,deepestNode.data);
		
		
		node.data=deepestNode.data;
	
		if(deepestNodeParent.left==deepestNode)
			deepestNodeParent.left=null;
		else
			deepestNodeParent.right=null;
		
		return root;
	}

	public BinaryTreeNode maxBT(BinaryTreeNode root)
	{
		if(root == null)
			return root;

		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(20);
		
		q.enQueue(root);

		BinaryTreeNode maxNode=root;
		
		while(!q.isEmpty())
		{
			BinaryTreeNode currnode=q.dequeue();
			if(currnode.data>maxNode.data)
				maxNode=currnode;
			if(currnode.left!=null)
				q.enQueue(currnode.left);
			if(currnode.right!=null)
				q.enQueue(currnode.right);
		}

		return maxNode;
	}

	

	


	public int size(BinaryTreeNode root)
	{
		if(root == null)
			return 0;

		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue(20);
		
		q.enQueue(root);
		int count=0;
		
		while(!q.isEmpty())
		{
			BinaryTreeNode currnode=q.dequeue();
			count++;
			if(currnode.left!=null)
				q.enQueue(currnode.left);
			if(currnode.right!=null)
				q.enQueue(currnode.right);
		}

		return count;
	}


	public void preorder(BinaryTreeNode x)
	{
		if(x!=null)
		{
			System.out.print(x.data+" ");
			preorder(x.left);
			preorder(x.right);
		}
		
	}

}
