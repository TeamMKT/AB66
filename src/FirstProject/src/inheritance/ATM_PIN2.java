package inheritance;
class Bank3
{
	int accountNumber=546978;
	int balance=15000;
	void display()
	{
		System.out.println("Account number is:"+accountNumber + " & Balane:"+ balance);
	}
}
public class ATM_PIN2 extends Bank3
{
     int pin =2007;
     boolean isloggedIn = false;
     boolean isBlocked = false;
     void login(int enterdPin)
     {
    	 if(pin==enterdPin)
    	 {
    		 System.out.println("ligin is successful");
    		 isloggedIn=true;
    	 }
    	 else
    	 {
    		 System.out.println("Invalidlogin");
    	 }
     }
     void deposit(int amount)
     {
    	 if(isloggedIn)
    	 {
    		 System.out.println("pin is correct");
    		 System.out.println("to allow the operations");
    		 balance = balance+amount;
    		 System.out.println("Deposit amount is:"+balance);
    	 }
    	 else
    	 {
    		 System.out.println("Please login first");
    	 }
     }
     void logout()
     {
    	 isloggedIn = false;
    	 System.out.println("Logged out successfully");
     }
     public static void main(String[] args) 
     {
    	 ATM_PIN2 a1 = new ATM_PIN2();
    	 a1.login(2007);
    	 a1.deposit(5000);
    	 a1.logout();
    	 a1.display();
	}
}
