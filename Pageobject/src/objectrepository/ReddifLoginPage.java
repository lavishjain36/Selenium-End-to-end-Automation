//package objectrepository;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class ReddifLoginPage {
//
//	// create a constructor and creta object of it in testcase package
//	WebDriver driver;
//
//	public ReddifLoginPage(WebDriver driver) {
//		this.driver = driver;
//	}
//
//	By username = By.xpath("//*[@id='login1']");
//	By password = By.name("passwd");
//	By signin = By.xpath("//*[@name='proceed']");
//	By home=By.linkText("rediff.com");
//	public WebElement EmailId() {
//		return driver.findElement(username);
//
//	}
//
//	public WebElement Password() {
//		return driver.findElement(password);
//
//	}
//
//	public WebElement submit() {
//		return driver.findElement(signin);
//
//	}
//
//	public WebElement Home() {
//		return driver.findElement(home);
//
//	}
//
//}
