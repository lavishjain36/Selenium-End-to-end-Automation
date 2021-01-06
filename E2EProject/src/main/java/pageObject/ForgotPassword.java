package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
	

	public WebDriver driver;
	By email= By.id("user_email");
	By sendMeInstructions=By.cssSelector("[type='submit']");

	public ForgotPassword(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement sendMeInstructions()
	{
		return driver.findElement(sendMeInstructions);
	}
	
	
}
