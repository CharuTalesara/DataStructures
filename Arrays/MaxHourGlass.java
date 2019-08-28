package arrays;

public class MaxHourGlass {

	public static void main(String[] args) 
	{
		int[][] arr= {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};
		System.out.println(hourglassSum(arr));
	}

	static int hourglassSum(int[][] arr)
	{
		int[] hg=new int[16];
		int count=0;
		
		for(int i=0;i<arr.length-2;i++)
		{
			int j=0;
			int hgsum=0;
			
			while(j<arr.length-2)
			{
				hgsum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				j++;
				hg[count]=hgsum;
				count++;
			}
		}
		
		for(int i=0;i<16;i++)
			System.out.print(hg[i]+" ");
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<16;i++)
		{
			if(hg[i]>max)
				max=hg[i];
		}
		
		return max;
	}
}
