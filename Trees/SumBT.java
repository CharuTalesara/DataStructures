

public class SumBT
{
	static int sum=0;
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
		bt.insert(13);
		//bt.insert(14);
		bt.preorder(bt.root);
		System.out.println();
		System.out.println("Sum : "+sumbt(bt.root));
	}

	public static int sumbt(BinaryTreeNode x)
	{

		if(x!=null)
		{
			sum=sum+x.data;
			sumbt(x.left);
			sumbt(x.right);
		}
		return sum;
	}

}
