package this_Keyword;

public class Employee 
{
	int empId = 101;
	String empName = "Ravi";
	void display()
	{
		System.out.println("Employee id:"+ this.empId);
		System.out.println("Employee name:" + this.empName);
	}
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.display();
	}
}
