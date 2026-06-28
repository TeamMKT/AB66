package constructors;

public class Employee
{
	Employee()
	{
		System.out.println("Default Constructor");
	}
	Employee(int id)
	{
		System.out.println("ID:" + id);
	}
	Employee(int id, String name)
	{
		/*int ID = id;
		String Name = name;*/
		System.out.println("Id is:" + id + " & Name is :"+ name);
	}
	public static void main(String[] args) 
	{
		new Employee();
		new Employee(18);
		new Employee(18,"Rudra");
	}
}
