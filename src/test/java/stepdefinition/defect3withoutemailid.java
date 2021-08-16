package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class defect3withoutemailid {
	WebDriver driver=null;
	WebElement alert;
  @Test
  @Given("the User is in the quikrhome page")
  public void the_User_is_in_the_quikrhome_page() throws InterruptedException {
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  driver = new ChromeDriver(options);
	  driver.manage().window().maximize();
		driver.get("https://www.quikr.com");
		Thread.sleep(2000);
  }

  @When("the user enters all the data except Email-id and clicks on button")
  public void the_user_enters_all_the_data_except_Email_id_and_clicks_on_button() throws InterruptedException {
	  JavascriptExecutor Js1 = (JavascriptExecutor) driver;
	  Js1.executeScript("window.scrollBy(0,3400)"); 
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"select_category\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"select_category_dropdown\"]/li[10]/a")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"select_subcategory\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"select_subcategory_dropdown\"]/li[2]/a")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"Ad_Type\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"Ad_Type_dropdown\"]/li[1]/a")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"Brand_name\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"checkbox_Acer\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"Model\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"checkbox_001S 256MB\"]/label")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"No_of_Sims\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"checkbox_Dual\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"city_text\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"select_city_dropdown\"]/li[7]/a")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"select_locality\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"checkbox_A.N Colony\"]/label")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"Mobile_Number\"]")).sendKeys("8106564234");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"createAlert\"]")).click();
	Thread.sleep(1000);

  }

  @Then("an alert should be created")
  public void an_alert_should_be_created() {
	  String experr="Thanks for creating alert, we will reach out to you with matching ads";
	  WebElement err=driver.findElement(By.xpath("//*[@id=\"alert_success\"]/h3"));
	  String acterr=err.getText();
	  assertEquals(acterr,experr);
	  System.out.println("Thanks for creating alert, we will reach out to you with matching ads");
	  driver.quit();
  }

}
