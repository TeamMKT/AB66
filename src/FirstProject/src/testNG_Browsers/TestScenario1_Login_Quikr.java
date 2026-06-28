package testNG_Browsers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listeners_Logic_quikr.class)
public class TestScenario1_Login_Quikr extends BaseTest_Quikr2_listener
{
  @Test
  public void quikrsignin() throws InterruptedException
  {
	  WebElement register = driver.findElement(By.xpath("//label[text()='Login/Register']"));
		 register.click();
		Thread.sleep(3000);
		  
		 WebElement mobile = driver.findElement(By.xpath("//label[text()='Enter Mobile Number / Email']/preceding-sibling::input"));
		 mobile.sendKeys("8500448418");
		 Thread.sleep(3000);
		 
		 WebElement cntu = driver.findElement(By.xpath("//button[text()='Continue']"));
		 cntu.click();
		 Thread.sleep(5000);
  }
}
