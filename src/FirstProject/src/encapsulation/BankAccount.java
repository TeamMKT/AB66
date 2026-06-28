package encapsulation;

public class BankAccount 
{
   private int accountnumber;
   private String accountHolderName;
   private double balance;
   public int getAccountnumber() {
	return accountnumber;
   }
   public String getAccountHolderName() {
	return accountHolderName;
   }
   public double getBalance() {
	return balance;
   }
   public void setAccountnumber(int accountnumber) {
	this.accountnumber = accountnumber;
   }
   public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
   }
   public void setBalance(double balance) {
	this.balance = balance;
   }
   public static void main(String[] args) {
	   BankAccount b1 = new BankAccount();
	   b1.setAccountnumber(123456);
	   b1.setAccountHolderName("Geeta");
	   b1.setBalance(15000.35);
	   System.out.println(b1.getAccountnumber());
	   System.out.println(b1.getAccountHolderName());
	   System.out.println(b1.getBalance());
	   
	   
}
}
