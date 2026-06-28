package package2;
/* we crate an objectof child class not just you can access the nonstatic child class and non staticparent class but also 
you can access the instance varaible of child class and instance varaible of parent class. In inheritance topic create an 
object for child class it is useful to access child and paraent class */ 
class L2
{
	static int noofDays = 60;//static variable
	int noofdays = 60; //non static varaible//instance varaible
	static void method2()
	{
		System.out.println("Method 2");
	}
	void method3()
	{
		System.out.println("Method 3");
	}
}
public class L1 extends L2
{
    static void method1()
    {
    	System.out.println("Method 1");
    }
	void method4()
	{
		System.out.println("Method 4");
	}
	public static void main(String[] args) 
	{
	   method1();
	   method2();
	   L1 l1=new L1();
	   l1.method3();
	   l1.method4();
	   System.out.println(noofDays);
	   System.out.println(l1.noofDays);//object creation(referencevaraible.instance variablr)

	}

}
