import java.lang.*;
import java.util.*;
class Java
{
	void display()
	{
		System.out.println("i am the base of java");
	}
} 
class Jdk extends Java
{
	String version;
	void display1()
	{
		System.out.println("i am the development kit of java"+version);
	}

}
class JRE extends Java
{
	String version;
	void display2()
	{
		System.out.println("i am the runtime environment of java"+version);
	}

}
class JVM extends JRE
{ 
	String version;
	void display3()
	{
		System.out.println("i am the virtual mechine of java"+version);
	}

} 
class Hybridinharitance
{
	public static void main(String args[])
	{
		JVM j1=new JVM();
		Jdk j2=new Jdk();
		Scanner s=new Scanner(System.in);
		j1.version="jdk215675";
		j1.display();
		j1.display3();
		j1.display2();
		j2.version="jdk908";
		j2.display();
		j2.display1();

	}
}                                                                                     