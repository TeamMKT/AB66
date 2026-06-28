package constructors;
public class BankAccount1
{
   int accountNumber;
   int balance;
   void data(int accountNumber, int balance)
   {   
	   int AccountNumber = accountNumber;
	   int Balance = balance;
	   System.out.println("accountNumber is :"+ accountNumber + " & balance is:"+ balance);
	  
   }
   void deposit(int amount)
   {
	   balance= balance + amount;
	   System.out.println("deposit amount is successful:" + balance);
   }
   void withdraw (int amount)
   {
	   balance = balance-amount;
	   System.out.println("Withdraw is successful:" + balance);
   }
   void display()
   {
	   System.out.println("Accountnumber is:" + accountNumber + " & Balance is :"+ balance);
   }
   public static void main(String[] args) 
   {
	   BankAccount1 b1 = new BankAccount1();
	   b1.data(101, 50000);
	   b1.deposit(5000);
	   b1.withdraw(1500);
	   b1.display();
	   BankAccount1 b2 = new BankAccount1();
	   b2.data(102, 5000);
	   b2.deposit(50000);
	   b2.withdraw(15000);
	   b2.display();
}
   
}
