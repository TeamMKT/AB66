package package1;
//"Write a program to call 3 static parameterized methods inside main method"
public class Assignement4
{
static void add(int a, int b)
{
	int add=a+b;
	System.out.println(add);
}
static void add(int a, int b,int c)
{
	int add1=a+b+c;
	System.out.println(add1);
}
static void add(int a,double b, float c)
{
	double add2=a+b+c;
	System.out.println(add2);
}

	public static void main(String[] args) {
		add(12,15);
		add(12,15,16);
		add(12,1.25,3.576f);
		
	}

}
