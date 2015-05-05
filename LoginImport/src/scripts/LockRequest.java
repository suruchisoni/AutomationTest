package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resusableClass.Import;
import resusableClass.WebPage;

public class LockRequest{
	WebPage webpageobj;
	Import importobj;
	FirefoxDriver driver;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException{
		webpageobj = new WebPage();
		importobj = new Import();
		driver = webpageobj.openBrowser();
		importobj.setDriver(driver);
		importobj.loginTest();
		importobj.importData();
	}
		
	/*@AfterTest
	public void afterTest(){
		webpageobj.closeBrowser();		
	}*/
		
	@Test
	public void lockRequest() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='secMenu5']/a/span")).click();
		
		Thread.sleep(5000);
 
		Select lockPeriod = new Select(driver.findElement(By.id("LockPeriodCD")));
		lockPeriod.selectByVisibleText("30");
		
		
		
		
		
		
	}
	
	
	
	
}