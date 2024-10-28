import java.util.*;
class Exception1
{
	public static void main(String args[])
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("enter a");
			a=s.nextInt();
			System.out.println("enter b");
			b=s.nextInt();
			double div=a/b;
			System.out.println("division : "+div);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("you cant divide with zero");
		}
		catch(InputMismatchException e)
		{
			System.out.println("you cant divide with zero");
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("program  is completed");
			s.close();

		}
	}
}