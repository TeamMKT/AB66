package encapsulation;

public class ATM 
{
   double balance;
   void setBalance(double balance)
   {
	   this.balance = balance;
   }
   boolean withdraw(double amount)
   {
	   if(amount<=balance)
	   {
		   balance= balance-amount;
		   return true;
	   }
	   else
	   {
		   return false;
	   }
   }
   public static void main(String[] args) {
	   ATM a1 = new ATM();
	   a1.setBalance(10000);
	  boolean result= a1.withdraw(3000);
	   System.out.println(result);
	   
}
}
