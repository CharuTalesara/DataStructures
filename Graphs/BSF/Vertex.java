

enum Color
{
	WHITE,BLACK,GREY;
}

public class Vertex
{
	int data;
	Color color;
	Vertex parent;
	int distanceFromSource;

	public Vertex(int data)
	{
		this.data=data;
		color=Color.WHITE;
		this.parent=null;
		distanceFromSource=0;
	}

	public void printVertex()
	{
		System.out.println("Vertex Data : "+this.data+", Color : "+this.color+", Distance From Source : "+this.distanceFromSource);
		if(this.parent!=null)
			System.out.println("Vertex Parent : "+this.parent.data);	
	}
}
