package arrays;

public class ReverseArray {

	public static void main(String[] args)
	{
		//TODO Auto-generated method stu	
		int[] a={1,3,4,2};
		a=reverseArray(a);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	
	 static int[] reverseArray(int[] a)
	 {
		 	for(int i=0;i<a.length/2;i++)
		 	{
		 		int temp=a[i];
		 		a[i]=a[a.length-i-1];
		 		a[a.length-i-1]=temp;
		 	}
		 	
		 	return a;

	 }


}
