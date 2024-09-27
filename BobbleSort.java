import java.lang.*;
import java.util.*;
class BobbleSort
{
	public static void main(String args[])
	{
	int[] a=new int[5];
	int n=5;
	Scanner s=new Scanner(System.in);
	System.out.println("enter array elements:");
	for(int i=0;i<5;i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=0;i<n-1;i++)
	{
		for(int j=0;j<n-1-i;j++)
		{
			if(a[j]>a[j+1])
			{
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			}
		}
	}
	System.out.println("array after sort elements:");
	for(int i:a)
	{
		System.out.println(i);
	}

}
}