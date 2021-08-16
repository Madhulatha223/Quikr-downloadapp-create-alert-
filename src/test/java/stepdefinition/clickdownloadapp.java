package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObject.clickdownloadappPO;

public class clickdownloadapp {
	WebDriver driver;
  @Test
  @Given("the user is in the home page")
  public void the_user_is_in_the_home_page() throws InterruptedException {
	  driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.quikr.com");
		Thread.sleep(2000);
  }

  @When("the user clicks on the download the app link")
  public void the_user_clicks_on_the_download_the_app_link() throws InterruptedException {
	  clickdownloadappPO downloadlink=new clickdownloadappPO(driver);
		downloadlink.clickdownladQuikrapp();
		Thread.sleep(2000);
  }

  @Then("the user reaches the Download Our Mobile app page")
  public void the_user_reaches_the_Download_Our_Mobile_app_page() {
      driver.quit();
  }
}
