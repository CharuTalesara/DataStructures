

public class HashTableNode
{
	 ListNode startNode;
	 int blockCount;
	
	public HashTableNode()
	{
		startNode=null;
		blockCount=0;
	}

	public ListNode getStartNode()
	{
		return this.startNode;
	}

	public int getBlockCount()
	{
		return this.blockCount;
	}

	public void setStartNode(ListNode node)
	{
		this.startNode=node;
	}

	public void setBlockCount(int bc)
	{
		this.blockCount=bc;
	}

	public void print()
	{
		ListNode node=startNode;

		while(node!=null)
		{
			System.out.print("Node Key : "+node.getKey()+" Node Data : "+node.getData());
			System.out.println();
			node=node.next;
		}
		System.out.println("***************************");
	}
}
