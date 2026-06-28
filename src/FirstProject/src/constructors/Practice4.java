package constructors;

public class Practice4 
{
   void test(int a)
   {
	   System.out.println("A");
   }
   void test(Integer a)
   {
	  System.out.println("B"); 
   }
   void test(long a)
   {
	  System.out.println("c"); 
   }
   public static void main(String[] args) 
   {
	   Practice4 a1 = new Practice4();
	   //a1.test(10);
	   a1.test(null);
}
}
