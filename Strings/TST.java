

public class TST
{
	public TSTNode root;

	public void insert(String input)
	{
		TSTNode currnode=root;

		for(int i=0;i<input.length();i++)
		{
			insertChar(root,input.charAt(i));
		}

				
		/*while(currnode!=null)
		{
			if(currnode.data==input.charAt(i))
			{
				currnode=currnode.equal;
				i++;
			}	
			else if(currnode.data<input.charAt(i))
				currnode=currnode.left;
			else
				currnode=currnode.right;
		}
		if(i!=input.length())
		{
			for(;i<input.length();i++)
			{
				currnode=new TSTNode(input.charAt(i));
				if(root==null)
					root=currnode;
				currnode=currnode.equal;		
			}
		}*/		
	}

	public TSTNode insertChar(TSTNode node,char c)
	{
		if(node==null)
		{
			node=new TSTNode(c);
			return node;
		}
		if(node.data==c)
			node.equal=insertChar(node.equal,c);
		else if(root.data<c)
			node.left=insertChar(node.left,c);
		else
			node.right=insertChar(node.right,c);
		return node;		
		
	}

	public void print(TSTNode t)
	{
		//TSTNode currnode=root;
		if(t!=null)
		{
			System.out.println(t.data);
			//System.out.println(t.equal.data);
			print(t.left);
			print(t.equal);
			print(t.right);
		}
	}
}
