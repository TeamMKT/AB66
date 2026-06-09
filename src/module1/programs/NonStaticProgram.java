package module1.programs;
public class NonStaticProgram 
{
	void add()  //non sttaic method
	{
		System.out.println("Non Static Method");
	}
	public static void main(String[] args) //main method
	{
		System.out.println("Main Method");
		
		NonStaticProgram n1=new NonStaticProgram();//local variable
		//this way we can create an Object
		n1.add();//calling non static method inside any static method
		n1.add();
		
		//you need to create an Object
		//syntax: ClassName refrancevariable=new ClassName();
		//refrancevariable.nonstaticmethod();
	}
}
