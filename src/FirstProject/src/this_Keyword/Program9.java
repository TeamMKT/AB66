package this_Keyword;

public class Program9 
{
   String check(int num)
   {
	   if(num % 2==0)
	   {
		   return "Even";
	   }
	   else
	   {
		   return "Odd";
	   }
   }
   public static void main(String[] args) 
   {
	   Program9 a1 = new Program9();
	   String result = a1.check(15);
	   System.out.println(result);
	   
}
}
