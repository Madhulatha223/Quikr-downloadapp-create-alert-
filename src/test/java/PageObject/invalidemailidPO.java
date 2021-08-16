package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class invalidemailidPO {
	WebDriver driver;
	By android_button = By.cssSelector("body > div.slideout-panel > div.screens > div > a.android-app");
	By install_button = By.xpath("//*[@id=\"fcxH9b\"]/div[4]/c-wiz/div/div[2]/div/div/main/c-wiz[1]/c-wiz[1]/div/div[2]/div/div[2]/div/div[2]/div/c-wiz/c-wiz/div/span/button");
	By signin_button = By.cssSelector("#yDmH0d > div.llhEMd.bYEzqc.iWO5td > div > div.g3VIld.LhXUod.Up8vH.J9Nfi.iWO5td > div.XfpsVe.J9fJmf > div > button.LkLjZd.ScJHi.nMZKrb.mgVrBf.xjAeve");
	By emailid = By.cssSelector("#identifierId");
	By next_button = By.cssSelector("#identifierNext > div > button > span");
	public invalidemailidPO(WebDriver driver){
		this.driver=driver;
	}
	public void click1() {
		driver.findElement(android_button).click();
	}
	public void click2() {
		driver.findElement(install_button).click();
	}
	public void click3() {
		driver.findElement(signin_button).click();
	}
	public void email_id(String string1) {
		driver.findElement(emailid).sendKeys(string1);
	}
	public void click4() {
		driver.findElement(next_button).click();
	}
}
