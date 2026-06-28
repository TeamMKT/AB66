package constructors;
public class ATM_PIN 
{
	int accountNumber=123456;
	int balance=50000;
	int pin=1982;
	void checkBalance(int enteredPin)
	{
		if(pin==enteredPin)
		{
			System.out.println("Balance:"+balance);
		}
		else
		{
			System.out.println("Invalid Pin");
		}
	}
	void deposit(int enteredPin, int amount)
	{
		if(pin==enteredPin)
		{
			balance = amount+balance;
			System.out.println("Deposit Balance:"+balance);
		}
		else
		{
			System.out.println("Invalid Pin");
		}
	}
	void withdraw(int enteredPin, int amount)
	{
		if(pin==enteredPin)
		{
		   if(balance>=amount)
		     {
			balance= balance-amount;
			System.out.println("Withdraw Balance:" + balance);
		      }
		    else
		    {
			System.out.println("Insufficient amount");
		    }
		}
		   else
		   {
			   System.out.println("Invalid login");
		   }
	}
	public static void main(String[] args) 
	{
		ATM_PIN b1 = new ATM_PIN ();
		b1.checkBalance(1982);
		b1.deposit(1982, 500000);
		b1.withdraw(1982, 20000);
		
	}
	
}

