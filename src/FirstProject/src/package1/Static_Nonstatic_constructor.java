package package1;
public class Static_Nonstatic_constructor {
static void add()
{
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
}
void sub()
{
	int a =25;
	int b = 30;
	int c=b-a;
	System.out.println(c);
}
Static_Nonstatic_constructor()
{

		System.out.println("Chegg");
		System.out.println("vizag");

}
public static void main(String[] args) {
		add();
		Static_Nonstatic_constructor n1= new Static_Nonstatic_constructor();
		n1.sub();
		new Static_Nonstatic_constructor();

	}

}
