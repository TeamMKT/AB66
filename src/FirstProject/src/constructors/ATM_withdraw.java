package constructors;

public class ATM_withdraw 
{
    int balance = 50000;
    void withdraw(int amount)
    {
    	if (balance>=amount)
    	{ 
    		System.out.println("Withdraw amount is:"+ amount);
    		balance = balance-amount;
    		System.out.println("Withdraw balance is :"+ balance);
    	}
    	else
    	{
    		System.out.println("Insufficient balance");
    	}
    }
    public static void main(String[] args) {
    	ATM_withdraw a1 = new ATM_withdraw();
    	a1.withdraw(20000);
	}
}
