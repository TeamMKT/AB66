package this_Keyword;

public class Employee2 
{
  double salary;
   double bonus;
   void setDetails(double salary, double bonus)
   {
	   this.salary= salary;
	   this.bonus=bonus;
   }
   double calculateTotalSalary()
   {
	   return salary+bonus;
   }
   public static void main(String[] args) {
	   Employee2 e2 = new Employee2();
	   e2.setDetails(12345.25, 5625.30);
	   double rv = e2.calculateTotalSalary();
	   System.out.println(rv);
}
}
