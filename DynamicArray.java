import java.lang.*;
import java.util.*;
class DynamicArray
{
	public static void main(String args[])
	{
	int[] a=new int[5];
	Scanner s=new Scanner(System.in);
	System.out.println("enter array elements:");
	for(int i=0;i<5;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("array elements are:");
	for(int i:a)
	{
		System.out.println(i);
	}

}
}