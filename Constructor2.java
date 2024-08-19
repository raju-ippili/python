import java.lang.*;
import java.util.*;
class Human
{
	String name;
	String surname;
	int mob;
	public Human()
	{
		name="ramgopal";
		surname="kar";
		mob=9866;
		System.out.println(name+":"+surname+":"+mob);
	}
	public Human(String a,String b,int c)
	{
		name=a;
		surname=b;
		mob=c;
		System.out.println(name+":"+surname+":"+mob);
	}


}
class Constructor2
{
	public static void main(String args[])
	{
		Human h ;
		h=new Human();
		h=new Human("karthik","sai",77);
		Scanner s = new Scanner(System.in);
		String a=s.next();
		String b=s.next();
		int c=s.nextInt();
		h=new Human(a,b,c);
		

		

	}
}
