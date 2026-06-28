package package1;
//"Write a Program to call non parameterized Constructor Overloading"
public class Assignment27 {

	Assignment27()
	{
		int a = 16;
		int b=14;
		int c=a+b;
	System.out.println(c);
	}
	Assignment27(int p,int q)
	{
		int w=p+q;
		System.out .println(w);
	}
	Assignment27(int x ,double y, float z)
	{
		double d=x+y+z;
	System.out.println(d);
	}
	public static void main(String[] args) {
		new Assignment27();
		new Assignment27(12,15);
		new Assignment27(15,1.25,3.45f);
		
	}

}
