// Representing graph as a matrix

public class Graph_Matrix
{
	int adjMatrix[][];
	int vertexCount;
		
	public Graph_Matrix(int vcount)
	{
		vertexCount=vcount;
		adjMatrix=new int[vcount][vcount];
	}

	public void addEdge(int i,int j)
	{
		if(i>=0 && j>=0 && i<vertexCount && j<vertexCount)
		{
			adjMatrix[i][j]=1;
			adjMatrix[j][i]=1;
		}
	}	

	public void removeEdge(int i,int j)
	{
		if(i>=0 && j>=0 && i<vertexCount && j<vertexCount)
		{
			adjMatrix[i][j]=0;
			adjMatrix[j][i]=0;
		}
	}

	public boolean isEdge(int i,int j)
	{
		if(i>=0 && j>=0 && i<vertexCount && j<vertexCount && adjMatrix[i][j]==1)
			return true;
		else
			return false;
	}

	public void printMatrix()
	{
		for(int i=0;i<vertexCount;i++)
		{
			for(int j=0;j<vertexCount;j++)
			{
				System.out.print(adjMatrix[i][j]+" ");		
			}
			System.out.println();
		}
	}			
}
