package this_Keyword;

public class Program3
{
  boolean check()
  {
	  int age = 20;
  
	  if(age >= 18)
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
  }
  public static void main(String[] args) 
  {
	  Program3 a1 = new Program3();
	  boolean status = a1.check();
	  System.out.println(status);
}
}
