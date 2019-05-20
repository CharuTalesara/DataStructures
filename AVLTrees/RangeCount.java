
// Count the number of nodes in the range a nad b
public class RangeCount
{
	public static void main(String args[])
	{
		AVLTree t=new AVLTree();

		t.insert(t.root,t.root,4);
		t.insert(t.root,t.root,2);
		t.insert(t.root,t.root,6);
		t.insert(t.root,t.root,1);
		t.insert(t.root,t.root,3);
		t.insert(t.root,t.root,5);
		t.insert(t.root,t.root,7);

		System.out.println("*****Prinintg AVL Tree***********");
		t.printTree(t.root);
		
		System.out.println("*****count : "+countRange(t.root,4,6));
	}

	public static int countRange(AVLTreeNode root,int a,int b)
	{
		int count =0;

		if(root==null)
			return 0;

		if(root.data>=a && root.data<=b)
			return 1+countRange(root.right,a,b)+countRange(root.left,a,b);

		if(root.data<a)
			return countRange(root.right,a,b);

		if(root.data>b)
			return countRange(root.left,a,b);

		return count;
	}
}
