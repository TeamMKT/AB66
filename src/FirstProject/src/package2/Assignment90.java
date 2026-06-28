package package2;
//"Write A Program on this calling statement multi level inheritance"
class Assignment90_GPC
{
	Assignment90_GPC(int a)
	{
		System.out.println("Print a:"+a);
	}
}
class Assignment90_PC extends Assignment90_GPC
{
	Assignment90_PC(int a, int b)
	{
		super(10);
		int c =a*b;
		System.out.println("Print c :"+ c);
	}
}
public class Assignment90 extends Assignment90_PC
{
	Assignment90(double c, double d)
	{
		this(25,15);
		double e =c+d;
		System.out.println("Print e:"+e);
	}
	Assignment90(int x, int y)
	{
		super(10,20);
		double z =x-y;
		System.out.println("Print z:"+ z);
	}
	public static void main(String[] args) 
	{
		new Assignment90(1.25,1.5);
	}
}
