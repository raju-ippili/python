//method overloding
class Display
{
	void display()
	{
		System.out.println("HI...........");
	}
	void display(int x)
	{
		System.out.println("int="+x);
	}
	void display(int x,int y)
	{
		System.out.println(x+y);
	}
	void display(double x)
	{
		System.out.println("double x"+x);
	}
	void display(String x)
	{
		System.out.println("string="+x);
	}
	int display()
	{
		System.out.println("hellow");
		return 0;
	}
	int display(int x)
	{
		return x;
	}
	int display(int x,int y)
	{
		return (x+y);
	}
	int display(int x,int y,int z)
	{
		return (x+y+z);
	}

}
class MathodOverloding
{
	public static void main(String args[])
	{
		Display s = new Display();
		s.display();
		s.display(4);
		s.display(5,9);
		s.display(9.0);
		s.display("rayan");
		int c=s.display();
		int b=s.display(55);
		int a=s.display(89,45);
		int d=s.display(2,9,3);
		System.out.println(a+":"+b+":"+c+":"+d);

		

	}
}
/*output:MethodOverloding.java:23: error: method display() is already defined in class Display
        int display()
            ^
MethodOverloding.java:28: error: method display(int) is already defined in class Display
        int display(int x)
            ^
MethodOverloding.java:32: error: method display(int,int) is already defined in class Display
        int display(int x,int y)
            ^
MethodOverloding.java:52: error: incompatible types: void cannot be converted to int
                int c=s.display();
                               ^
MethodOverloding.java:53: error: incompatible types: void cannot be converted to int
                int b=s.display(55);
                               ^
MethodOverloding.java:54: error: incompatible types: void cannot be converted to int
                int a=s.display(89,45);*/