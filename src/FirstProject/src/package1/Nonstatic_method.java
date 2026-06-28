package package1;
//How can you access the non static method of class present in different package?

public class Nonstatic_method 
{
	public static void mul(int a, int b)
	{
		int c=a*b;
		System.out.println(c);
	}
    public void add(int a, int b) // here, in same pachkage we no need to write publoic void, but in different package we can add public. follow the definiton of public.
  {
	  int c=a+b;
	  System.out.println(c);
  }
}
