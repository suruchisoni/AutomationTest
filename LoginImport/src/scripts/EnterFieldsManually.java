package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resusableClass.WebPage1;

public class EnterFieldsManually {
	
	WebPage webpage;
	FirefoxDriver driver;
	
	@BeforeTest
	public void beforeTest(){
		webpage = new  WebPage1();
		driver = webpage.openBrowser();
	}
	
	/*@AfterTest
	public void afterTest(){
		webpage.closeBrowser();
	}*/

	
	@Test
	public void enterValues() throws InterruptedException{
		
		 driver.findElement(By.id("Account")).sendKeys("Calyxaz4");
	        
	        driver.findElement(By.id("UserName")).sendKeys("ssalo");
			
	        driver.findElement(By.id("Password")).sendKeys("1234");
			
			driver.findElement(By.id("btnLogOnSubmit")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.id("btnStartNewLoan")).click();
			Thread.sleep(6000);
			
				
			driver.findElement(By.xpath("//*[@id='txtFirstName']")).click();
			driver.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("Tina");
			driver.findElement(By.xpath("//*[@id='txtLastName']")).click();
			driver.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("Sham");
			
			driver.findElement(By.xpath(".//*[@id='txtSSN']")).click();
			driver.findElement(By.xpath(".//*[@id='txtSSN']")).sendKeys(Keys.HOME +"481878483");
			
			driver.findElement(By.xpath(".//*[@id='txtDOB']")).click();
			driver.findElement(By.xpath(".//*[@id='txtDOB']")).sendKeys(Keys.HOME +"12121957"); 	
		
			
		
		
	}
	
	
}
