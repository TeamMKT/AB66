package encapsulation;

import org.openqa.selenium.grid.Main;

public class Test1 
{
  int bankAccountNubmer;
  double balance;
  public int getBankAccountNubmer() {
	return bankAccountNubmer;
  }
  public double getBalance() {
	return balance;
  }
  public void setBankAccountNubmer(int bankAccountNubmer) {
	this.bankAccountNubmer = bankAccountNubmer;
  }
  public void setBalance(double balance) {
	this.balance = balance;
  }
  public static void main(String[] args) 
  {
	  Test1 a1 = new Test1 ();
	  a1.setBankAccountNubmer(123456);
	  a1.setBalance(250000);
	  System.out.println(a1.getBankAccountNubmer());
	  System.out.println(a1.getBalance());

}
}
