

public class TSTNode
{
	char data;
	boolean end_of_string;
	TSTNode left;
	TSTNode equal;
	TSTNode right;
	

	TSTNode(char c)
	{
		data=c;
		end_of_string=false;
		left=null;
		equal=null;
		right=null;
	}


	/*public void print(TSTNode t)
	{
		if(t!=null)
		{
			System.out.println("Data : "+t.data+" "+t.end_of_string);
			print(t.left);
			print(t.equal);
			print(right);
		}
	}*/
}
