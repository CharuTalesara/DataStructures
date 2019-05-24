

public class Graph
{
	Vertex[] v;
	int vertexCount;
	SinglyLinkedList[] adj;

	public Graph(int vcount)
	{
		this.vertexCount=vcount;
	
		v=new Vertex[vertexCount];
		for(int i=0;i<vertexCount;i++)
			v[i]=new Vertex(i);
		
		adj=new SinglyLinkedList[vertexCount];
		for(int i=0;i<vertexCount;i++)
		{
			ListNode node=new ListNode(v[i]);
			adj[i]=new SinglyLinkedList(node);
		}
	}

	public void addEdge(int i,int j)
	{
		SinglyLinkedList sll_i=searchsll(i);
		SinglyLinkedList sll_j=searchsll(j);

		
		sll_i.insert(searchVertex(j));
		sll_j.insert(searchVertex(i));
		
		return;
	}

	public Vertex searchVertex(int i)
	{
		for(int j=0;j<vertexCount;j++)
		{
			if(v[j].data==i)
				return v[j];
		}
		return null;
	}

	public SinglyLinkedList searchsll(int i)
	{
		for(int j=0;j<vertexCount;j++)
		{
			if(adj[i].head.keyVertex.data==i)
				return adj[i];
		}
		return null;
	}

	public void printVertex()
	{
		System.out.println("<<<<<<<<Printing Vertex>>>>>>>");
		for(int i=0;i<vertexCount;i++)
		{
			//System.out.print(v[i].data+" ");
			v[i].printVertex();
		}
		//System.out.println();
		System.out.println("<<<<<<<<Printed Vertex>>>>>>>");
	}

	public void printEdge()
	{
		System.out.println("<<<<<<<<Printing Edges>>>>>>>");
		for(int i=0;i<vertexCount;i++)
		{
			adj[i].print();
		}
		System.out.println();
		System.out.println("<<<<<<<<Printed Edges>>>>>>>");
	}
}  
