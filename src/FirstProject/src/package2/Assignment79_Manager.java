package package2;
//Write a program with three classes (Person → Employee → Manager) to display details using inheritance.
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
