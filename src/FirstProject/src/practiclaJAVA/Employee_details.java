package practiclaJAVA;

public class Employee_details 
{
	Employee_details()
	{
		System.out.println("Employee details");
	}
	Employee_details(int salary)
	{
		this();
		System.out.println("int salary:"+ salary);
	}
	public static void main(String[] args)
	{
		new Employee_details(25000);
	}
}
