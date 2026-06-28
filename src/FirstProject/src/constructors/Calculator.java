package constructors;

public class Calculator 
{
   static void add(int a, int b)
   {
	   int c =a+b;
	   System.out.println(c);
   }
   static void add(int a, int b, int c)
   {
	   int d =a+b+c;
	   System.out.println(d);
   }
   static void add(double a, double b)
   {
	   double c =a+b;
	   System.out.println(c);
   }
   
   public static void main(String[] args)
   {
	  add(10,20);
	  add(15,12,25);
	  add(1.25,2.25);
}
   
}
