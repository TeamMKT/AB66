package package2;
/*WAP to create relation between 2 classes having non-static methods using extends keyword. Single Level Inheritance from 
2 different package*/
import package1.ParentClass;

public class Assignment74childclass extends ParentClass

{

	void dispay()
	{
		System.out.println("The non static method for child class");
	}
	
	public static void main(String[] args) 
	{
		Assignment74childclass a1=new Assignment74childclass();
		a1.dispay();
		a1.display2();
	}

}
/*package package1;

public class ParentClass
{
  public static void display1()
  {
	  System.out.println("Parent class");
  }
   
  public void display2()
  {
	  System.out.println(" the non static method for Parent class");
  }
  
}*/




