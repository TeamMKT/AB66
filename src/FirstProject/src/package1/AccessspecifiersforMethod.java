package package1;
//What happens within the class
public class AccessspecifiersforMethod
{
  public static void add()
  {
	  System.out.println("Method 1");
  }
  protected static void mul()
  {
	  System.out.println("Method 2");
  }
   static void sub()
  {
	  System.out.println("Method 3");
  }
  private static void div()
  {
	  System.out.println("Method 4");
  }
	public static void main(String[] args) 
	{
		add();
		mul();
		sub();
		div();

	}

}
