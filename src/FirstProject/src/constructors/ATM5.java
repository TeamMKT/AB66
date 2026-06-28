package constructors;

public class ATM5
{
    int balance = 25000;
    int amount = 15000;
    void display()
    {
    	System.out.println("Deposit amount is:" + amount);
    	balance = balance+amount;
    	System.out.println("Deposit is successful:"+ balance);
    	System.out.println("Withdraw amount is:" + amount);
    	balance= balance-amount;
    	System.out.println("Withdraw is successful:"+ balance);
    	System.out.println("Final balnce is:"+balance);
    }
    public static void main(String[] args)
    {
    	ATM5 a1 = new ATM5();
    	a1.display();
    	
	}
}
