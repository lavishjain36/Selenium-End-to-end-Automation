package selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class RelativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://work/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
		// nameEditBox is a relative locator
		System.out.println(driver.findElement(withTagName("label").above(nameEditBox)).getText());

		WebElement dateOfBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(withTagName("input").below(dateOfBirth)).sendKeys("24/11/2020");

		WebElement iceCreamLabel = driver
				.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(withTagName("input").toLeftOf(iceCreamLabel)).click();

		WebElement radioButton = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(withTagName("label").toRightOf(radioButton)).getText());
	}

}
