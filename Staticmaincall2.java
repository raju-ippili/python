import java.lang.*;
class Staticm
{
    static String name = "laxmi";
    int a=100;
    void display()
    {
        System.out.println(name +":"+a);
    }
}
class Staticmaincall2
{
    public static void main(String args[])
    {
        Staticm a1 = new Staticm();
        a1.display();

    }
}

