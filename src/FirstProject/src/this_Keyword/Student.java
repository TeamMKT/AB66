package this_Keyword;

public class Student 
{
	Student()
	{
		System.out.println("Default Constructor");
	}
	Student(int id)
	{
		this();
		System.out.println("Parametrized Constructor Id:" + id);
	}
	public static void main(String[] args) 
	{
		new Student(10);
	}
	

}
