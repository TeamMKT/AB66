package package2;

class Manager
{
	void display(double Bonus)
	{
		double bonus=Bonus;
		System.out.println("Bonus:"+bonus);
			
	}
	
}
class employee extends Manager
{
	void display1(double Salary)
	{
		double salary = Salary;
			System.out.println("Salary:"+salary);
}
}

public class Ass extends employee
{
	void display2(double Salary, double hike)
	{
		double salary=Salary;
		double Bonus = (Salary*hike)/100;
		System.out.println("Salary:"+salary);
		System.out.println("Calculated hike:"+Bonus);
	}


	public static void main(String[] args) 
	{
		Ass a1=new Ass();
		a1.display(15);
		a1.display1(152567.56);
		a1.display2(152567.56, 15);
		
	}

}
