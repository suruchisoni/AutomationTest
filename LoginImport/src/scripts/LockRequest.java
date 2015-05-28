package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		//Thread.sleep(15000);
		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='divSubMenu']/div/li/a/span[text()='Lock']")));
		driver.findElement(By.xpath("//*[@id='divSubMenu']/div/li/a/span[text()='Lock']")).click();
		//driver.findElement(By.xpath("//*[@id='secMenu6']/a/span")).click();
		
		Thread.sleep(5000);
 
		Select lockPeriod = new Select(driver.findElement(By.id("LockPeriodCD")));
		lockPeriod.selectByVisibleText("30");
	    driver.findElement(By.id("btnSave")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("imgSelectLoanProgram")).click();
		Thread.sleep(15000);
		
		WebElement elementToClick = driver.findElement(By.xpath(".//*[@id='divLscPricingResult']/table[1]/tbody/tr/td[1]/input"));
		elementToClick.click();
		
		driver.findElement(By.id("btnPPESelect")).click();
		
		driver.findElement(By.id("btnRequestLock")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("aLogout")).click();
				
	}
	
	
	
	
}