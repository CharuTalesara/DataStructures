/*
Efficient Implementation of K stacks in a single array
*/

public class KStacks
{
	public static void main(String args[])
	{
		MulitStacks ms=new MulitStacks(9,3);
		ms.push(0,1);
		ms.push(0,2);
		ms.push(1,3);
		ms.push(2,4);
		ms.push(2,5);
		ms.push(0,6);
		ms.printStackArray();

		System.out.println(ms.pop(0));
		ms.printStackArray();
		ms.push(0,9);
		ms.printStackArray();
		ms.push(1,10);
		ms.push(2,12);
		ms.push(2,14);
		ms.printStackArray();


	}
}


class MulitStacks
{
	int[] topOfStacks;
	int[] stackData;
	int[] nextIndex;
	int nextAvailable;
	
	public MulitStacks(int n,int k)
	{
		topOfStacks=new int[k];
		stackData=new int[n];
		nextIndex = new int[n];
		nextAvailable=0;
		initializeTops();
		initializeNexts();
	}
		
	private void  initializeTops()
	{
		for(int i=0;i<topOfStacks.length;i++)
			topOfStacks[i]=-1;
	}

	private void  initializeNexts()
	{
		for(int i=0;i<nextIndex.length-1;i++)
			nextIndex[i]=i+1;
		nextIndex[nextIndex.length-1]=-1;
	}

	public void push(int stack,int item)
	{
		stackData[nextAvailable]=item;
		int na=nextIndex[nextAvailable];
		nextIndex[nextAvailable]=topOfStacks[stack];
		topOfStacks[stack]=nextAvailable;
		nextAvailable=na;
	}

	public int pop(int stack)
	{
		if(topOfStacks[stack]==-1)
		{
			throw new IndexOutOfBoundsException();
		}

		int retIndex=topOfStacks[stack];
		int retValue=stackData[retIndex];
		topOfStacks[stack]=nextIndex[topOfStacks[stack]];
		nextIndex[retIndex]=nextAvailable;
		nextAvailable=retIndex;
		return retValue;
	}

	public void printStackArray()
	{
		System.out.println("***********************");
	
		System.out.println("----Stack Array---- ");
		for(int i=0;i<stackData.length;i++)
			System.out.print(stackData[i]+" ");
		System.out.println();
		
		System.out.println("----Top Of Stacks----");
		for(int i=0;i<topOfStacks.length;i++)
			System.out.println("Stack "+i+" "+topOfStacks[i]+" ");
	}
}
