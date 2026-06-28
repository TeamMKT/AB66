package constructors;

public class BankAccount2 
{
	int accountNumber;
	int balance;
	BankAccount2(int accountNumber , int balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	void deposit(int amount)
	{
		balance = balance+amount;
		System.out.println("Deposit amount is:"+ balance);
	}
	void withdraw(int amount)
	{
		System.out.println("withdraw amount is:" + amount);
		balance = balance-amount;
		System.out.println("After withdraw amount balance is:" +balance);
	}
    void display()
    {
    	System.out.println("Remainging Balance is:"+ balance );
    }
    public static void main(String[] args) 
    {
    	BankAccount2 b1 = new BankAccount2(123456,1000);
    	b1.deposit(1500);
    	b1.withdraw(500);
    	b1.display();
    	BankAccount2 b2 = new BankAccount2(234567,10000);
    	b2.deposit(5000);
    	b2.withdraw(2000);
    	b2.display();
    	
	}
}
