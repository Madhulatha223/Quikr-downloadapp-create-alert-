package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class clickdownloadappPO {
  WebDriver driver;
	public clickdownloadappPO(WebDriver driver){
		this.driver=driver;
	}
	public void clickdownladQuikrapp() {
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"app-link\"]")).click();
	}
}
