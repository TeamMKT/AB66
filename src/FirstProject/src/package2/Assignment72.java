package package2;
//Write a program for single-level inheritance using a Non-static method in the single package explorer.
class Ass73
{
	void add()
	{
		int a=20;
		int b=45;
		int c=a+b;
		System.out.println(c);
	}
}
public class Assignment72 extends Ass73
{
   void sub()
   {
	   int a =45;
	   int b=75;
	   int c=b-a;
	   System.out.println(c);
   }
	public static void main(String[] args) 
	{
		Assignment72 a1=new Assignment72();
		a1.add();
		a1.sub();

	}

}
