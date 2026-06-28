package variables;

public class Practice8 
{
  static int a =10;
  static int b =25;
  int c =45;
  int d =62;
  static void add()
  {
	 int x= a+b;
	 System.out.println(x);
	 Practice8 s1 = new Practice8 ();
	 int p = s1.c*s1.d;//by object and refereace varaible
	 System.out.println(p);
  }
  void sub()
  {
	  int q = a*b;
	  int y = d-c;
	  System.out.println(q);//directly by its name
	  System.out.println(y);//directly by its name
  }
  public static void main(String[] args)
  {
	add();
	Practice8 s1 = new Practice8 ();
	s1.sub();
}
}
