import java.lang.*;
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
	void type()
	{
		System.out.println("type of animal:"+animaltype);
	}
	
}
class Animal extends AnimalOrder
{
	String animalname;
	String birdname;
	void names()
	{
		System.out.println("name of te bird:"+birdname+":"+"name of the animal:"+animalname);
	}

}
class Multilevelinheritance
{
	public static void main(String args[])
	{
		Animal a=new Animal();
		a.physical();
		a.bio();
		a.animal();
		a.human();
		Scanner s = new Scanner(System.in);
		System.out.println("enter animal type: " );
		a.animaltype=s.next();
		a.type();
		System.out.println("enter animal name: " );
		a.animalname=s.next();
		System.out.println("enter bird name: " );
		a.birdname=s.next();
		a.names();

	}
}
