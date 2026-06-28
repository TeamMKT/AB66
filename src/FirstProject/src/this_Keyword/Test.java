package this_Keyword;

public class Test 
{
   void display(Test t)
   {
	   System.out.println("Method called");
   }
   void show()
   {
	   this.display(this);
	   System.out.println("Show the object");
   }
   public static void main(String[] args) 
   {
	   Test t = new Test();
	   t.show();
}
   
}
