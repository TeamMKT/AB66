package testNG_MKT;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class All_Annotations_TestNG 
{
     @BeforeSuite
     public void bs()
     {
    	 System.out.println("beforesuite");
     }
     @BeforeTest
     public void bt()
     {
    	 System.out.println("beforetest"); 
     }
     @BeforeClass
     public void bc()
     {
    	 System.out.println("beforeclass"); 
     }
     @BeforeMethod
     public void bm()
     {
    	 System.out.println("beforeMethod"); 
     }
     @Test
     public void logincresentials()
     {
    	 System.out.println("Testcase"); 
     }
     @AfterSuite
     public void as()
     {
    	 System.out.println("aftersuite");
     }
     @AfterTest
     public void at()
     {
    	 System.out.println("aftertest"); 
     }
     @AfterClass
     public void ac()
     {
    	 System.out.println("afterclass"); 
     }
     @AfterMethod
     public void am()
     {
    	 System.out.println("afterMethod"); 
     }
}
