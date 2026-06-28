package selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_iframe 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/geeta/Downloads/iframehtmlpagefromGROTECHMINDS.html");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement studentname = driver.findElement(By.xpath("//input[@id='studentName']"));
		studentname.sendKeys("rudra");
		
		WebElement mobileno = driver.findElement(By.xpath("//input[@id='studentMobile']"));
		mobileno.sendKeys("123456789");
		
		WebElement gender = driver.findElement(By.xpath("//input[@id='genderMale']"));
		gender.click();
		
		WebElement gender1 = driver.findElement(By.xpath("//input[@id='genderFemale']"));
		gender1.click();
		
		Thread.sleep(3000);
		WebElement course = driver.findElement(By.xpath("//select[@id='course']"));
		 Select cse = new Select(course);
		 cse.selectByVisibleText("Automation Testing");
		 
		 WebElement Tecs = driver.findElement(By.xpath("//input[@id='acceptTerms']"));
		 Tecs.click();
		 
		 Thread.sleep(3000);
		 WebElement reg = driver.findElement(By.xpath("//button[@id='studentSubmitBtn']"));
		 reg.click();
		 
		 Thread.sleep(3000);
		//input[@id='teacherName']
		 
		 WebElement teachername = driver.findElement(By.xpath("//input[@id='teacherName']"));
		 teachername.sendKeys("geeta");
		
		  WebElement experience= driver.findElement(By.xpath("//input[@id='teacherExperience']"));
		  experience.sendKeys("15");
		  
		  WebElement remarks= driver.findElement(By.xpath("//textarea[@id='teacherRemarks']"));
		  remarks.sendKeys("Good automation teacher expalining classes well");
		  
		  Thread.sleep(3000);
			WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeLevel1']"));

		  driver.switchTo().frame(iframe);
			
		  WebElement feedback = driver.findElement(By.xpath("//input[@id='feedbackText']"));
		  feedback.sendKeys("Goodteacher");
		
		  WebElement rating = driver.findElement(By.xpath("//input[@name='rating']"));
		  rating.click();
		  
		   Thread.sleep(3000);
		   
		   WebElement submitfeedback = driver.findElement(By.xpath("//button[@id='feedbackSubmitBtn']"));
		   submitfeedback .click();
			  
		 

		  

		  

		  
		  
		  
		
		 
		
		
		
		
		
		
		
		
	}
	
	
}
