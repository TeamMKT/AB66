package package1;
//What happens within the class
public class AssessespecifierforNonstaticmethods 
{
	public  void add()
	  {
		  System.out.println("Method 1");
	  }
	  protected void mul()
	  {
		  System.out.println("Method 2");
	  }
	    void sub()
	  {
		  System.out.println("Method 3");
	  }
	  private  void div()
	  {
		  System.out.println("Method 4");
	  }
	
	public static void main(String[] args) 
	{
		AssessespecifierforNonstaticmethods g1=new AssessespecifierforNonstaticmethods ();
		g1.add();
		g1.mul();
		g1.sub();
		g1.div();

	}

}
