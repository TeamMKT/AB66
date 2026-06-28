package package1;
//"Write a Program to call combination of static and non static parameterized method overloading".
public class Assignment22 {
static void add(int a, int b)
{
	int c =a+b;
	System.out.println(c);
}
void add(int a, double b, float c)
{
	double d= a+b+c;
	System.out.println(d);
}
	public static void main(String[] args) {
		
		add(12,15);
		Assignment22 a1=new Assignment22();
	    a1.add(5,1.25,1.356f);
	
		
	}

}
