package testNG_Browsers;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Skip_testCases 
{
  @Test
  public void login()
  {
	  Assert.assertEquals(false, true);
  }
  @Test(dependsOnMethods="login")
  public void logout()
  {
	  
  }
}
