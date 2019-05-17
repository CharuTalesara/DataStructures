import java.lang.*;

public class  AVLTree
{
	AVLTreeNode root;

	public AVLTree()
	{
		root=null;
	}
	
	public int getTreeHeight(AVLTreeNode root)
	{
		if(root==null)
			return -1;
		else
			return root.getHeight();
	}

	public AVLTreeNode insert(AVLTreeNode root,AVLTreeNode parent,int data)
	{
		/* the parent parameter is passed to check if tree is empty so that we can set Tree's root as this.root */
		if(parent==null)
		{
			this.root=new AVLTreeNode(data);
			return root;
		}

		if(root==null)
		{
			root=new AVLTreeNode(data);
			return root;
		}	
		
		if(root.data>data)
			root.left=insert(root.left,root,data);
		else
			root.right=insert(root.right,root,data);

		root.height=Math.max(Height(root.left),Height(root.right))+1;

		int balance =getBalance(root);
		
		if(balance>1)
		{
			if(root.left.data>data ) //CASE 1
			{
				return SingleRotateLeft(root);	
			}
			else
				return DoubleRotateWithLeft(root); //CASE 2
		}
		if(balance<-1)
		{
			if(root.right.data<data)
				return SingleRotateRight(root); //CASE 4
			else
				return DoubleRotateWithRight(root); //CASE 3
		}
			
		return root;
	}

	public AVLTreeNode delete(AVLTreeNode root,int key)
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
				AVLTreeNode temp=getSuccessor(root);
				root.data=temp.data;
				root.right=delete(root.right,temp.data);
			}
		}

		if(root==null)
			return root;
	
		root.setHeight(Math.max(Height(root.left),Height(root.right))+1);

		int balance =getBalance(root);
		
		if(balance>1  && getBalance(root.left)>=0)
		{
			return SingleRotateLeft(root);
		}

		if(balance>1  && getBalance(root.left)<0)
		{
			return DoubleRotateWithLeft(root);
		}

		if(balance<-1  && getBalance(root.right)>=0)
		{
			return DoubleRotateWithLeft(root);
		}

		if(balance<-1 && getBalance(root.right)<0)
		{
			return SingleRotateLeft(root);
		}


		return root;
	}

	public int getBalance(AVLTreeNode x)
	{
		if(x==null)
			return 0;
		return Height(x.left)-Height(x.right);
	}

	public AVLTreeNode SingleRotateLeft(AVLTreeNode x)
	{
		AVLTreeNode z=getParent(x);
		AVLTreeNode w=x.left;
		x.left=w.right;
		w.right=x;

		// Setting x's parent's child as w .. n if not tree's root is  w

		if(z!=null )
			if(z.right==x)
				z.right=w;
			else
				z.left=w;
		else
			this.root=w;

		x.setHeight(Math.max(Height(x.left),Height(x.right))+1);		
		w.setHeight(Math.max(Height(w.left),Height(w.right))+1);		
		
		return w;
	}

	public AVLTreeNode SingleRotateRight(AVLTreeNode x)
	{
		AVLTreeNode z=getParent(x);
		AVLTreeNode w=x.right;
		x.right=w.left;
		w.left=x;

		if(z!=null )
			if(z.right==x)
				z.right=w;
			else
				z.left=w;
		else
			this.root=w;


		x.setHeight(Math.max(Height(x.left),Height(x.right))+1);		
		w.setHeight(Math.max(Height(w.left),Height(w.right))+1);		
		
		return w;
	}

	public AVLTreeNode DoubleRotateWithLeft(AVLTreeNode z)
	{
		// converting in CASE 1
		z.setLeft(SingleRotateRight(z.left));
		return SingleRotateLeft(z);
	}
	
	public AVLTreeNode DoubleRotateWithRight(AVLTreeNode z)
	{
		// Converting in case 4
		z.setRight(SingleRotateLeft(z.right));
		return SingleRotateRight(z);
	}

	
	public int Height(AVLTreeNode root)
	{
		if(root==null)
			return 0;
		else
			return root.getHeight();
	}

	public AVLTreeNode getParent(AVLTreeNode x)
	{
		AVLTreeNode curr=this.root;
		
		if(curr==null)
			return null;

		AVLTreeNode parent=null;
		
		while(curr!=null && curr.data!=x.data)
		{
			parent=curr;
			if(curr.data>x.data)
				curr=curr.left;
			else
				curr=curr.right;
		}

		return parent;
	}

	public AVLTreeNode getMin(AVLTreeNode x)	
	{
		if(x.left==null)
			return x;

		return getMin(x.left);
	}

	public AVLTreeNode getMax(AVLTreeNode x)	
	{
		if(x.right==null)
			return x;

		return getMax(x.right);
	}

	public AVLTreeNode getSuccessor(AVLTreeNode x)
	{

		AVLTreeNode currnode = search(x.data);

		if(currnode ==null)
			return null;		
		
		if(currnode.right!=null)
			return getMin(currnode.right);
		
		else
		{
			AVLTreeNode y=root;
			AVLTreeNode successor = null;

			while(x.data!=y.data)
			{
				if(y.data>x.data)
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


	public AVLTreeNode search(int x)
	{
		AVLTreeNode currnode=root;

		if(currnode==null)
			return null;
		
		if(currnode.data==x)
			return  currnode;

		while(currnode!=null && currnode.data!=x)
		{
			if(currnode.data<x)
				currnode=currnode.right;
			else
				currnode=currnode.left;
		}

		return currnode;
	}

	public void printTree(AVLTreeNode root)
	{
		if(root!=null)
		{
			printTree(root.left);
			root.printNode();
			if(getParent(root)!=null)
				System.out.println("Parent : "+getParent(root).data);
			printTree(root.right);
		}
		
	}
}
