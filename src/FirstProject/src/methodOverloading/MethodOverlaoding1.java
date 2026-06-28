package methodOverloading;
//Write a program with two methods named add:One takes two integers; Another takes three integers.
public class MethodOverlaoding1 {
   static void add()
   {
	   int a = 12; 
	   int b = 24;
	   int c = a+b;
	   System.out.println(c);
   }
   static void add(int a, int b, int c)
   {
	   int d = a+b+c;
	   System.out.println(d);
   }
   
	public static void main(String[] args) {
		add();
		add(25,36,78);

	}

}
