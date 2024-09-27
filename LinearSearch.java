import java.lang.*;
import java.util.*;
class LinearSearch
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
	for(int i:a)
	{
		if(se==i)
		{
			flage=1;
			break;
		}
	}
	if(flage==1)
	System.out.println("element is prasent");
	else
	System.out.println("element is not prasent");

}
}