package practise_Questions;
//Write a program to create a non-static method that prints your student details.
public class Nonstatic_method {

	void studentinfo()
	{
		System.out.println("Geeta");
		System.out.println("MKT");
		System.out.println("selenium");
		
	}
	
	public static void main(String[] args) {
		Nonstatic_method m1=new Nonstatic_method();
		m1.studentinfo();

	}

}
