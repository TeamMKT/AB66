package inheritance;
class Bank
{
	int accountNumber=123456;
	int balance = 50000;
	void display()
	{
		System.out.println("AccountNumberis:" + accountNumber + "& Balance is:"+ balance);
	}
}
public class ATM extends Bank
{
   void deposit(int amount)
   {   
	   System.out.println("Deposit amount is:"+ amount);
	   balance= balance+amount;
	   System.out.println("Deposit amount is successful:" + balance);
   }
   void withdraw(int amount)
   {
	   if(balance>=amount)
	   {
		   System.out.println("Withdraw amount is:"+ amount);
		   balance= balance-amount;
		   System.out.println("Withdraw amount is successful:" + balance);
	   }
	   else
	   {
		   System.out.println("InSufficient Balance");
	   }
	  
   }
   public static void main(String[] args) 
   {
	   ATM a1 = new ATM();
	   a1.deposit(5000);
	   a1.withdraw(200000);
	   a1.display();
}
}
