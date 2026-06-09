package module1.programs;
public class CombinationOfStaticNon 
{
	static void sub()
	{
		System.out.println("Static Method");
	}
	void add()  //non sttaic method
	{
		System.out.println("Non Static Method 1");
	}
	void mul()  //non sttaic method
	{
		System.out.println("Non Static Method 2");
	}
	public static void main(String[] args) //main method
	{
		System.out.println("Main Method");
		CombinationOfStaticNon n1=new CombinationOfStaticNon();
		n1.add();
		n1.mul();
		sub();
		CombinationOfStaticNon n2=new CombinationOfStaticNon();
		n2.add();
		n2.mul();

	}
}
