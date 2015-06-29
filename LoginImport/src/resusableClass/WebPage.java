package resusableClass;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WebPage {

	protected FirefoxDriver driver;

	public FirefoxDriver openBrowser() {
		driver = new FirefoxDriver();
		//driver.get("https://qa1.calyxpath.com");
		driver.get("https://www.calyxpath.com/Account/LogOn?ReturnUrl=%2f");
		driver.manage().window().maximize();
		return driver;
	}

	public void closeBrowser() {
		driver.quit();
	}

}
