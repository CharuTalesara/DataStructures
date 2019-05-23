

public class Graph_Matrix_Demo
{
	public static void main(String args[])
	{
		Graph_Matrix gm=new Graph_Matrix(5);

		gm.addEdge(0,1);
		gm.addEdge(1,2);
		gm.addEdge(2,3);
		gm.addEdge(3,4);

		gm.printMatrix();
	}
}

