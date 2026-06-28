package constructors;

public class Practice3 
{
   void test(String s)
   {
	   System.out.println("A");
   }
   void test(StringBuffer sb)
   {
	   System.out.println("C");
   }
   public static void main(String[] args) 
   {
	   Practice3 a1 = new Practice3();
	   a1.test("Rudra");
	   a1.test("Ramu");
}
}
