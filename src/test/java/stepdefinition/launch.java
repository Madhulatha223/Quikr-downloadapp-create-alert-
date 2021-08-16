package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.launchPO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class launch {
	WebDriver driver;
  @Test
  @Given("the Chrome is opened")
  public void the_Chrome_is_opened() {
	  driver = new ChromeDriver();
  }

  @When("the user enters website url and clicks on enter button")
  public void the_user_enters_website_url_and_clicks_on_enter_button() throws Throwable {
	  launchPO home=new launchPO(driver);
	    boolean res=home.verifyTitle();
	    System.out.println("Test result is : "+res);
	    home.clickEntertheStore();
  }

  @Then("the user reaches the Quikr home page")
  public void the_user_reaches_the_Quikr_home_page() {
      driver.quit();
  }

}
