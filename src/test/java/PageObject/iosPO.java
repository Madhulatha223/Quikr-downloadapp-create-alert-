package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class iosPO {
	WebDriver driver;
	By ios_click = By.cssSelector("body > div.slideout-panel > div.screens > div > a.ios-app");
	public iosPO(WebDriver driver){
		this.driver=driver;
	}
	public void click() {
		driver.findElement(ios_click).click();
	}
}
