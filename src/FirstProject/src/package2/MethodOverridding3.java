package package2;
//here, the child calass overridden the parent class.
class ParentClass23
{
	void login()//here, the child calass overridden the parent class.
	{
		System.out.println("Login with mobile no:");
	}
}
public class MethodOverridding3 extends ParentClass23
{
	void loginid()
	{
		System.out.println("Login with email id:");
	}

	public static void main(String[] args) 
	{
      //if()  //Login with email id//
      //{
    	MethodOverridding3 a1=new MethodOverridding3();
  		a1.loginid();
     /* }
      else//Login with mobile no
      {
    	  ParentClass23 p1=new ParentClass23() 
    			  p1.ParentClass1();
      }*/
	}
}

