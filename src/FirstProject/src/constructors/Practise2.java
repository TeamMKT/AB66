package constructors;

public class Practise2 
{
   static 
   {
	   System.out.println("Static Block");
   }
   {
	   System.out.println("Non Static block");
   }
   Practise2()
   {
	   System.out.println("Constructor");
   }
   public static void main(String[] args) 
   {
	    new Practise2 ();
	   
}
   
}
