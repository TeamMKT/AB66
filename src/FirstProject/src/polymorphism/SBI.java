package polymorphism;
class Bank
{
	//final void loan()
	{
		System.out.println("Bank provides Loan");
	}
}
public class SBI extends Bank
{
   void loan()
   {
	   System.out.println("SBI provides Bank loan");
   }
   public static void main(String[] args)
   {
	   SBI s= new SBI();
	   s.loan();
}
}
