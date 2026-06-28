package nestedIf;
//Check username;If correct → check password;Print login success / failure
import java.util.Scanner;
public class LoginSystem 
{
	public static void main(String[] args) 
	{
	  Scanner s1=new Scanner(System.in);
	  System.out.println("Enter username");
	  String username = s1.next();
	  System.out.println("Enter password");
	  String password = s1.next();
		if(username.equals("geeta"))
		{
			System.out.println("valid username");
			if(password.equals("geeta@123"))
			{
				System.out.println("login success");
			}
			else
			{
				System.out.println("invalid password");
			}
		}
		else
		{
			System.out.println("invalid username");
		}
		s1.close();
	}
	
}
