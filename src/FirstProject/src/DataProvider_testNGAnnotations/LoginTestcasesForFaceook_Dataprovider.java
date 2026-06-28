package DataProvider_testNGAnnotations;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class LoginTestcasesForFaceook_Dataprovider 
{
@DataProvider()
public Object testforloginvalues()
{
	Object [][] d1 = new Object [5][2];
	//ist row
	d1[0][0]="geeta.meduri@gmail.com";  //valid UN as email
	d1[0][1]="Grps@2007";               //valid pwd 
	
	//2nd row
	d1[1][0]="8500448418";  //valid UN as mobile
	d1[1][1]="Grps@2007";   //valid pwd 
	
	//3rd row
	d1[2][0]="8500448418";  //valid UN as mobile
	d1[2][1]="abcd@123";   //invalid pwd 
	
	//4th row
	d1[3][0]="geeta@gmail.com";  //invalid UN as email
	d1[3][1]="abcd@123";   //invalid pwd 
	 
	//5th row
	d1[4][0]="";  //invalid UN as email
	d1[4][1]="";   //invalid pwd 	
	return d1;
}
  @Test(dataProvider="testforloginvalues")
  public void testcases(String UN, String PWD) throws InterruptedException
  {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  WebElement w1 = driver.findElement(By.name("email"));
	  w1.sendKeys(UN);
	  WebElement w2 = driver.findElement(By.name("pass"));
	  w2.sendKeys(PWD + Keys.ENTER);
	       
  }
  
}
