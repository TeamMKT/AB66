package package1;
//"Write a program on both method Overloadingand consturctor overloading"
public class Assignment29 
{
static void add ()
{
	System.out.println("Addition1");
}
static void add (int a, float b)
{
	float c=a+b;
System.out.println(c);
}
static void add(int a, int b)
{
	int c= a+b;
	System.out.println(c);
}
void add(int a, int b, double c)
{
	double d=a+b+c;
	System.out.println(d);
}
Assignment29()
{
	System.out.println("Addition2");
}
Assignment29(int a, int b)
{
	int c=a+b;
	System.out.println(c);
}
public static void main(String[] args) {
		add();
		add(12,3.456f);
		add(14,15);
		Assignment29 a1=new Assignment29();
		new Assignment29(14,15);
		a1.add(12,15,3.25);
	}

}

