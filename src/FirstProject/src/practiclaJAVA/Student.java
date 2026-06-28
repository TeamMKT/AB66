package practiclaJAVA;

public class Student
{
	int rollNo;
	String name;
	int marks;
	Student(int rollNo, String name, int marks)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	void displayDetails()
	{
		System.out.println("Student rollno:" + rollNo);
		System.out.println("Student name:" + name);
		System.out.println("Student marks:" + marks);
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student(123,"Rudra",95);
		s1.displayDetails();
		Student s2 = new Student(124,"Ravi",65);
		s2.displayDetails();
	}
}
