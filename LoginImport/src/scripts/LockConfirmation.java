package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resusableClass.Import;
import resusableClass.WebPage;

public class LockConfirmation {
	
	WebPage webpageobj;
	Import importobj;
	FirefoxDriver driver;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException{
		webpageobj = new WebPage();
		driver = webpageobj.openBrowser();
		importobj.setDriver(driver);
		importobj.loginAsLockDesk();
		
	}
		
	@AfterTest
	public void afterTest(){
		webpageobj.closeBrowser();		
	}
    
	@Test
	public void lockConfirmation() throws InterruptedException{
		driver.findElement(By.xpath(".//*[@id='tblBorrower']/tbody/tr[1]/td[2]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='thirdMenu2']/a/span")).click();
		driver.findElement(By.id("btnConfirm")).click();
		
		
		
		
	}
	
	
}



