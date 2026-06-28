package package2;
//Write a program using multi-level inheritance to calculate salary (Employee → Salary → Bonus).
class Bonus
{
	static void display(double Bonus)
	{
		double bonus=Bonus;
		System.out.println("Bonus:"+bonus);
	}
}
class Salary extends Bonus
{
	void dispaly1(double Salary)
	{
		double salary=Salary;
		System.out.println("Salary:" + salary);
	}
}
public class Assignment80_emplyoee extends Salary
{
   void display2(double Salary,double Bonus)
   {
	   double salary = Salary;
	   double bonus = (salary*Bonus)/100;
	   System.out.println("Salary:"+salary);
	   System.out.println("Caluculated Bonus:"+bonus);   
   }
   
	public static void main(String[] args) 
	{
		display(10);
        Assignment80_emplyoee e1 = new Assignment80_emplyoee();
		e1.dispaly1(100000);
		e1.display2(100000, 10);
	}

}
