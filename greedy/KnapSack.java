package greedyalgorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KnapSack {

	public static void main(String[] args) 
	{
		int[] w= {10,20,30};//weights
		int[] p= {60,100,120};//price --sorted

		int knapsack=50;
		System.out.println(fractionalKnapsack(50,w,p));
	}
	
	public static int fractionalKnapsack(int ksize,int[] w,int[] p)
	{
		int n=w.length;
		
		PriorityQueue<Element> pqrate=new PriorityQueue<Element>();
		for(int i=0;i<n;i++)
		{
			int rate=p[i]/w[i];
			Element e=new Element(rate, w[i]);
			pqrate.add(e);
		}
		
		System.out.println(pqrate);
		
		int knapsack_capacity=ksize;
		int loot=0;
		
		while(knapsack_capacity>0 && !pqrate.isEmpty())
		{
			Element e=pqrate.remove();
			
			if(e.weight<knapsack_capacity)
			{
				knapsack_capacity=knapsack_capacity-e.weight;
				loot=loot+e.rate*e.weight;
			}	
			else
			{
				
				loot=loot+e.rate*knapsack_capacity;
				knapsack_capacity=0;
			}		
		}
		
		return loot;
	}

}

class Element implements Comparable<Element>
{
	int rate;
	int weight;
	
	Element(int rate,int w)
	{
		this.rate=rate;
		this.weight=w;
	}

	@Override
	public int compareTo(Element o) {
		if(this.rate>o.rate)
			return -1;
		if(this.rate<o.rate)
			return 1;
		return 0;
	}

	public String toString()
	{
		return this.rate+" "+this.weight;
	}
}
