package package1;
//"Write A Program to declare a vairable inside a static and non static Method. For local varable."
public class Assignment34 {
static void add()
{
	int a=100;
	int b=200;
	int c= a+b;
	System.out.println(c);
}
void sub()
{
	int a=100;
	int b=200;
	int c= b-a;
	System.out.println(c);
}
	public static void main(String[] args)
	{
		add();
		Assignment34 v1=new Assignment34();
		v1.sub();

	}

}
