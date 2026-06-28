package constructors;

public class ATM3 
{
   int balance=50000;
   void deposit(int amount)
   {
	   balance= balance+amount;
	   System.out.println("Deposit amoutn is:"+ balance);
   }
   void display()
   {
	   System.out.println("Final balance is:" + balance);
   }
   public static void main(String[] args)
   {
	   ATM3 a1 = new ATM3();
	   a1.deposit(5000);
	   a1.display();
}
   
}
