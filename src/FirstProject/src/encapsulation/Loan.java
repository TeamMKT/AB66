package encapsulation;

public class Loan 
{
   int salary;
   int amount;
   void setDetails(int salary, int amount)
   {
	   this.salary=salary;
	   this.amount= amount;
   }
   String checkLoanApproval()
   {
	   if(salary>=50000 && amount<=20000)
	   {
		   return "Approved";
	   }
	   else
	   {
		   return "Rejected";
	   }
   }
   public static void main(String[] args) {
	   Loan l1 = new Loan ();
	   l1.setDetails(60000, 15000);
	   String result = l1.checkLoanApproval();
	   System.out.println(result);
}
}
