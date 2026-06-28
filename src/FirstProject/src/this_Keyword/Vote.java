package this_Keyword;

public class Vote 
{
   int age;
   
   void setAge(int age)
   {
	   this.age= age;
   }
  String checkEligibility()
   {
	   if(age >=18)
	   {
		   return "Eligibility for vote";
	   }
	   else
	   {
		   return "Not Eligible";
	   }
   }
   public static void main(String[] args) {
	   Vote v= new Vote();
	   v.setAge(19);
	   String result = v.checkEligibility();
	   System.out.println(result);
	   
	   
}
}
