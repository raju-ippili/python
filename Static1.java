import java.lang.*;
import java.util.*;
class St
{
    static int a;
    static void area(int r)
    {
        System.out.println("area of the circle: "+(float)(Math.PI* Math.pow(r, 2)));
    }
}
class Static1
{
    public static void main(String args[])
    {
        St s = new St();
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the radius: ");
        St.a = s1.nextInt();
        St.area(St.a);

    }
}