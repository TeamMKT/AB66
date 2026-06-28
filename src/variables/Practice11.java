package variables;
//Write A Program with same variable present locally and globally and try to access them both in main method.
public class Practice11 
{
   int a = 10;
  public static void main(String[] args)
  {
	  int a = 45;
	  System.out.println(a);
	Practice11 g1 = new Practice11();
	System.out.println(g1.a);  
}

}

