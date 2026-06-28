package practiclaJAVA;
class Bank
{
	void rateOfInterest()
	{
		System.out.println("Bank rateOfInterest:");
	}
}
class SBI extends Bank
{
	void rateOfInterest()
	{
		System.out.println("SBI Bank rateOfInterest is:"+8.5+"%");
	}
}
public class HDFC extends Bank
{
	void rateOfInterest()
	{
		System.out.println("HDFC Bank rateOfInterest:" + 11.5 +"%");
	}
	public static void main(String[] args) 
	{
		Bank b1 = new HDFC();
		b1.rateOfInterest();
		Bank b2 = new SBI();
		b2.rateOfInterest();
	}
}
