import java.lang.*;
import java.util.*;
class WrongPinException extends Exception
{
	
}
class Atm
{
	public static void main(String args[])throws Exception
	{
		String pin;
		Scanner s=new Scanner(System.in);
		System.out.println("enter your pin");
		pin=s.next();
	try
	{
		if(pin.length()!=4)
		{
			throw new WrongPinException();
		}
		else
		{
			System.out.println("Proceed...........");
		}
	}
	catch(WrongPinException e)
	{
		System.out.println("check your pin");
	}
	finally
	{
		System.out.println("Transection is completed");

	}
	}
}