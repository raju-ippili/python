import java.lang.*;
class Ns
{
    void display()
    {
        System.out.println("HI.....");
    }
    void show()
    {
        System.out.println("HELLO.....JAVA");
    }
    static void mul(int a,int b,int c)
    {
        System.out.println("multiplication is: "+(a*b*c));
    }
    static int add(int a,int b)
    {
        return a+b;
    }
}
class StaticNonstatic
{
    public static void main(String args[])
    {
        Ns n1 = new Ns();
        //Scanner s1 = new Scanner();
        n1.display();
        n1.show();
        Ns.mul(3,4,9);
        int a = Ns.add(6,10);
        System.out.println("after addition: "+a);
    }
}
