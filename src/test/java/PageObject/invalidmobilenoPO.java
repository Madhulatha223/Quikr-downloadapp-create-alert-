package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class invalidmobilenoPO {
	WebDriver driver;
	By mobileno=By.cssSelector("#topAppForm > div:nth-child(1) > input.sms_app_mobile");
	By click_button=By.xpath("//*[@id=\"topAppForm\"]/div[2]/button");
	
	public invalidmobilenoPO(WebDriver driver) {
		this.driver=driver;
	}
	public void mobilenumber(String string) {
		driver.findElement(mobileno).sendKeys(string);
	}
	public void click() {
		driver.findElement(click_button).click();
	}
}
