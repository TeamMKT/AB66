package constructors;

public class ATM_2Accounts 
{
   int balance;
   void deposit(int amount)
   {
	   balance = amount +balance;
	   System.out.println("Deposit amount is:"+balance);
   }
   void withdraw(int amount)
   {
	   balance = balance-amount;
	   System.out.println("Withdraw amount is:" + balance);
   }
   void diplay()
   {
	   System.out.println("Print the balance amount:"+ balance);
   }
   public static void main(String[] args)
   {
	   ATM_2Accounts b1 = new ATM_2Accounts();
	   ATM_2Accounts b2 = new ATM_2Accounts();
	   b1.deposit(10000);
	   b1.withdraw(5000);
	   b1.diplay();
	   
	   b2.deposit(15000);
	   b2.withdraw(5000);
	   b2.diplay();
}
   
}
