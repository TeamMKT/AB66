package methodoverridding;
class Manager
{
	void salary()
	{
		double Salary = 25000;
		System.out.println("Base salary:"+Salary);
	}
}
public class Employee extends Manager
{
    void salary()
    {
    	double salary=25000;
    	System.out.println("Base salary:"+salary);
    	double hike = 0.15;
    	double Bonus=salary*hike;
    	System.out.println("Bonus Calculation:" + Bonus);	
    }
 public static void main(String[] args) 
 {
	 Manager m =new Employee();
	 m.salary();
}
}
