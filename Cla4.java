//Write a java program to read two integer values and perform addition.
import java.lang.*;
import java.util.*;
class Cla4
{
	public static void main(String args[])
	{
		int sum =0;
		for(int i=0;i<args.length;i++)
		{
			sum+= Integer.parseInt(args[i]);
		}
		System.out.println(sum);
	}
}
//error:Exception in thread "main" java.lang.NumberFormatException: For input string: "maa"
//input:java Cla4 20 39 17
//output:76