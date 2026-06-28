package package1;
//"Write a program using nested if Check username ; If correct, then check password; Print login success or failure"
public class Assignment68 {

	public static void main(String[] args) 
	{
		String Username="Geeta";
		String Password="Geeta@12";
		
		if(Username.equals("Geeta"))
		{
			if(Password.equals("Geeta@12"))
			{
				System.out.println("Login success");
			}
			else
			{
				System.out.println("Invalid password");
			}
		}
		else
		{
			System.out.println("Invalid username");
		}
	}

}
