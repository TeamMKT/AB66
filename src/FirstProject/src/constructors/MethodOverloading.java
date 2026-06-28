package constructors;
public class MethodOverloading 
{
   void add(int a, int b)
   {
	   int c= a+b;
	   System.out.println("Add of two integers is:"+ c);
   }
   static void add(double a, double b)
   {
	   double c =a+b;
	   System.out.println("Add of two double a & b is:"+ c);
   }
   public static void main(String[] args) 
   {
	   MethodOverloading a1 = new MethodOverloading();
	   a1.add(12, 13);
	   add(1.25,2.25);
	 
}
}
