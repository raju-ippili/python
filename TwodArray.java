import java.lang.*;
import java.util.*;
class TwodArray
{
	public static void main(String args[])
	{
		String[][] a=new String[3][3];
		Scanner s=new Scanner(System.in);
		System.out.println("enter array elements:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			a[i][j]=s.next();
		}
		System.out.println("array elements are:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			System.out.print(a[i][j]+" ");
			System.out.println();
		}

		//for(String i:a)
		//{
		//	System.out.println(i);
		//}

	}
}