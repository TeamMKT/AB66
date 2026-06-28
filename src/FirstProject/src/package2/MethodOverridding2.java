package package2;
//Make your method as final; any method in java which is final cannot be overridden.
class ParentClass2
{
	final void login()//here, this method as final we cannot overriiden.
	{
		System.out.println("Login with mobile no:");
	}
}
public class MethodOverridding2 extends ParentClass2
{
	void loginwithEmailid()  //login to  loginwithEmailid
	{
		System.out.println("Login with email id:");
	}

	public static void main(String[] args) 
	{
      
    	MethodOverridding2 a1=new MethodOverridding2();
  		a1.login();
        a1.loginwithEmailid();
	}
}

/*Here, the method is final means we can't over ridden. In this program the parent class method is final over ridden 
so we can break the rules of method overridden,  other wise it shows an error in child class.
we can change the methodname of child class instead of login we taken as loginwith emailid*/