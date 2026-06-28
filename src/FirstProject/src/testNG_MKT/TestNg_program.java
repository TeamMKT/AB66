package testNG_MKT;

import org.testng.annotations.Test;

public class TestNg_program 
{
  @Test
  public void subtract()
  {
	  int a =200;
	  int b= 500;
	  int c =b-a;
	  System.out.println(c);
  }
  @Test
  public void multiply()
  {
	  int a =200;
	  int b= 500;
	  int c =a*b;
	  System.out.println(c);
  }
  @Test
  public void add()
  {
	  int a =200;
	  int b= 500;
	  int c =a+b;
	  System.out.println(c);
  }
}
