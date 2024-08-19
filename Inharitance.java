class Parent
{
	void house()
	{
		System.out.println("HOUSE");
	}
	void land()
	{
		System.out.println("2acres");
	}
}
class Child extends Parent
{
	void car()
	{
	System.out.println("car");
	}
	void flat()
	{
		System.out.println("flat");
	}
}
class Inharitance
{
	public static void main(String args[])
	{
		Child c = new Child();
		c.house();
		c.land();
		c.car();
		c.flat();		
	}
}
/*output:2acres
car
Scooty*/