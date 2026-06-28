package package1;

public class NonstaticProgram 
{
   void add() //non static method
   {
	   System.out.println("Non static method");
   }
	public static void main(String[] args) //main method
	{
		System.out.println("Main method");
	
		NonstaticProgram n1=new NonstaticProgram(); //this way we can create an object
		n1.add(); //calling non static mehtod inside any static methos
		
		//you need to create an object
		//syntax: ClassName referrancevariable=new ClassName();
		//referrancevaraible.nonstaticmathod();
	}

}

