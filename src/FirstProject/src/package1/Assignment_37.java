package package1;
////"Write A Program for static and non static global varibles and utilize them in both static and non static methods"
public class Assignment_37 
{
static int a=45;
int b=58;
static void add()
{
	//here, b is a nonstatic varaible so create an object.
	Assignment_37 a2=new Assignment_37 ();
	int add=a+a2.b;//b is non static variable we can't write directly so we can write like b=a2.b.
	System.out.println(add);
}
void mul()
{
	int mul=a*b;
	System.out.println(mul);//here no need to write b=a2.b, the given int b is non static
}
	public static void main(String[] args) 
	{
		add();//calling sttaic method by its name
		Assignment_37 a2=new Assignment_37 ();// in main method we can create an object, because calling nonstaic mehtod.
		a2.mul();

	}

}
