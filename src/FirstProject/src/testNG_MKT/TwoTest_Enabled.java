package testNG_MKT;

import org.testng.annotations.Test;

public class TwoTest_Enabled 
{
  @Test(enabled=false)
  public void login()
  {
	  
  }
  @Test(enabled=true)
  public void logout()
  {
	  
  }
  @Test
  public void registaration()
  {
	  
  }
}
//enabled false means disables we can't excecute. so here, two test case will execute.