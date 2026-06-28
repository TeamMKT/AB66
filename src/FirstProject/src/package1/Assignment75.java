package package1;
/*Write A Program to create relation between 2 classes having static methods using extends keyword. 
 * Single Level Inheritance from 2 different package*/

import package2.Assignment75_ParentClass;

public class Assignment75 extends Assignment75_ParentClass
{
	static void mul()
	{
		int a =15;
		int b=25;
		int c =a*b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		mul();
		Assignment75_ParentClass.sub();

	}
}
/*package package2;
Write A Program to create relation between 2 classes having static methods using extends keyword. 
 * Single Level Inheritance from 2 different package

public class Assignment75_ParentClass 
{
 public static void sub()
 {
	 double a =1.25;
	 double b=2.56;
	 double c=b-a;
	 System.out.println(c);
 }
	

}*/


