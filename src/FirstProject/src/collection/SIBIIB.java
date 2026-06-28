package collection;

public class SIBIIB 
{
   static   //static initalization block(SIB)
   {
	   System.out.println("This is SIB");
   }
   SIBIIB()
   {
	   System.out.println("This is Constructor");
   }
   {
	   System.out.println("This is IIB");  // IIB-Instance initialization block
   }
   
   public static void main(String[] args) 
   {
	System.out.println("THis is main method");
	
	new SIBIIB ();
}
}
