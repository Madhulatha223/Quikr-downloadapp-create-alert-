package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.clickdownloadappPO;
import PageObject.invalidmobilenoPO;
import PageObject.senddownloadlinkPO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class invalidmobileno {
	WebDriver driver=null;
	invalidmobilenoPO sendlink;
  @Test
  @Given("the User is in the quikr downlad app page")
  public void the_User_is_in_the_quikr_downlad_app_page() throws InterruptedException {
	  driver = new ChromeDriver();
		driver.get("https://www.quikr.com");
		Thread.sleep(2000);
		clickdownloadappPO link=new clickdownloadappPO(driver);
		link.clickdownladQuikrapp();
		Thread.sleep(2000);
  }

  @When("the user enters invalid {string} and clicks on send downloadlink")
  public void the_user_enters_invalid_and_clicks_on_send_downloadlink(String string) throws InterruptedException {
	  int windowCount=driver.getWindowHandles().size();
	  sendlink=new invalidmobilenoPO(driver);
		sendlink.mobilenumber(string);
		Thread.sleep(2000);
		sendlink.click();
		Thread.sleep(2000);
		assertEquals(windowCount,driver.getWindowHandles().size());
		Alert alert = driver.switchTo().alert(); // switch to alert
		String alertMessage= driver.switchTo().alert().getText(); // capture alert message
		String expmsg="Please enter a valid phone number";
		assertEquals(alertMessage,expmsg);
		System.out.println(alertMessage); // Print Alert Message
  }

  @Then("user should get an error message")
  public void user_should_get_an_error_message() {
      driver.quit();
  }
}
