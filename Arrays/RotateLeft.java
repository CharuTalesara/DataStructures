package arrays;

public class RotateLeft {

	public static void main(String[] args) 
	{
		int[] a={1,2,3,4,5};
		rotLeft(a,4);
	}

	static int[] rotLeft(int[] a, int d) 
	{
		int[] re=new int[d];
		for(int i=0;i<d;i++) re[i]=a[i];
		
		for(int i=d;i<a.length;i++)
			a[i-d]=a[i];
		
		for(int i=0;i<re.length;i++)
			a[a.length-i-1]=re[re.length-1-i];
	
		return a;
    }
}
