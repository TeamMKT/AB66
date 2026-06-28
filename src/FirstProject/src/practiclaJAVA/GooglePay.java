package practiclaJAVA;
interface Payment
{
	void pay();
}
class PhonePe implements Payment
{
	@Override
	public void pay()
	{
		System.out.println("Method of Payment is: Phonepe");
	}
}
public class GooglePay implements Payment
{
	@Override
	public void pay() 
	{
		System.out.println("Method of Payment is: GooglePay");
	}
	public static void main(String[] args) 
	{
		Payment p1 = new GooglePay();
		p1.pay();
		Payment p2 = new PhonePe();
		p2.pay();
		
	}

}
