package methodoverridding;
class Bank
{
	void interest()
	{
		System.out.println("General interest");
	}
}
class SBI extends Bank
{
	void interest()
	{
		System.out.println("SBI interest");
	}
}
public class HDFC extends Bank
{
	void interest()
	{
		System.out.println("HDFC interest");
	}  
public static void main(String[] args) 
{
	Bank b=new SBI();
	b.interest();
	Bank b1=new HDFC();
	b1.interest();
}
}
