package package1;
//""Write a program to create a class consist of static, Non Static and constructor method and call each of them in a non parameterized way."
public class Assignment25 {
static void mul()
{
	int a =15;
	int b=16;
	int c=a*b;
	System.out.println(c);
}
void add()
{
	int a = 5;
	int b = 6;
	int c = 7;
	int d= a+b+c;
	System.out.println(d);
}
Assignment25()
{
	int a =6;
	double b=1.25;
	float c=1.265f;
	double d=a+b+c;
	System.out.println(d);
}

	public static void main(String[] args) {
		mul();
		Assignment25 n1=new Assignment25();
		n1.add();
		new Assignment25();
	}

}
