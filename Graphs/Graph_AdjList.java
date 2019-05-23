

public class Graph_AdjList
{
	SinglyLinkedList[] sll_array;
	int vertexCount;

	public Graph_AdjList(int vcount)
	{
		vertexCount=vcount;
		sll_array=new SinglyLinkedList[vertexCount];
		for(int i=0;i<vertexCount;i++)
		{
			sll_array[i]=new SinglyLinkedList();
			sll_array[i].insert(i);
		}
	}

	public void addEdge(int i,int j)
	{
		sll_array[i].insert(j);
		sll_array[j].insert(i);
	}	

	public void printGraph()
	{
		for(int i=0;i<vertexCount;i++)
		{
			sll_array[i].print();
		} 
	}
}
