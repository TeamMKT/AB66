package package2;
/*Write a program for single-level inheritance using a static and Non-static method in the 
different class name in the single package explorer.*/
public class Assignment77 extends Assignement77_parentclass 
{
  static void mul()
  {
	  double a= 1.25;
	  double b = 2.54;
	  double c =a*b;
	  System.out.println(c);
  }
	public static void main(String[] args) 
	{
		mul();
		Assignment77 p1=new Assignment77();
        p1.add();
	}

}
/*package package2;

public class Assignement77_parentclass 
{
   void add()
   {
	   int a=25;
	   int b=75;
	   int c=a+b;
	   System.out.println(c);
   }
}*/

