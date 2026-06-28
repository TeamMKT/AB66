package practiclaJAVA;
public class Account 
{
   private int accountNumber;
   private double balance;
   public int getAccountNumber() {
	return accountNumber;
   }
   public double getBalance() {
	return balance;
   }
   public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
   }
   public void setBalance(double balance) {
	this.balance = balance;
   }
   public static void main(String[] args)
   {
	   Account a1 = new Account ();
	   a1.setAccountNumber(123456);
	   a1.setBalance(500000);
	   System.out.println(a1.getAccountNumber());
	   System.out.println(a1.getBalance());
	   
}
}
