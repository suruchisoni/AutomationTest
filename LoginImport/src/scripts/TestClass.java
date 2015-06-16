package scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import org.testng.annotations.Test;

import resusableClass.Web;

public class TestClass extends Web{
	
	Web web;
	
	public TestClass(WebDriver driver){
		super(driver);
	}
	
@BeforeTest
	public void beforeTest() throws InterruptedException{
	//web = new Web(driver);
	Web.openBrowser();
	Thread.sleep(5000);
		
	}
	
@Test
	public void loginTest() throws InterruptedException {
        
		driver.findElement(By.id("Account")).sendKeys("Calyxaz4");

		driver.findElement(By.id("UserName")).sendKeys("ssalo");

		driver.findElement(By.id("Password")).sendKeys("1234");

		driver.findElement(By.id("btnLogOnSubmit")).click();
		Thread.sleep(5000);
	}

}
