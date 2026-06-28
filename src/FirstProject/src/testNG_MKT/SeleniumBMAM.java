package testNG_MKT;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumBMAM 
{
	  @Test
      public void testcase1()
      {
              System.out.println("Test Case 1");
      }
      @Test
      public void testcase2()
      {
              System.out.println("Test Case 2");
      }
      @BeforeMethod
      public void launchOfBrowser()
      {
              System.out.println("Launching browser");
      }
      @AfterMethod
      public void quitOfBrowser()
      {
              System.out.println("Quitting browser");
      }
}
