package checked_UncheckedExceptions;

public class Program1 
{
   public static void main(String[] args) 
   {
	   try {
		   int i =1/0;
	   }
	   /*catch(java.lang.ArithmeticException ae)
	   {
		   System.out.println("Exception handeled");
		   throw(ae);
	   }*/
	   finally
	   {
		   System.out.println("This is finally block");
	   }
	 
	 
}
}
