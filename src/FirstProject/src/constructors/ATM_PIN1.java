package constructors;
public class ATM_PIN1 
{
	int accountNumber = 245689;
	int balance = 10000;
    int pin = 2007;
    void checkBalance(int enteredPin)
    {
    	if (pin ==enteredPin)
    	{
    		System.out.println("Balance is :"+ balance);
    	}
    	else
    	{
    		System.out.println("Invalid PIN");
    	}
    }
    void deposit(int enteredPin, int amount)
    {
    	if (pin ==enteredPin)
    	{    
    		balance = amount+ balance;
    		System.out.println("Deposit Balance is successful:"+ balance);
    	}
    	else
    	{
    		System.out.println("Invalid PIN");
    	}
    }
    void withdraw(int enteredPin, int amount)
    {
    	if (pin ==enteredPin)
    	{
    		if(balance>=amount)
    		{
    			balance = balance-amount;
    			System.out.println("The withdraw balance is successful:" + balance);
    		}
    		else
    		{
    			System.out.println("Insufficient balance");
    		}
    	}
    	else
    	{
    		System.out.println("Invalid Pin");
    	}
    }
    public static void main(String[] args) 
    {
    	ATM_PIN1 a1 = new ATM_PIN1();
    	a1.checkBalance(2007);
    	a1.deposit(2007, 250000);
    	a1.withdraw(2007, 5000);
    	
	}
}
