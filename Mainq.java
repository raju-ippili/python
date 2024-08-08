class Human
{
    private String name;
    private int age;
    public Human(String a,int n){
        name = a;
        age = n;

    }
    public Human(){
        name = "ayyan";
        age = 45;
    }
    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
    

}
class mainq
{
    public static void main(String args[])
    {
        Human h1 = new Human("mahi",23);
        Human h2 = new Human();
        
         System.out.println(h1.getname()+ ":" + h1.getage());
         System.out.println(h2.getname()+ ":" + h2.getage());

    }
}
