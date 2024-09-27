import java.lang.*;
import java.util.*;
class StringArray
{
	public static void main(String args[])
	{
		String[] a=new String[5];
		Scanner s=new Scanner(System.in);
		System.out.println("enter array elements:");
		for(int i=0;i<5;i++)
		{
			a[i]=s.next();
		}
		System.out.println("array elements are:");
		for(String i:a)
		{
			System.out.println(i);
		}

	}
}