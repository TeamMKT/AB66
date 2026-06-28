package collection;

public class SIBIIB2 
{
  static
  {
	  System.out.println("THis is SIB1");
  }
  {
	  System.out.println("This is IIB1");
  }
  SIBIIB2()
  {
	  System.out.println("THis is constructor");
  }
  public static void main(String[] args)
  {
	System.out.println("This is main method");
	SIBIIB2 s2 = new SIBIIB2();
	new SIBIIB2();
}
}
