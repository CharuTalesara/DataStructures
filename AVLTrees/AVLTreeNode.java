

public class AVLTreeNode
{
	int data;
	int height;
	AVLTreeNode left;
	AVLTreeNode right;

	public AVLTreeNode(int data)
	{
		this.data=data;
		this.height=1;
		left=null;
		right=null;
	}

	public int getHeight()
	{
		return this.height;
	}

	public int getData()
	{
		return this.data;
	}
	
	public AVLTreeNode getLeft()
	{
		return this.left;
	}	

	public AVLTreeNode getRight()
	{
		return this.right;
	}

	public void setData(int data)
	{
		this.data=data;
	}	

	public void setHeight(int h)
	{
		this.height=h;
	}	

	public void setLeft(AVLTreeNode left)
	{
		this.left=left;
	}	

	public void setRight(AVLTreeNode right)
	{
		this.right=right;
	}

	public void printNode()
	{
		System.out.println("Data : "+this.data+" Height : "+this.height);
	}	
}

