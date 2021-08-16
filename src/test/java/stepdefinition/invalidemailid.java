package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.androidPO;
import PageObject.clickdownloadappPO;
import PageObject.invalidemailidPO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class invalidemailid {
	 WebDriver driver=null;
		invalidemailidPO androidbutton;
  @Test
  @Given("the user is in the download the Quikr_App page")
  public void the_user_is_in_the_download_the_Quikr_App_page() throws InterruptedException {
	  driver = new ChromeDriver();
		driver.get("https://www.quikr.com");
		Thread.sleep(2000);
		clickdownloadappPO link=new clickdownloadappPO(driver);
		link.clickdownladQuikrapp();
		Thread.sleep(2000);
  }

  @When("the user clicks on android button and enters the invalid {string}")
  public void the_user_clicks_on_android_button_and_enters_the_invalid(String string1) throws InterruptedException {
	  androidbutton=new invalidemailidPO(driver);
	  androidbutton.click1();
	  Thread.sleep(2000);
	  androidbutton.click2();
	  Thread.sleep(2000);
	  androidbutton.click3();
	  Thread.sleep(2000);
	  androidbutton.email_id(string1);
	  Thread.sleep(2000);
	  androidbutton.click4();
	  Thread.sleep(2000);
	  String experror="Couldn't find your Google Account";
	  WebElement error=driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div"));
	  String acterror=error.getText();
	  assertEquals(acterror,experror);
	  System.out.println("Please enter a valid Email-id");
  }

  @Then("it should display an erro message")
  public void it_should_display_an_erro_message() {
      driver.quit();
  }
}
