package moduel3;
public class CallingProgramThis 
{
	int employeeId; //Instance Variable
	double salary;//Instance Variable
	String name;//Instance Variable
	void employeeDetails(String schoolName,double monthlySalary,int employeeId_IT)//LocL VARIABLES
	{
		//this.globalvariable=localvariable;
		this.employeeId=employeeId_IT;
		this.salary=monthlySalary;
		this.name=schoolName;
	}
	public static void main(String[] args) 
	{
		CallingProgramThis c1=new CallingProgramThis();
		c1.employeeDetails("Ramu",18.5,11);
		System.out.println(c1.employeeId);
		System.out.println(c1.salary);
		System.out.println(c1.name);

	}
}
