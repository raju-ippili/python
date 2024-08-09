import java.lang.*;
class Staticm
{
    static String name = "laxmi";
    void display()
    {
        System.out.println(name);
    }
}
class Staticmaincall
{
    public static void main(String args[])
    {
        Staticm a1 = new Staticm();
        a1.display();

    }
}

