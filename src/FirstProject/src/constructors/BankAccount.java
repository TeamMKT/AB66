package constructors;
public class BankAccount 
{
	int accountNumber;
	int balance;
	BankAccount (int accountNumber,int balance)
	{
		
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	void deposit(int amount)
	{
		balance= balance+amount;
		System.out.println("Print Double amount:");
	}
	void withdraw(int amount)
	{
		balance= balance-amount;
		System.out.println("Print Double amount:");
	}
	void displayBalance()
	{
		System.out.println("Account:"+accountNumber + " & balnce:"+ balance);
	}
	public static void main(String[] args) 
	{
		BankAccount b1 = new BankAccount (123456,50000);
		b1.deposit(1000);
		b1.withdraw(500);
		b1.displayBalance();
	}
}
