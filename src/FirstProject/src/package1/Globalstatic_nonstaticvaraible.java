package package1;
//Write a program for use static and nonstatic global variable use both of them inside and call in main method.
public class Globalstatic_nonstaticvaraible
{
static int A=100;
int B=89;
	public static void main(String[] args)
	{
		int A=100;
		Globalstatic_nonstaticvaraible obj=new Globalstatic_nonstaticvaraible();
		int mul=A*(obj.B);
		System.out.println(mul);
		int sub=A-(obj.B);
		System.out.println(sub);

	}

}
