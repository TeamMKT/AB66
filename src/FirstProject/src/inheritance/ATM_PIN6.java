package inheritance;
class Bank7
{
	int accountNumber = 123456;
	int balance = 50000;
	void diplay()
	{
		System.out.println("AccoutnNumber :"+ accountNumber + "  &  Balance : "+ balance);
	}
}
public class ATM_PIN6 extends Bank7
{
    int pin = 2007;
    boolean isloggedIn = false;
    void login(int enterdPin)
    {
    	if(pin == enterdPin)
    	{
    		System.out.println("Login successful");
    		isloggedIn=true;
    	}
    	else
    	{
    		System.out.println("Invalid login");
    	}
    }
    void transfer(int amount, ATM_PIN6 receiver)
    {
    	if(isloggedIn)
    	{
    		if(balance>=amount)
    		{
    			balance=balance-amount;
    			receiver.balance= receiver.balance + amount;
    			System.out.println("Tranfer successful");
    			System.out.println("Sender balance:"+balance);
    			System.out.println("Receier balance:" + receiver.balance);
    		}
    		else
    		{
    			System.out.println("insufficient balance");
    		}
    	}
    	else
    	{
    		System.out.println("invlaid pin");
    	}
    }
    public static void main(String[] args) 
    {
    	ATM_PIN6 a1  = new ATM_PIN6();
    	ATM_PIN6 a2 = new ATM_PIN6();
    	a1.login(2006);
    	a1.transfer(150000, a2);
    	a1.diplay();
    	a2.diplay();
    	
	}
}
