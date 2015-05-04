package scripts;

import resusableClass.Import;
import resusableClass.WebPage;

public class LockRequest {
    //creating reference of 2 classes
	private Import importObject;
	private WebPage webPage;

	public void beforeTest() {
		//creating new objects
		importObject = new Import();
		webPage = new WebPage();
		
		webPage.openBrowser();
		
		
		//importObject.setDriver(webPage.openBrowser());
	}
 
	public void afterTest() {
		webPage.closeBrowser();
	}

}
