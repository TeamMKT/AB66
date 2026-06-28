package this_Keyword;

public class Program4 
{
  int multiply(int a , int b)
  {
	  int c = a*b;
	  return c;
  }
  public static void main(String[] args)
  {
	  Program4 p1 = new Program4();
	  int result = p1.multiply(16, 15);
	  System.out.println(result);
	  
}
}
