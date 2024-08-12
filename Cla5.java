//Write a java program to read integer value n and perform factorial.
import java.lang.*;
import java.util.*;
class Cla5
{
	public static void main(String args[])
	{ 
			long n;
		
			n = Long.parseLong(args[0]);
			Factorial f1 = new Factorial();
			long g = f1.fact(n);
			System.out.println(g);


	}
}
class Factorial
{
	long fact(long n)
	{
		int k = (int)(n);
		long fact=1;
		for(int j=k;j>=1;j--)
			{
				fact*=(long)(j);
				
			}
			return fact;
	}
}
//input:java Cla5 5
//output:120
