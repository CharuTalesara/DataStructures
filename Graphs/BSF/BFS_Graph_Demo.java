

public class BFS_Graph_Demo
{
	public static void main(String args[])
	{
		Graph g=new Graph(8);

		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,4);
		g.addEdge(1,7);
		g.addEdge(2,3);
		g.addEdge(4,5);
		g.addEdge(4,7);
		g.addEdge(5,6);
		g.addEdge(5,7);
		g.addEdge(6,7);

		g.printVertex();
		g.printEdge();

		BFS(g);
		g.printVertex();
	}

	public static void BFS(Graph g)
	{
		g.v[0].color=Color.GREY;
		g.v[0].distanceFromSource=0;

		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue();
		q.enQueue(g.v[0]);

		while(!q.isEmpty())
		{
			Vertex v=q.dequeue();
			
			SinglyLinkedList sll=g.searchsll(v.data);
			
			ListNode baap=sll.head;
			ListNode curr=baap.next;
			
			while(curr!=null)
			{
				if(curr.keyVertex.color==Color.WHITE)
				{
					curr.keyVertex.color=Color.GREY;
					curr.keyVertex.distanceFromSource=baap.keyVertex.distanceFromSource+1;
					curr.keyVertex.parent=baap.keyVertex;
					
					Vertex currV=g.searchVertex(curr.keyVertex.data);
					q.enQueue(currV);
				}
				curr=curr.next;
			}
			baap.keyVertex.color=Color.BLACK;			
		}
	}
}
