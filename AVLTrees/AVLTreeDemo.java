

public class AVLTreeDemo
{
	public static void main(String args[])
	{
		AVLTree t=new AVLTree();

		/* Evaluating different cases for AVL tree insertion .. 
	
			CASE 1,4 : Single Rotation
			CASE 2,3 :  Double Rotation
		*/


		// For CASE 1 :
		/*t.insert(t.root,t.root,15);
		t.insert(t.root,t.root,10);
		t.insert(t.root,t.root,3);
		t.insert(t.root,t.root,2);
		t.insert(t.root,t.root,5);
		t.insert(t.root,t.root,1);
		t.insert(t.root,t.root,0);*/

		//FOR CASE 4 

		/*t.insert(t.root,t.root,1);
		t.insert(t.root,t.root,3);
		t.insert(t.root,t.root,5);
		t.insert(t.root,t.root,7);
		t.insert(t.root,t.root,8);*/

		// FOR CASE 2 
	
		/*t.insert(t.root,t.root,10);
		t.insert(t.root,t.root,3);
		t.insert(t.root,t.root,5);
		t.insert(t.root,t.root,7);
		t.insert(t.root,t.root,8);*/

		// FOR CASE 3 
	
		t.insert(t.root,t.root,10);
		t.insert(t.root,t.root,15);
		t.insert(t.root,t.root,12);
		/*t.insert(t.root,t.root,7);
		t.insert(t.root,t.root,8);*/

		/*
		t.insert(t.root,t.root,7);	
		t.insert(t.root,t.root,15);
		t.insert(t.root,t.root,20);
		t.insert(t.root,t.root,12);*/
		System.out.println("*****Prinintg AVL Tree***********");
		t.printTree(t.root);
		System.out.println("*****Prinintg AVL Tree***********");
	}
}
