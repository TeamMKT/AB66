package this_Keyword;

public class Program11 
{
  int factorial(int num)
  {
	  int fact = 1;
	  for(int i = 1; i<=num;i++ )
	  {
		  fact = fact * i;
	  }
	  return fact;
  }
  
  public static void main(String[] args) 
  {
	  Program11 p1 = new Program11();
	  int result = p1.factorial(5);
	  System.out.println(result);
}
}
