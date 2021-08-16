package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.clickdownloadappPO;
import PageObject.invalidoutlookidPO;
import PageObject.windowsPO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class invalidoutlookid {
	WebDriver driver=null;
	invalidoutlookidPO windowsbutton;
  @Test
  @Given("the user is in the download the quikrapp page")
  public void the_user_is_in_the_download_the_quikrapp_page() throws InterruptedException {
	  driver = new ChromeDriver();
		driver.get("https://www.quikr.com");
		Thread.sleep(2000);
		clickdownloadappPO link=new clickdownloadappPO(driver);
		link.clickdownladQuikrapp();
		Thread.sleep(2000);
  }

  @When("the user clicks on windows button and enters {string} and invalid {string}")
  public void the_user_clicks_on_windows_button_and_enters_and_invalid(String string, String string2) throws InterruptedException {
	  windowsbutton=new invalidoutlookidPO(driver);
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
	  String experr="Your account or password is incorrect. If you don't remember your password, reset it now.";
	  WebElement err=driver.findElement(By.xpath("//*[@id=\"passwordError\"]"));
	  String acterr=err.getText();
	  assertEquals(acterr,experr);
	  System.out.println("Your account or password is incorrect");
	  }

  @Then("an error message should be displayed")
  public void an_error_message_should_be_displayed() {
      driver.quit();
  }

}
