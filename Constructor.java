import java.lang.*;
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
class Constructor
{
	public static void main(String args[])
	{
		Human h ;
		h=new Human();
		h=new Human("karthik","sai",77);
		

	}
}
/*output:ramgopal:kar:9866
karthik:sai:77*/