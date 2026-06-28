package package1;

public class Local_GlobalVariable
{
  static int a=10;
  int a2=100;
  static int a3;
  static int s=90;
	public static void main(String[] args)
	{
		s=900;
		int a1=20;
		a=19;
		a1=20;
		System.out.println(a);
		Local_GlobalVariable n1=new Local_GlobalVariable();
		System.out.println(n1.a2);
		

	}

}
