package encapsulation;
public class EMI
{
	double amount;
	double rate;
	double time;
  
	void setDetails(double amount, double rate, int time)
  {
	  this.amount = amount;
	  this.rate = rate;
	  this.time = time;
  }
 double calculateSimpleInterest()
 {
	  double SI = (amount * rate * time)/100.0;
	 return SI;
 }
  public static void main(String[] args) 
  {
	  EMI e1= new EMI();
	  e1.setDetails(1000, 8.5, 2);
	  double result=e1.calculateSimpleInterest();
	  System.out.println(result);
}
}
