package methodoverridding;
class A1
{
	void show()
	{
		System.out.println("Method A");
	}
}
public class B1 extends A1
{
	void show(int a)
	{
		super.show();
		System.out.println("Method B");
	}
public static void main(String[] args) 
{
	B1 g=new B1();
	g.show(10);
	B1 g1=new B1();
	g1.show();
	
}

}
