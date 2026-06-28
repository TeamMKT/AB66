package variables;

public class Practice12 
{
   final int x =10;
  void modify()
  {
	  int x=20;
	  Practice12 g1 = new Practice12();
	  System.out.println(g1.x);
  }
  public static void main(String[] args) 
  {
	  Practice12 g1 = new Practice12();
	  g1.modify();
}
}
