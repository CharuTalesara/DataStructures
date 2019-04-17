import java.util.Scanner;





public class  OrderedLinearSearch
{
	public static void main(String args[])
	{
		int[] a={3,2,6,4,9,7,1,5,8};

		printArray(a);

		CountingSort cs=new CountingSort();

		a=cs.sort(a,a.length);

		printArray(a);

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number u wanna search");
		int key=sc.nextInt();
		
		System.out.println("Index of Key in array : "+search(a,key));
		
	}

	public static int search(int[] a,int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
				return i;
			else if(a[i]>key)
				return -1;
		}
		return -1;
	}

	public static void printArray(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
