package package2;
//Write a program with three classes (Person → Employee → Manager) to display details using inheritance.
public class Assignment79_person extends Assignment_employee 
{
	static void display(String Name, int age)
	{
		String name=Name;
		int Age=age;
		System.out.println(name);
		System.out.println(Age);
	}

	public static void main(String[] args) 
	{
		display("Geeta",40);
		display1(123456.78);
		display2(123456.78,15);
		

	}

}
/*package package2;

public class Assignment79_Manager 
{
  static void display2(double salary, double hike)
  {
	  double Salary=salary;
	  double bonus=(salary*hike)/100;
	  System.out.println("salary:"+Salary);
	  System.out.println("Calculated Bonus:"+ bonus);
  }
}
package package2;

public class Assignment_employee extends Assignment79_Manager 
{
   static void display1(Double salary)
   {
	   Double Salary=salary;
	   System.out.println("salary:"+Salary);
	   
   }
}*/


