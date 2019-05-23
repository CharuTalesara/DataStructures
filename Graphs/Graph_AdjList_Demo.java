

public class Graph_AdjList_Demo
{
	public static void main(String args[])
	{
		Graph_AdjList gdl=new Graph_AdjList(5);
		gdl.addEdge(1,2);
		gdl.addEdge(2,3);
		gdl.addEdge(3,4);
		gdl.printGraph();
	}
}
