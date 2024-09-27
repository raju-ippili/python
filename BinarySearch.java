import java.lang.*;
import java.util.*;
class BinarySearch
{
	public static void main(String args[])
	{
	int[] a=new int[5];
	int flage=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter searching element:");
	int se=s.nextInt();
	System.out.println("enter array elements:");
	for(int i=0;i<5;i++)
	{
		a[i]=s.nextInt();
	}
	Arrays.sort(a);
	int b=Arrays.binarySearch(a,se);
	if(b>0)
	System.out.println("element is prasent");
	else
	System.out.println("element is not prasent");

}
}