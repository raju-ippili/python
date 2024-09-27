import java.lang.*;
class Employee
{
	int id;
	String name;
	void display()
	{
		System.out.println("Employee id: "+id+"Employee name: "+name);
	}
}
class Faculty extends Employee
{
	String designation;
	String specialization;
	void expertise()
	{
		System.out.println("Designation: "+ designation + "specialization :"+ specialization);
	}
}
class Inharitance9
{
	public static void main(String args[])
	{
		
		Employee E=new Employee();
		Faculty F=new Faculty();
		E.id=89;
		E.name="manojee";
		E.display();
		//F.id=99;
		//F.name="Rajivee";
		F.designation="Student";
		F.specialization="CSE";
		F.display();
		F.expertise();

	}
}