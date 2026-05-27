package moduel3;
public class SIBIIB2 
{
	static
	{
		System.out.println("THis is SIB");
	}
	{
		System.out.println("THis is IIB 2");
	}
	{
		System.out.println("THis is IIB 3");
	}
	SIBIIB2()
	{
		System.out.println("COnstrcutor 1");
	}
	SIBIIB2(int a)
	{
		System.out.println("COnstrcutor 2");
	}
	public static void main(String[] args) //main Method
	{
		System.out.println("This is Main Method");
		SIBIIB2 s1=new SIBIIB2();
		new SIBIIB2(100);
	}
}
