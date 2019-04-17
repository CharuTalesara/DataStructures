import java.util.Scanner;



public class UnorderedLinearSearch
{
	public static void main(String args[])
	{
		int[] a={3,2,6,4,9,7,1,5,8};

		printArray(a);

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number u wanna search");
		int key=sc.nextInt();
		
		System.out.println("Key in array : "+search(a,key));
		
	}

	public static boolean search(int[] a,int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
				return true;
		}
		return false;
	}

	public static void printArray(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
