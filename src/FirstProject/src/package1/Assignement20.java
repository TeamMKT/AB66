package package1;
//"Write a Program to call 3  parameterized static Method Overloading"
public class Assignement20 {
  static void add(int a)
  {
	System.out.println(a);
  }
  static void add(int a, int b)
  {
	  
	  int c = a+b;
	  System.out.println(c);
  }
static void add(int a, double b, float c)	
{
	double d=a+b+c;
	System.out.println(d);
}
	public static void main(String[] args) {
		add(5);
		add(15,25);
		add(8,1.25,2.25f);
		
	}

}
