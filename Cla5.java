//Write a java program to read integer value n and perform factorial.
import java.lang.*;
import java.util.*;
class Cla5
{
	public static void main(String args[])
	{
		int n,fact=1;
		for(int i=0;i<args.length;i++)
		{
			n = Integer.parseInt(args[i]);
			for(int j=n;j>=1;j--)
			{
				fact*=j;
				
			}
			System.out.println(fact);
			fact=1;

		}
	
		
	}
}
//input:java Cla5 5 6 7
//output:120 720 5040
