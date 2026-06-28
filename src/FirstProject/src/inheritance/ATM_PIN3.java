package inheritance;
class Bank4
{
	int accountNumber=123456;
	int balance = 25000;
	void display()
	{
		System.out.println("accountNumber:"+ accountNumber + "  & balance:" + balance);
	}
}
public class ATM_PIN3 extends Bank4
{
      int pin=2007;
      boolean isloggedIn=false;
      void login(int enteredPin)
      {
    	  if(pin ==  enteredPin)
    	  {
    		  System.out.println("login successful");
    		  isloggedIn = true;
    	  }
    	  else
    	  {
    		  System.out.println("invalid login");
    	  }
      }
      void checkBalance(int enteredPin)
      {
    	  if(pin==enteredPin)
    	  {
    		   
    		  System.out.println("Check current balance:"+balance);
    	  }
    	  
    	  
      }
      public static void main(String[] args) 
      {
    	  ATM_PIN3 a1 = new ATM_PIN3();
    	  a1.login(2007);
    	  a1.checkBalance(2007);
    	  a1.display();
	}
}
