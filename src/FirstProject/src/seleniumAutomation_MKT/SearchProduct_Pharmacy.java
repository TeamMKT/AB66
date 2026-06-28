package seleniumAutomation_MKT;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//WAP to search a product and count the number product Pharmacy application
import org.openqa.selenium.chrome.ChromeDriver;
public class SearchProduct_Pharmacy
{
   public static void main(String[] args) throws InterruptedException 
   {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.apollopharmacy.in/");
	  driver.manage().window().minimize();
	  Thread.sleep(3000);
	  List <WebElement> e1 =  driver.findElements(By.className("s"));
	  
	  Thread.sleep(3000);
	  int count = e1.size();
	  System.out.println(count);
	  
}
}
