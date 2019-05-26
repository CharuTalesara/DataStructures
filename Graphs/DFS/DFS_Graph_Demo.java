// DFS implemented 

public class DFS_Graph_Demo
{

	static int time=0; //making time a global/instance variable

	public static void main(String args[])
	{
		Graph g=new Graph(6);

		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,3);
		g.addEdge(2,1);
		g.addEdge(3,2);

		g.addEdge(4,5);
		g.addEdge(4,3);

		g.printVertex();
		g.printEdge();

		DFS(g);
		g.printVertex();		
	}

	public static void DFS(Graph g)
	{
		for(int i=0;i<g.v.length;i++)
		{
			if(g.v[i].color==Color.WHITE)
			{
				DFS_Visit(g,g.v[i]);
			}
		}
	}

	public static void DFS_Visit(Graph g,Vertex u)
	{
		time=time+1;
		
		u.firstVisited=time;
		u.color=Color.GREY;

		SinglyLinkedList sll=g.searchsll(u.data);
		ListNode baap=sll.head;
		ListNode curr=baap.next;

		while(curr!=null)
		{
			if(curr.keyVertex.color==Color.WHITE)
			{	
				Vertex c=g.searchVertex(curr.keyVertex.data);
				c.color=Color.GREY;
				c.parent=u;
				DFS_Visit(g,c);
				
			}
			
			curr=curr.next;
		}

		u.color=Color.BLACK;
		time=time+1;
		u.lastVisited=time;
	}

}
