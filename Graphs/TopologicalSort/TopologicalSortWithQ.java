// DFS implemented 

public class TopologicalSortWithQ
{

	static int time=0; //making time a global/instance variable

	public static void main(String args[])
	{
		Graph g=new Graph(8);

		g.addEdge(0,3);
		g.addEdge(0,4);
		g.addEdge(1,3);
		g.addEdge(2,4);
		g.addEdge(2,7);

		g.addEdge(3,5);
		g.addEdge(4,6);
		g.addEdge(5,0);

		g.printVertex();
		g.printEdge();

		sort(g);
	}

	public static void sort(Graph g)
	{
		FixedSizeCircularArrayQueue q=new FixedSizeCircularArrayQueue();
		int count=0;
		
		for(int i=0;i<g.v.length;i++)
		{
			if(g.v[i].indegree==0)
			{
				q.enQueue(g.v[i]);
			}
		}

		while(!q.isEmpty())
		{
			Vertex v=q.dequeue();

			count++;

			v.printVertex();
			
			SinglyLinkedList sll=g.searchsll(v.data);

			ListNode baap=sll.head;
			ListNode curr=baap.next;
			
			while(curr!=null)
			{
				curr.keyVertex.indegree--;

				if(curr.keyVertex.indegree==0)	
				{
					Vertex currV=g.searchVertex(curr.keyVertex.data);
					q.enQueue(currV);
				}
				curr=curr.next;
			}		
		}

		System.out.println("Count : "+count);

		if(count<g.vertexCount)
			System.out.println("Graph has a cycle");
	}
}
