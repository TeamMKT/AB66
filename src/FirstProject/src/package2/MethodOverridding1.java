package package2;
//here, the child calass overridden the parent class.
class ParentClass1
{
	void login()//here, the child calass overridden the parent class.
	{
		System.out.println("Login with mobile no:");
	}
}
public class MethodOverridding1 extends ParentClass1
{
	void login()
	{
		System.out.println("Login with email id:");
	}

	public static void main(String[] args) 
	{
      //if()  //Login with email id//
      //{
    	MethodOverridding1 a1=new MethodOverridding1();
  		a1.login();
     /* }
      else//Login with mobile no
      {
    	  ParentClass1 p1=new ParentClass1() 
    			  p1.ParentClass1();
      }*/
	}
}

