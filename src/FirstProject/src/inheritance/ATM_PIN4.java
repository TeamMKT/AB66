package inheritance;
class Bank5
{
	int accountNumber = 123456;
	int balance = 25000;
	void display()
	{
		System.out.println("AccountNumber:" + accountNumber + " &  Balnce:" + balance);
	}
}
public class ATM_PIN4 extends Bank5
{
      int pin = 2007;
      boolean isloggedIn = false;
      void login(int enteredPin)
      {
    	  if(pin == enteredPin)
    	  {
    		  System.out.println("login successful");
    		  isloggedIn = true;
    	  }
    	  else
    	  {
    		  System.out.println("invalid login");
    	  }
      }
      void deposit(int amount)
      {
    	  if(isloggedIn)
    	  {
    		  System.out.println("Pin is correct");
    		  System.out.println("to allow the operations");
    		  balance = balance+amount;
    		  System.out.println("depoist amount is:" + balance);
    	  }
    	  else
    	  {
    		  System.out.println("login first");
    	  }
      }
      void checkbalance(int enteredPin)
      {
    	  if(pin == enteredPin)
    	  {
    		  System.out.println("CurrenctBalance:"+balance);
    		  
    	  }
    	  else
    	  {
    		  System.out.println("invalid pin");
    	  }
    	 
      }
      
      public static void main(String[] args)
      {
    	  ATM_PIN4 a1 = new ATM_PIN4();
    	  a1.login(2007);
    	  a1.deposit(5000);
    	  a1.checkbalance(2007);
    	  a1.display();
	}
      
}
