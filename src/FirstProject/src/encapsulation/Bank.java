package encapsulation;

public class Bank
{
   int balance;
   void setBlance(int balance)
   {
	   this.balance= balance;
   }
   int deposit(int amount)
   {
	   if(amount>0) 
	   {
		   balance = balance+amount;
	   }
	   return balance;
   }
   public static void main(String[] args) {
	Bank b= new Bank();
	b.setBlance(5000);
	int result = b.deposit(2000);
	System.out.println(result);
}
   
   
}
