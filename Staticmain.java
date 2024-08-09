import java.lang.*;
import java.util.*;
class Staticm
{
    static int a;
    void add(int x)
    {
        int k = x+x;
        System.out.println("sum : " + k);
    }
}
class Staticmain
{
    public static void main(String args[])
    {
        Staticm a1 = new Staticm();
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the number: ");
        a1.a=s1.nextInt();
        a1.add(a1.a);

    }
}

