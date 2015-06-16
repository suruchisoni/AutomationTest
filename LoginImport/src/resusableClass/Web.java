package resusableClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Web {
public static WebDriver driver;
	
     public Web(WebDriver driver){
		this.driver = driver;
	}
@Test
	public static void openBrowser() {

		driver = new FirefoxDriver();
		driver.get("https://qa1.calyxpath.com");
		driver.manage().window().maximize();
		//return driver;

	}

	public void closeBrowser() {
		driver.quit();
	}

}
