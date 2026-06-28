package package2;
//here, the child calass overridden the parent class.
class ParentClass
{
	void login()//here, the child calass overridden the parent class.
	{
		System.out.println("Login with mobile no:");
	}
}
public class MethodOverridding extends ParentClass
{
	void login()
	{
		System.out.println("Login with email id:");
	}

	public static void main(String[] args) 
	{

		MethodOverridding a1=new MethodOverridding();
		a1.login();
	}

}
