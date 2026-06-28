package package1;
//Write A Program with same variable present locally and globally and try to access them both in main method.
public class Assignment39 
{
      int a =125;
	public static void main(String[] args) 
	{
		int a=78;
		System.out.println(a);
		Assignment39 a1=new Assignment39();//create an object because non static global varaible. so we can call with object.
		System.out.println(a1.a);		

	}

}
