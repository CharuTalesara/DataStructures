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
		/* the parent parameter is passed to check is tree is empty so that we can set Tree's root as this.root */
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
			if(root.left.data>data )
			{
				return SingleRotateLeft(root);	
			}
			else
				return DoubleRotateWithLeft(root);
		}
		if(balance<-1)
		{
			if(root.right.data<data)
				return SingleRotateRight(root);
			else
				return DoubleRotateWithRight(root);
		}
			
		return root;
	}

	public int getBalance(AVLTreeNode x)
	{
		if(x==null)
			return 0;
		return Height(x.left)-Height(x.right);
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

	public AVLTreeNode SingleRotateLeft(AVLTreeNode x)
	{
		AVLTreeNode z=getParent(x);
		AVLTreeNode w=x.left;
		x.left=w.right;
		w.right=x;

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
		z.setLeft(SingleRotateRight(z.left));
		return SingleRotateLeft(z);
	}
	
	public AVLTreeNode DoubleRotateWithRight(AVLTreeNode z)
	{
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
