package package1;
//"Write a program to create a Non-Static Method and call it inside main method"?
public class Assignment12 {

	void display()
	{
		System.out.println("Non static method");
	}
	
	public static void main(String[] args) 
	{
		Assignment12 m1=new Assignment12();
		m1.display();
		

	}

}
