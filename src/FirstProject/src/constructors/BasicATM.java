package constructors;

public class BasicATM 
{
   int balance;
   void deposit(int amount)
   {
	   balance= balance+amount;
	   System.out.println("Print deposit amount:"+balance);
   }
   void withdraw(int amount)
   {
	   balance= balance-amount;
	   System.out.println("Print withdraw amount:"+balance);
   }
   void diplay()
   {
	   System.out.println("balance amount:"+ balance);
   }
   public static void main(String[] args) 
   {
	   BasicATM b1 = new BasicATM ();
	   b1.deposit(150000);
	   b1.withdraw(50000);
	   b1.diplay();
}
}
