package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.clickdownloadappPO;
import PageObject.iosPO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ios {
	WebDriver driver=null;
	iosPO iosbutton;
  @Test
  @Given("the user is in the download Quikrapp page")
  public void the_user_is_in_the_download_Quikrapp_page() throws InterruptedException {
	  driver = new ChromeDriver();
		driver.get("https://www.quikr.com");
		Thread.sleep(2000);
		clickdownloadappPO link=new clickdownloadappPO(driver);
		link.clickdownladQuikrapp();
		Thread.sleep(2000);
  }

  @When("the user clicks on ios button")
  public void the_user_clicks_on_ios_button() {
	  iosbutton=new iosPO(driver);
		iosbutton.click();
  }

  @Then("the system displays iphone app store")
  public void the_system_displays_iphone_app_store() {
	  driver.quit();
  }
}
