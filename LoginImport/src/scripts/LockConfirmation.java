package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resusableClass.Import;
import resusableClass.WebPage;

public class LockConfirmation {
	
	WebPage webpageobj;
	Import importobj;
	FirefoxDriver driver;
	
	@Test
	public void beforeTest() throws InterruptedException{
		webpageobj = new WebPage();
		driver = webpageobj.openBrowser();
		importobj = new Import();
        importobj.setDriver(driver);
		importobj.loginAsLockDesk();
		Thread.sleep(10000);
		
	}
		
	@AfterTest
	public void afterTest(){
		webpageobj.closeBrowser();		
	}
    
	@Test
	public void lockConfirmation() throws InterruptedException{
		driver.findElement(By.xpath(".//*[@id='tblBorrower']/tbody/tr[1]/td[2]/div")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='thirdMenu2']/a/span")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("btnConfirm")).click();
		
		String lockStatus = driver.findElement(By.xpath(".//*[@id='divLockSummaryDetail']/div[2]/div[1]/dl/dd[1]")).getText();
		String lockSubStatus = driver.findElement(By.xpath(".//*[@id='divLockSummaryDetail']/div[2]/div[1]/dl/dd[2]")).getText();
		
		Assert.assertEquals(lockStatus, "Locked");
		System.out.println("Lock status is correct :" +lockStatus);
		
		Assert.assertEquals(lockSubStatus, "Confirmed");
		System.out.println("Lock Substatus is correct :" +lockSubStatus);
		
		driver.findElement(By.id("aLogout")).click();
		
	}
	
	
}



