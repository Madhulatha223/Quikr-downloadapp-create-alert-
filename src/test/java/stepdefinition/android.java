package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.androidPO;
import PageObject.clickdownloadappPO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class android {
	WebDriver driver=null;
	androidPO androidbutton;
  @Test
  @Given("the user is in the download the Quikr_app page")
  public void the_user_is_in_the_download_the_Quikr_app_page() throws InterruptedException {
	  driver = new ChromeDriver();
		driver.get("https://www.quikr.com");
		Thread.sleep(2000);
		clickdownloadappPO link=new clickdownloadappPO(driver);
		link.clickdownladQuikrapp();
		Thread.sleep(2000);
  }

  @When("the user clicks on android button and enters the {string}")
  public void the_user_clicks_on_android_button_and_enters_the(String string) throws InterruptedException {
	  androidbutton=new androidPO(driver);
	  androidbutton.click1();
	  Thread.sleep(2000);
	  androidbutton.click2();
	  Thread.sleep(2000);
	  androidbutton.click3();
	  Thread.sleep(2000);
	  androidbutton.email_id(string);
	  Thread.sleep(2000);
	  androidbutton.click4();
	  Thread.sleep(2000);
  }

  @Then("the user can download the android app")
  public void the_user_can_download_the_android_app() {
      driver.quit();
  }
}
