package constructors;

public class ATM 
{
   int accountNumber;
   int balance;
   int pin;
    ATM(int accountNumber,int balance,int pin)
    {
    	this.accountNumber=accountNumber;
    	this.balance = balance;
    	this.pin = pin;
    }
    void login(int enteredPin)
    {
    	if(pin == enteredPin)
    	{
    		System.out.println("The login pin is true");
    	}
    	else
    	{
    		System.out.println("invalid login");
    	}
    }
    void deposit(int enteredPin,int amount)
    {
    	if(pin == enteredPin)
    	{
    		balance = balance+amount;
    		System.out.println("The login pin is true");
    	}
    }
    }

