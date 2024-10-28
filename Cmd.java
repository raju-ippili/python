class Cmd
{
	public static void main(String args[])
	{
		int a,b;
		try
		{
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("don't enter zero");
		}
		catch(NumberFormatException e)
		{
			System.out.println("don't enter string");	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("don't enter more than array index");	
		}

		System.out.println("*************************************************************************");
	}
}