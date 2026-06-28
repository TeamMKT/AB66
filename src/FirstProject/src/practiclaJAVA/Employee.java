package practiclaJAVA;

public class Employee 
{
   int id;
  String name;
  double salary;
  
  void setDetails(int id, String name, double salary)
  {
	  this.id=id;
	  this.name = name;
	  this.salary = salary;
  }
  void displayDetails()
  {
	  System.out.println("Employee id:" +  id);
	  System.out.println("Employee name:" +  name);
	  System.out.println("Employee salary:" +  salary);
  }
  public static void main(String[] args)
  {
	  Employee e1 = new Employee();
	  e1.setDetails(123, "Geeta", 175000);
	  e1.displayDetails();
			  
	  
}
  
   
}
