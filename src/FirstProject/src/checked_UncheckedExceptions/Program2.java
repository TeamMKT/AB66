package checked_UncheckedExceptions;

public class Program2
{
public static void main(String[] args) 
{
	String s= null;
	try {
	System.out.println(s.length());
	}
	catch(NullPointerException ne)
	{
		System.out.println(ne.toString());//this gives the exception name
		//throw ne;
		//here, using throw keyword, give new exception that is also an existed exception in the program. and it stops the program
		//it sends the exception to Java. Java terminates the program. This is throw keyword.
	}
	
	finally
	{
		System.out.println("This is finally Block");
	}
}
}
