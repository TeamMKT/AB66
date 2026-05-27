package moduel2.programs;
class ParentClass
{
	void login()
	{
		System.out.println("Login with mobile no");
	}
}
public class MethodOveride extends ParentClass
{
	void login()
	{
		super.login();//super keyword

		System.out.println("Login with Email id no");


	}
	public static void main(String[] args) 
	{
	
		MethodOveride m1=new MethodOveride();
		m1.login();
	
		}
}	
