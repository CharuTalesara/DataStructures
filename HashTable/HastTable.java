

public class HastTable
{
	int tsize;
	//int count;
	HashTableNode[] table;

	public HastTable(int size)
	{
		tsize=size;
		table=new HashTableNode[size];

		for(int i=0;i<size;i++)
		{
			table[i]=new HashTableNode();
		}
	}

	public void insert(int data)
	{
		int key=data%tsize;
	
		ListNode node=new ListNode(key,data);

		if(table[key].blockCount==0)//startNode==null)
		{
			table[key].startNode=node;
			table[key].blockCount++;
			return;
		}

		ListNode curr=table[key].startNode;
		ListNode next=curr;
		while(curr!=null)
		{
			if(curr.data==data)
			{
				System.out.println("Data already exists");
				return;
			}
			next=curr;
			curr=curr.next;
		}
		next.next=node;
	}

	public int search(int data)
	{
		int key=data%tsize;
		
		HashTableNode node=table[key];
		ListNode currnode=node.startNode;

		if(currnode.data==data)
		{
			System.out.println("Index of Search node : "+key+" Position : 0");
			return 0;
		}
		int count=1;
		while(currnode!=null && currnode.data!=data)
		{
			currnode=currnode.next;
			count++;
		}
		if(currnode==null)
		{
			System.out.println("Data doesnt exists");
			return -1;
		}
		System.out.println("Index : "+key+" Posi : "+count);
		return count;
	}

	

	public void print()
	{
		for(int i=0;i<tsize;i++)
		{
			table[i].print();
		}
	}
	
	
}
