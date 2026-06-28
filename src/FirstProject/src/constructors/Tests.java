package constructors;
class A1
{
	A1()
	{
		System.out.println("Shri");
	}
}
class B1 extends A1
{
	B1()
	{
		System.out.println("Hello");
	}
}
class C1 extends B1
{
	C1()
	{
		System.out.println("Hi");
	}
}
public class Tests 
{
public static void main(String[] args) {
	new C1();
}
}
