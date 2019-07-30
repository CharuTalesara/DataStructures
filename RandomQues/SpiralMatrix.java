/*
 *  Printing a matrix in sprial format
 *  
 *  1  2  3  4 
 *  5  6  7  8
 *  9 10 11 12 
 *  
 *  1 2 3 4 8 12 11 10 9 5 6 7
 *  
 *  1   2   3   4  5   6
    7   8   9  10  11  12
    13  14  15 16  17  18
    
    1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11
    
    1  2  3  4  5
    6  7  8  9  10
    11 12 13 14 15
    16 17 18 19 20
    21 22 23 24 25
    
    
    1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13
 */



public class SpiralMatrix 
{
	public static void main(String args[])
	{
		int[][] a= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
		print(a);
		printSpiral(a);
		System.out.println();
		
		int[][] b= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};//,{13,14,15,16},{17,18,19,20}};
		
		print(b);
		printSpiral(b);
		
		int[][] c= {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18}};//{16,17,18,19,20},{21,22,23,24,25}};
		print(c);
		printSpiral(c);
		
	}
	
	public static void printSpiral(int[][] a)
	{
		
		int count=0;
		int colLength=a[0].length;
		int rowLength=a.length;
		int eleCount=colLength*rowLength;
		
		System.out.println(colLength+" "+rowLength);
		
		while(count<=a.length/2)
		{
			int i=count;
			for(int j=0+count;j<colLength-count;j++)
			{
				System.out.print(a[i][j]+" ");
				eleCount--;
			}
			
			if(eleCount==0)
				break;
			
			int j=colLength-1-count;
			for(int k=count+1;k<rowLength-count-1;k++)
			{
				System.out.print(a[k][j]+" ");
				eleCount--;
			}
			
			if(eleCount==0)
				break;
				
			i=a.length-1-count;
			for(int k=colLength-1-count;k>=count;k--)
			{
				System.out.print(a[i][k]+" ");
				eleCount--;
			}
			
			if(eleCount==0)
				break;
				
			j=count;
			for(i=rowLength-2-count;i>=1+count;i--)
			{
				System.out.print(a[i][j]+" ");
				eleCount--;
			}
				
			if(eleCount==0)
				break;
			
			count++;
		}
	}
	
	public static void print(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}


