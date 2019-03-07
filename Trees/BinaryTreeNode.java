

public class BinaryTreeNode
{
	public int data;
	BinaryTreeNode left, right;

	public BinaryTreeNode(int x)
	{
		this.data=x;
		left=null;
		right=null;
	}

	public void setData(int x)
	{
		this.data=x;
	}

	public int getData()
	{
		return this.data;
	}

	public void setLeft(BinaryTreeNode left)
	{
		this.left=left;
	}

	public BinaryTreeNode getLeft()
	{
		return this.left;
	}

	public void setRight(BinaryTreeNode right)
	{
		this.right=right;
	}

	public BinaryTreeNode getRight()
	{
		return this.right;
	}
}
