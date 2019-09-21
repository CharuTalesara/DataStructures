package arrays;

/*
 * The cost of a stock on each day is given in an array, find the max profit that
 *  you can make by buying and selling in those days. For example, if the given array is 
 *  {100, 180, 260, 310, 40, 535, 695}, the maximum profit can earned by buying on day 0, 
 *  selling on day 3. Again buy on day 4 and sell on day 6. If the given array
 *  of prices is sorted in decreasing order, then profit cannot be earned at all.
 */

public class StockBuynSell {

	public static void main(String[] args) 
	{
		int a[]= {100, 180, 260, 310, 40, 535, 695};
		maxProfitmulti(a);
	}
	
	//ig buy and sell is allowed multiple times
	
	public static void maxProfit(int[] a)
	{
		int startday=-1;
		int endday=-1;
		int max=-1000;
		
		for(int i=0;i<a.length-1;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]-a[i]>max)
				{
					startday=i;
					endday=j;
					max=a[j]-a[i];
				}
			}
		}
		
		System.out.println("Start day : "+startday);
		System.out.println("End day : "+endday);
		System.out.println("Profit : "+max);
	}
	
	// if buy and sell is allowed a single time
	public static void maxProfitmulti(int[] a)
	{
		int startday=-1;
		int endday=-1;
		int max=-1000;
		
		for(int i=0;i<a.length-1;i++)
		{
			//int j=i+1;
			while(a[i]>a[i+1])
			{
				i++;
			}
			startday=i;
			endday=startday+1;
			while(i<a.length-1 && a[i+1]>a[i])
				i++;
			endday=i;
			System.out.print("Start Day : "+startday+" End Day : "+endday);
			System.out.println();
			
			//System.out.println("Profit : "+a[]-a[]);
		}
		
		
	}

}
