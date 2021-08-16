package stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.clickdownloadappPO;
import PageObject.senddownloadlinkPO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class senddownloadlink {
	WebDriver driver=null;
	senddownloadlinkPO sendlink;
  @Test
  @Given("the User is in the Quikr downlad app page")
  public void the_User_is_in_the_Quikr_downlad_app_page() throws InterruptedException {
	  driver = new ChromeDriver();
		driver.get("https://www.quikr.com");
		Thread.sleep(2000);
		clickdownloadappPO link=new clickdownloadappPO(driver);
		link.clickdownladQuikrapp();
		Thread.sleep(2000);
  }
  
  @When("the user enters mobile_no and clicks on send downloadlink")
  public void the_user_enters_mobile_no_and_clicks_on_send_downloadlink() throws IOException, InterruptedException {
	  sendlink=new senddownloadlinkPO(driver);
		sendlink.mobile_number();
		Thread.sleep(2000);
		sendlink.click();
		Thread.sleep(2000);
  }

  @Then("the link will be send to the entered mobile number")
  public void the_link_will_be_send_to_the_entered_mobile_number() {
      driver.quit();
  }

}
