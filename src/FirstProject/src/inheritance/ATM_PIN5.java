package inheritance;
class Bank6
{
	int accountNumber=123456;
	int balance = 20000;
	void diplay()
	{
		System.out.println("AccoutnNumber:"+accountNumber + " & balance:" + balance);
	}
}
public class ATM_PIN5 extends Bank6
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
      void transfer(int amount, ATM_PIN5 receiver)
      {
    	  if(isloggedIn)
    	  {
    		  if(balance>=amount)
    		  {
    			  balance = balance-amount;//deduct from sender
    			  receiver.balance= receiver.balance+amount; //add to reciever
    			  System.out.println("Tansfer successful");
    			  System.out.println("Sender balance:"+balance);
    			  System.out.println("Receiver balance:"+ receiver.balance);
    		  }
    		  else
    		  {
    			  System.out.println("Insuffcient balance");
    		  }
    	  }
    	  else
    	  {
    		  System.out.println("invalidpin");
    	  }
      }
      
      public static void main(String[] args) 
      {
    	  ATM_PIN5 a1 = new ATM_PIN5();
    	  ATM_PIN5 a2 = new ATM_PIN5();
    	  a1.login(2007);
    	  a1.transfer(5000, a2);
    	  a1.diplay();
    	  a2.diplay();
 	}
}
