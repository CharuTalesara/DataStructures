


public class MaximumWidthBTRecursion
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
		bt.insert(12);
		//bt.insert(13);
		//bt.insert(14);
		//bt.insert(15);
		bt.preorder(bt.root);
		System.out.println();

		System.out.println("Max Width of BT : "+maxwidth(bt.root));
		
	}

	public static int maxwidth(BinaryTreeNode root)
	{
		BTHeightWithQ bth=new BTHeightWithQ();

		int height=bth.heightBTWithq(root);
		int max=0;

		for(int k=0;k<height;k++)
		{
			int temp=maxwidth(root,k);
			if(max<temp)
				max=temp;
		}
		return max;
	}

	public static int maxwidth(BinaryTreeNode root,int depth)
	{
		if(root==null)
			return 0;

		if(depth==0)
			return 1;

		else
			return maxwidth(root.left,depth-1)+maxwidth(root.right,depth-1);
		
	}
	
}
