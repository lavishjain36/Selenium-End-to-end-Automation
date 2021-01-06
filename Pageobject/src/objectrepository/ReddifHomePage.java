package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReddifHomePage {

	// create a constructor and creta object of it in testcase package
	WebDriver driver;

	public ReddifHomePage(WebDriver driver) {
		this.driver = driver;
	}

	By search=By.id("srchword");
	By submit=By.xpath("//input[@name='srchquery_tbox']");
	
	public WebElement Search() {
		return driver.findElement(search);

	}
	public WebElement Submit() {
		return driver.findElement(submit);

	}
	
	
}
