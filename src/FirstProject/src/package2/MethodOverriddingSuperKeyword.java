package package2;

	class ParentClass_
	{
		void login()
		{
			System.out.println("Login with mobile no:");
		}
	}
	public class MethodOverriddingSuperKeyword  extends ParentClass_
	{
		void login()
		{
			super.login();//super keyword
			System.out.println("Login with email id:");
			
		}

		public static void main(String[] args) 
		{

			MethodOverriddingSuperKeyword a1=new MethodOverriddingSuperKeyword();
			a1.login();
			 
		}

	}
