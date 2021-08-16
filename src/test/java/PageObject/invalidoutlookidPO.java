package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class invalidoutlookidPO {
	WebDriver driver;
	By windows_button = By.cssSelector("body > div.slideout-panel > div.screens > div > a.windows-app");
	By get_button = By.cssSelector("#buttonPanel_AppIdentityBuyButton");
	By outlookid = By.xpath("//*[@id=\"i0116\"]");
	By next_button = By.xpath("//*[@id=\"idSIButton9\"]");
	By password = By.xpath("//*[@id=\"i0118\"]");
	By next_button1 = By.cssSelector("#idSIButton9");
	public invalidoutlookidPO(WebDriver driver){
		this.driver=driver;
	}
	public void click1() {
		driver.findElement(windows_button).click();
	}
	public void click2() {
		driver.findElement(get_button).click();
	}
	public void outlook_id(String string) {
		driver.findElement(outlookid).sendKeys(string);
	}
	public void click3() {
		driver.findElement(next_button).click();
	}
	public void password(String string2) {
		driver.findElement(password).sendKeys(string2);
	}
	public void click4() {
		driver.findElement(next_button1).click();
	}
	

}
