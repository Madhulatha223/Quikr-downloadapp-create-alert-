package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.androidPO;
import PageObject.clickdownloadappPO;
import PageObject.windowsPO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class windows {
	WebDriver driver=null;
	windowsPO windowsbutton;
  @Test
  @Given("the user is in the download the QuikrApp page")
  public void the_user_is_in_the_download_the_QuikrApp_page() throws InterruptedException {
	  driver = new ChromeDriver();
		driver.get("https://www.quikr.com");
		Thread.sleep(2000);
		clickdownloadappPO link=new clickdownloadappPO(driver);
		link.clickdownladQuikrapp();
		Thread.sleep(2000);
  }

  @When("the user clicks on windows button and enters {string} and {string}")
  public void the_user_clicks_on_windows_button_and_enters_and(String string, String string2) throws InterruptedException {
	  windowsbutton=new windowsPO(driver);
	  windowsbutton.click1();
	  Thread.sleep(2000);
	  windowsbutton.click2();
	  Thread.sleep(2000);
	  windowsbutton.outlook_id(string);
	  Thread.sleep(2000);
	  windowsbutton.click3();
	  Thread.sleep(2000);
	  windowsbutton.password(string2);
	  Thread.sleep(2000);
	  windowsbutton.click4();
	  Thread.sleep(2000);
	  windowsbutton.click5();
	  Thread.sleep(2000);
	  windowsbutton.click6();
	  Thread.sleep(2000);}

  @Then("the user can download the windows app")
  public void the_user_can_download_the_windows_app() {
      driver.quit();
  }
}
