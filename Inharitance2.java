class GrandFather
{
	
	void land()
	{
		System.out.println("2acres");
	}
}
class Father extends GrandFather
{
	void car()
	{
	System.out.println("car");
	}

}
class Child extends Father
{
	void scooty()
	{
		System.out.println("Scooty");
	}
}
class Inharitance2
{
	public static void main(String args[])
	{
		Child c = new Child();
		c.land();
		c.car();
		c.scooty();		
	}
}
/*output:2acres
car
Scooty*/