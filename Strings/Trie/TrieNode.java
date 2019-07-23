


public class TrieNode
{
	char data;
	boolean end_of_string;
	TrieNode[] children = new TrieNode[26]; 

	public TrieNode(char c)
	{
		this.data=c;
		end_of_string=false;

		for(int i=0;i<26;i++)
			children[i]=null;
		
	}

	public TrieNode()
	{
		end_of_string=false;

		for(int i=0;i<26;i++)
			children[i]=null;
		
	}

	public TrieNode isInChildNode(char c)
	{
		if(children!=null)
		{
			for(TrieNode eachChild:children)
			{
				if(eachChild.data==c)
					return eachChild;
			}
		}
		return null;
	}

	public void print()
	{
		System.out.println(this.data);

		for(int i=0;i<26;i++)
		{
			if(children[i]!=null)
				System.out.println(children[i].data);
		}
	}
}
