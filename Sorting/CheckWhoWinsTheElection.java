
/*
Given an array a[0..n-1] where each element of the array represents a vote in the election.
Assume that each vote is given as an integer representing the id of the choosen voter.
Give an algorithm for determining who wins the election.


*/




public class CheckWhoWinsTheElection
{
	public static void main(String args[])
	{
		int[] a={2,4,1,3,4,4,2,1,1,1,1,1,3,4,2,2,4,3,2,1,4,3,2,1,1,2,4,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4};
		winner(a);
	}


	//O(nlogn)
	// Can be improved by uing counting sort O(n)
	
	public static int winner(int[] a)
	{
		QuickSortAlgo q=new QuickSortAlgo();
		q.quickSort(a,0,a.length-1);
		print(a);

		int max_i=a[0];
		int count_i=0;
		int prev_maxi=max_i;
		int prev_count=count_i;

		for(int i=0;i<a.length;i++)
		{
			if(max_i!=a[i])
			{
				if(count_i>prev_count)
				{
					prev_maxi=max_i;
					prev_count=count_i;
				}

				max_i=a[i];

				count_i=1;
			}

			else
			{
				count_i++;
			}
		}

		if(count_i>prev_count)
		{
			prev_maxi=max_i;
			prev_count=count_i;

		}
			

		System.out.println("Winner "+prev_maxi+" votes : "+prev_count);
		
		return prev_maxi;
		
	}

	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();		
	}
}
