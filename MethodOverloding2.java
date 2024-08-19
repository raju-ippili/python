class Add
{
	int add()
	{
		System.out.println("hellow");
		return 0;
	}
	int add(int x)
	{
		return x;
	}
	int add(int x,int y)
	{
		return (x+y);
	}
	int add(int x,int y,int z)
	{
		return (x+y+z);
	}
	void add(String a,String b)
	{
		String c=a+b;
		System.out.println(c);
	}

}
class MethodOverloding2
{
	public static void main(String args[])
	{
		Add s = new Add();
		s.add("Ippili","Raju");
		int c=s.add();
		int b=s.add(55);
		int a=s.add(89,45);
		int d=s.add(2,9,3);
		System.out.println(a+":"+b+":"+c+":"+d);
	}

}
//output:133:55:0:14