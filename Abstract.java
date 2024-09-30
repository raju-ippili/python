import java.lang.*;
import java.util.*;
abstract class Human
{
	String name;
	abstract void type();
}
class Men extends Human
{
	void type()
	{
		System.out.println("i am men:"+name);
	}
}
class Women extends Human
{
	void type()
	{
		System.out.println("i am  women:"+name);
	}
}
class Abstract
{
	public static void main(String args[])
	{
		Men m=new Men();
		Women w=new Women();
		Scanner s=new Scanner(System.in);
		m.name="manoj";
		w.name="padma";
		m.type();
		w.type();
	}
}