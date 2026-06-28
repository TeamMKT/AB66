package variables;

public class Assignment9
{
  final static int a = 15;
  int b =25;
  static void add()
  {
	 int a =56;
	  Assignment9 g1 = new Assignment9();
	  int c = a +g1.b;
	  System.out.println(c);
  }
  public static void main(String[] args)
  {
	add();

}
}
