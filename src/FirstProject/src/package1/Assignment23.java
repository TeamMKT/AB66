package package1;
//"Write a Program to call combination of static and non static non parameterized method overloading"
public class Assignment23 {
  static void add()
  {
	  System.out.println("Static method");
  }
	
	void add(double a, double b)
  {
	  double c =a+b;
	  System.out.println(c);
  }
public static void main(String[] args) 
{
	add();
	Assignment23 a1=new Assignment23();
	a1.add(1.25,2.25);
	
}
}

