package this_Keyword;

public class Login 
{
   String username;
   String password;
   void setDetails(String username,String password)
   {
	   this.username = username;
	   this.password = password;
   }
   boolean checklogin()
   {
	   if(username.equals("admin") && password.equals("1234"))
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
   }
   public static void main(String[] args) 
   {
	   Login l1 = new Login();
	   l1.setDetails("Geeta", "1234");
	   boolean result = l1.checklogin();
	   System.out.println(result);
	   
}
}
