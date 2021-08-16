package PageObject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class launchPO {
  WebDriver driver;
	
	public launchPO(WebDriver driver) {
		this.driver=driver;
	}
	public void clickEntertheStore() throws Throwable {
		driver.get("https://www.quikr.com");
		Thread.sleep(2000);
	}
	public boolean verifyTitle() {
		String expOutput="The title is Free Classified Ads in India, Post Ads Online | Quikr India";
		String actOutput=driver.getTitle();
		if(expOutput.contentEquals(actOutput)) {
			return true;
		}else {
			return false;
		}
	}
}
