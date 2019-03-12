/*
BST implementation Test
*/


import java.util.*;

public class BinarySearchTreeDemo
{
	public static void main(String args[])
	{
		System.out.println("Lets start the operations on Binary Search Tree");
		choosOps();
		
	}

	public static void choosOps()
	{
		System.out.println("Press 0 to exit ..else continue");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==0)
			System.exit(0);
		BinarySearchTree bst=new BinarySearchTree();
		

		while(choice!=0)
		{
			
			System.out.println("Press 0 to exit ..else continue");
			System.out.println("Press 1 to insert a node in the tree");
			System.out.println("Press 2 to delete a node from tree");
			System.out.println("Press 3 to check whether an element is there in the tree or not");
			System.out.println("Press 4 to maximum of the tree");
			System.out.println("Press 5 to minimum of the tree");
			System.out.println("Press 7 to get the successor of a node");
			System.out.println("Press 8 to get the predecessor of a node");			
			
			choice=sc.nextInt();
			switch(choice)
			{
				case 1 : System.out.println("Enter the data of the node");
					 int key=sc.nextInt();
					 bst.insert(key);
					 bst.inorder(bst.root);
					 System.out.println();
					 break;
			
				case 2 : //delete
					 System.out.println("Enter the node data ypu want to delete");
					 int del=sc.nextInt();
					 bst.root=bst.delete(bst.root,del);
					 bst.inorder(bst.root);
					 System.out.println();
					 break;	
					
				
				case 3 : System.out.println("Enter the element you want to search ");
					 int x=sc.nextInt();
					 System.out.println("If the int there : "+bst.search(bst.root,x).data);
					 break;

				case 4 : System.out.println("Max of the tree : "+bst.getMax(bst.root).data);
					 break;

				case 5 : 
					 System.out.println("Min of the tree "+bst.getMin(bst.root).data);
					 break;

				case 7 : System.out.println("Enter the element whose successor u wanna get ");
					 int item=sc.nextInt();
					 BinaryTreeNode z=new BinaryTreeNode(item);
					 System.out.println("Successor : "+bst.getSuccessor(z).data);
					 break;

				case 8 : System.out.println("Enter the element whose predecessor u wanna get ");
					 int item1=sc.nextInt();
					 BinaryTreeNode z1=new BinaryTreeNode(item1);
					 System.out.println("Predecessor : "+bst.getPredecessor(z1).data);
					 break;

				
			}
			
		}
	}
}
