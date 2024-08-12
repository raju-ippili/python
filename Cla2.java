/*.From the above program try to access args [2] and observe what type of
 logical error is generated */
import java.lang.*;
import java.util.*;
class Cla2
{
	public static void main(String args[])
	{
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);

		

		

	}
}
//output
//error 1:Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
//error 2:Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
//error 3:Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
