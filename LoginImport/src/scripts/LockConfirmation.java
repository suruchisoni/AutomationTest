package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resusableClass.Import;
import resusableClass.WebPage;

public class LockConfirmation extends WebPage{
	
	private WebPage web;
	private Import lockDesk;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException{
		web = new WebPage();
		driver = web.openBrowser();
		Thread.sleep(5000);
		
		lockDesk = new Import(driver);
		lockDesk.loginAsLockDesk();	
		
		Thread.sleep(10000);
		
	}
		
	@AfterTest
	public void afterTest(){
		web.closeBrowser();		
	}
    
	@Test
	public void lockConfirmation() throws InterruptedException{
		driver.findElement(By.xpath(".//*[@id='tblBorrower']/tbody/tr[1]/td[2]/div")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='thirdMenu2']/a/span")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("btnConfirm")).click();
		Thread.sleep(5000);
		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By
						.xpath(".//*[@id='thirdMenu1']/a/span")));
		
		String lockStatus = driver.findElement(By.xpath(".//*[@id='divLockSummaryDetail']/div[2]/div[1]/dl/dd[1]")).getText();
		String lockSubStatus = driver.findElement(By.xpath(".//*[@id='divLockSummaryDetail']/div[2]/div[1]/dl/dd[2]")).getText();
		
		Assert.assertEquals(lockStatus, "Locked");
		System.out.println("Lock status is correct :" +lockStatus);
		
		Assert.assertEquals(lockSubStatus, "Confirmed");
		System.out.println("Lock Substatus is correct :" +lockSubStatus);
		
		driver.findElement(By.id("aLogout")).click();
		
	}
	
	
}



