package inheritance;
class Bank1
{
	int accountNumber = 12346;
	int balance = 500;
	void display()
	{
		System.out.println("AccountNumber is :" + accountNumber + "& Balance :" + balance);
	}
}
class SavingsAccount extends Bank1
{
	void addInterest()
	{
		 balance = balance + (balance * 5/100);
		
		System.out.println("Present Balance is:"+balance);
		
	}
}
public class CurrentAccount extends Bank1
{
    void checkMinimumBalance()
    {
    	if (balance <1000)
    	{
    		System.out.println("Minimum balance warning");
    	}
    	else
    	{
    		System.out.println("Balance maintained");
    	}
    }
    public static void main(String[] args)
    { 
    	SavingsAccount s1 = new SavingsAccount();
    	s1.addInterest();
    	CurrentAccount a1 = new CurrentAccount();
    	a1.checkMinimumBalance();
    	a1.display();
    	}
}
