

public class TrieImplementation
{
	public static void main(String args[])
	{
		Trie t=new Trie();
		t.insert("charu");
		//t.print(t.root);
		t.insert("chtle");
		t.print(t.root);
		System.out.println(t.search("cha"));
	}
}
