

public class Trie
{
	public TrieNode root;

	public Trie()
	{
		root=new TrieNode('a');
	}

	public void insert(String s)
	{
		TrieNode curr=root;

		for(int i=0;i<s.length();i++)
		{
			int index=s.charAt(i)-'a';
			if(curr.children[index]==null)
			{
				curr.children[index]=new TrieNode(s.charAt(i));
			}
			curr=curr.children[index];
		}
		curr.end_of_string=true;
	}

	public boolean search(String s)
	{
		TrieNode curr=root;
		for(int i=0;i<s.length();i++)
		{
			int index=s.charAt(i)-'a';
			if(curr.children[index]==null)
				return false;
			curr=curr.children[index];
		}
		if(curr!=null )//&& curr.end_of_string)
			return true;
		return false;	
	}

	public void print(TrieNode c)
	{
		TrieNode curr=c;
		if(curr!=null)
		{		
			System.out.println(curr.data);
			for(TrieNode t:curr.children)
			{
				this.print(t);
			}
		}
		else
			return;
		
		
	}
}

