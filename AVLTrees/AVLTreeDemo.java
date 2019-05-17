

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
	
		/*t.insert(t.root,t.root,10);
		t.insert(t.root,t.root,15);
		t.insert(t.root,t.root,12);*/
		/*t.insert(t.root,t.root,7);
		t.insert(t.root,t.root,8);*/

		/*
		t.insert(t.root,t.root,7);	
		t.insert(t.root,t.root,15);
		t.insert(t.root,t.root,20);
		t.insert(t.root,t.root,12);*/
		/*System.out.println("*****Prinintg AVL Tree***********");
		t.printTree(t.root);
		System.out.println("*****Prinintg AVL Tree***********");
		System.out.println("******Search Checking******");*/
		//System.out.println(t.search(12).data);

		// Evaluating different cases for deletion 

		t.insert(t.root,t.root,14);
		t.insert(t.root,t.root,21);
		t.insert(t.root,t.root,15);
		t.insert(t.root,t.root,28);
		t.insert(t.root,t.root,26);
		t.insert(t.root,t.root,35);
		//t.insert(t.root,t.root,15);
		t.insert(t.root,t.root,4);
		t.insert(t.root,t.root,2);
		t.insert(t.root,t.root,9);
		t.insert(t.root,t.root,7);
		t.insert(t.root,t.root,10);
		/*t.insert(t.root,t.root,7);
		t.insert(t.root,t.root,10);*/

		//t.printTree(t.root);
		/*System.out.println("Minimum : "+t.getMin(t.root).data);
		System.out.println("Maximum : "+t.getMax(t.root).data);
		System.out.println("Suceesor of 26 : "+t.getSuccessor(t.search(26)).data);
		System.out.println("Suceesor of 2 : "+t.getSuccessor(t.search(2)).data);*/

		/*t.delete(t.root,15);
		t.delete(t.root,21);
		//t.delete(t.root,9);
		System.out.println("*****Prinintg AVL Tree***********");
		t.printTree(t.root);*/

		t.insert(t.root,t.root,1);
		System.out.println("*****Prinintg AVL Tree***********");
		t.printTree(t.root);
		t.delete(t.root,9);
		t.delete(t.root,7);
		t.delete(t.root,10);
		System.out.println("*****Prinintg AVL Tree***********");
		t.printTree(t.root);
		/*t.delete(t.root,26);
		System.out.println("*****Prinintg AVL Tree***********");
		t.printTree(t.root);

		t.delete(t.root,14);
		System.out.println("*****Prinintg AVL Tree***********");
		t.printTree(t.root);*/		
	}
}
