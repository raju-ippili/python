import java.util.*;
class Order
{
	void physical()
	{
		System.out.println("Air,Water,Soil,Metals");
	}
	void bio()
	{
		System.out.println("Plants,Trees");
	}
	void animal()
	{
		System.out.println("Animals,birds");
	}
	void human()
	{
		System.out.println("Humanbiengs");
	}



}
class AnimalOrder extends Order
{
	String animaltype;
	void Atype()
	{
		System.out.println("type of animal:"+animaltype);
	}
	
}
class HumanOrder extends Order
{
	String humantype;
	void Htype()
	{
		System.out.println("type of Human:"+humantype);
	}
}
class Hieraricalinheritance
{
	public static void main(String args[])
	{
		AnimalOrder a=new AnimalOrder();
		HumanOrder b=new HumanOrder();
		a.physical();
		a.bio();
		b.animal();
		b.human();
		Scanner s = new Scanner(System.in);
		System.out.println("enter animal type: " );
		a.animaltype=s.next();
		a.Atype();
		System.out.println("enter Human type: " );
		b.humantype=s.next();
		b.Htype();

	}
}
