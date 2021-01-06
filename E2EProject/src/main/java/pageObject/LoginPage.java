package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	

	public WebDriver driver;
	By email= By.id("user_email");
	By password=By.cssSelector("[id='user_password']");
	By Login=By.cssSelector("[value='Log In']");
	By forgotPassword=By.xpath("//a[text()='Forgot Password?']");

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public ForgotPassword forgotPassword()
	{
		driver.findElement(forgotPassword).click();
		ForgotPassword fp=new ForgotPassword(driver);
		return fp;
		// return new ForgotPassword(driver);

	}
	
	
	
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	

	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(Login);
	}

}
