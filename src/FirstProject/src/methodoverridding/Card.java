package methodoverridding;
class Payment
{
	void pay()
	{
		System.out.println("General payment");
	}
}
class UPI extends Payment
{
	void pay()
	{
		 super.pay(); 
		System.out.println("Payment using UPI");

	}
}
public class Card extends Payment
{
      void pay()
      {
  		 
    	  System.out.println("Payment using Card");
  
      }
 public static void main(String[] args) 
   {
		Payment p = new UPI();
		p.pay();
		Payment p1 = new Card();
		p1.pay();
		
	}
}
