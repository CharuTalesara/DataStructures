

enum Color
{
	WHITE,BLACK,GREY;
}

public class Vertex
{
	int data;
	Color color;
	Vertex parent;
	int firstVisited;
	int lastVisited;
	int indegree;

	public Vertex(int data)
	{
		this.data=data;
		color=Color.WHITE;
		this.parent=null;
		firstVisited=-1;
		lastVisited=-1;
		indegree=0;
	}

	public void printVertex()
	{
		System.out.println("Vertex Data : "+this.data+", Color : "+this.color+",FirstVisited : "+this.firstVisited+" ,Last Visited : "+lastVisited+",Indegree : "+indegree);
		if(this.parent!=null)
			System.out.println("Vertex Parent : "+this.parent.data);	
	}
}
