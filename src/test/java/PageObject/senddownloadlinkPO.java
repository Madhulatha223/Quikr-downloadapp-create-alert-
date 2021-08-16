package PageObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class senddownloadlinkPO {
	WebDriver driver;
	By mobile_no=By.cssSelector("#topAppForm > div:nth-child(1) > input.sms_app_mobile");
	By click_button=By.xpath("//*[@id=\"topAppForm\"]/div[2]/button");
	
	public senddownloadlinkPO(WebDriver driver) {
		this.driver=driver;
	}
	public void mobile_number() throws IOException {
		String datafile = "E:\\New folder/mobilenumber.csv";
		BufferedReader br = null;
		String line =" ";
		String cvsSplitBy = ",";
		br = new BufferedReader(new FileReader(datafile));
		while((line = br.readLine())!=null) {
			String[] data = line.split(cvsSplitBy);
		driver.findElement(mobile_no).sendKeys(data[0]);
		}
	}
	public void click() {
		driver.findElement(click_button).click();
	}
}
