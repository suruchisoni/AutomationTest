package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resusableClass.WebPage;

public class EnterFieldsManually {
	
	WebPage webpage;
	FirefoxDriver driver;
	
	@BeforeTest
	public void beforeTest(){
		webpage = new  WebPage();
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
			Thread.sleep(5000);
			
			driver.findElement(By.id("txtFirstName")).sendKeys("Tina");
			driver.findElement(By.id("txtLastName")).sendKeys("Sham");
			Thread.sleep(2000);
			
			driver.findElement(By.id("txtSSN")).sendKeys("1234567898");
			Thread.sleep(3000);	
			
			
		
		
	}
	
	
}
