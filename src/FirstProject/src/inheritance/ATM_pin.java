package inheritance;
 class Bank2
 {
	 int accountNumber=123456;
	 int balance = 50000;
	
	 void diplay()
	 {
		 System.out.println("AccountNumber is:"+ accountNumber + "  &  Balance is:"+ balance);
	 }
 }
public class ATM_pin extends Bank2
{
	 int pin =2007;
	 boolean isLoggedIn = false;
	 boolean isBlocked = false;
     void login(int enteredPin)
     {
    	 if(pin==enteredPin)
    	 {
    		 System.out.println("Login Successful");
    		 isLoggedIn=true;
    	 }
    	 else
    	 {
    		 System.out.println("Invalid Pin");
    		 
    	 }
     }
     void deposit(int amount)
     {
    	 if(isLoggedIn)
    	 {
    	  System.out.println("Pin is correct");
    	  System.out.println("Deposit amount is:"+ amount);
    	  balance = balance+amount;
    	  System.out.println("Deposit successful:" + balance);
    	 }
    	 else
    	 {
    		 System.out.println("Please login first");
    	 }
     }
     void withdraw(int amount)
     {
    	 if(isLoggedIn)
    	 {
    		 if(balance>=amount)
        	 {
        		 System.out.println("Allow withdraw");
        		 System.out.println("Withdraw amount is:"+amount);
        		 balance= balance-amount;
        		 System.out.println("Withdraw successful:" + balance);
        	 }
        	 else
        	 {
        		 System.out.println("Insufficient balance");
        	 }
    	 }
    	 else
    	 {
    		 System.out.println("invalid login");
    	 }
     }
     public static void main(String[] args) 
     {
    	 ATM_pin a1 = new ATM_pin();
    	 a1.login(2007);
    	 a1.deposit(5000);
    	 a1.withdraw(2000);
    	 a1.diplay();
	}
}

