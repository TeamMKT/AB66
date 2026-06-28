package package2;
//Write a program with overloaded constructors:Constructor with name; Constructor with name and marks; Print the student details.
public class ConstructorOverloadingwithStudentDetails {
	ConstructorOverloadingwithStudentDetails(String name)
	{
		String Name=name;
		System.out.println(Name);
	}
	ConstructorOverloadingwithStudentDetails(String name, int marks)
	{
		String Name=name;
		int marks1= marks;
		
		System.out.println(Name);
		System.out.println( marks1);
	
	}
    public static void main(String[] args) {
		
    	new ConstructorOverloadingwithStudentDetails("Ravi");
		
		new ConstructorOverloadingwithStudentDetails("Rudra",50);
		
		
    	
	}
}
