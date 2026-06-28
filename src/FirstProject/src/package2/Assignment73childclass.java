package package2;
//WAP to create relation between 2 classes having static methods using extends keyword. Single Level Inheritance from 2 different package

import package1.ParentClass;


public class Assignment73childclass extends ParentClass

{
  static void display()
  {
	  System.out.println("Child class");
  }
	
	
	public static void main(String[] args)
	{
		display();
		display1();
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



