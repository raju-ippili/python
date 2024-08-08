import java.lang.*;
class Student
{
    String name;
    int id;
    public static void detiles(Student.s)
    {
        System.out.println(s.name + ":" +s.id);
    }
}
class Demo
{

    public static void main(String[] args) 
    {
        Student s1 = new Student();
        Scanner f1 = new Scanner();
        System.out.println("enter the name:");
        s1.name = f1.next();
        System.out.println("id:");
        s1.id = f1.nextInt();
        Student.detiles(s1);
        Student s2 = new Student();
        Scanner f2 = new Scanner();
        System.out.println("enter the name:");
        s2.name = f2.next();
        System.out.println("id:");
        s2.id = f2.nextInt();
        Student.detiles(s2);

    }
}