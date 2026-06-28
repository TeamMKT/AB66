package checked_UncheckedExceptions;
// most important itnerview questions infinity
public class Try_catch2 
{
  public static void main(String[] args) 
  {
	  try {
	 int c = 1/0;//1 and 0 are coming from parent and grand parent class
	 System.out.println(c);
	  }
	  catch(ArithmeticException a1)
	  {
		  System.out.println("Exception handled");
	  }
}
}
