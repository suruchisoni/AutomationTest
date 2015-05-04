package resusableClass;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Import {
	// create instance of WebPage class called webpage
	WebPage webpage;
	FirefoxDriver driver;

	@BeforeTest
	public void beforeTest() {
		// create object using new and call method openBrowser from WebPage
		webpage = new WebPage();
		setDriver(webpage.openBrowser());
	}

	@AfterTest
	public void afterTest() {
		webpage.closeBrowser();
	}

	@Test
	public void loginTest() throws InterruptedException {

		driver.findElement(By.id("Account")).sendKeys("Calyxaz4");

		driver.findElement(By.id("UserName")).sendKeys("ssalo");

		driver.findElement(By.id("Password")).sendKeys("1234");

		driver.findElement(By.id("btnLogOnSubmit")).click();
		Thread.sleep(5000);
	}

	@Test(dependsOnMethods = { "loginTest" })
	public void importData() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("btnImport")).click();
		Thread.sleep(5000);

		File file = new File("testdata\\Path full loan.brw");

		driver.findElement(By.id("fileLoan")).sendKeys(file.getAbsolutePath());
		Thread.sleep(4000);

		driver.findElement(By.id("butUpload")).click();
		Thread.sleep(9000);

		driver.findElement(By.id("butAuditOK")).click();
		Thread.sleep(3000);
	}

	public FirefoxDriver getDriver() {
		return driver;
	}

	public void setDriver(FirefoxDriver driver) {
		this.driver = driver;
	}

}
