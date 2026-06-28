package constructors;

public class ATM4
{
	int balance=50000;
	   void deposit(int amount)
	   {
		   balance= balance+amount;
		   System.out.println("Deposit amount is:"+ balance);
	   }
	   void withdraw(int amount)
	   {
		   if(balance>=amount)
		   {
			   System.out.println("Withdraw amount is: "+ amount);
			   balance= balance-amount;
			   System.out.println(" Final Withdraw amount is:"+ balance);
		   }
		   else
		   {
			   System.out.println("Insufficient balance");
		   }
	   }
	   public static void main(String[] args) 
	   {
		   ATM4 a1 = new ATM4();
		   a1.deposit(5000);
		   a1.withdraw(1500);
	}
}
