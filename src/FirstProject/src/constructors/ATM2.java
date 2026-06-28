package constructors;

public class ATM2
{
   int balance;
    void deposit(int amount)
    {
    	balance = balance+amount;
    	System.out.println("Deposit amount is:" + balance);
    }
    void withdraw(int amount)
    {
    	System.out.println("Withdraw amount is:" + amount);
    	balance = balance-amount;
    	System.out.println("After Withdraw amount is:" + balance);
    }
    void diplay()
    {
    	System.out.println("Balance is:"+ balance);
    }
    public static void main(String[] args) {
    	ATM2 a1 = new ATM2();
    	a1.deposit(5000);
    	a1.withdraw(2000);
    	a1.diplay();
	}
}
