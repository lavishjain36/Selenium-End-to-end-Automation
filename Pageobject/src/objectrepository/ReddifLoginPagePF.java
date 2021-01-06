package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReddifLoginPagePF {

	// create a constructor and creta object of it in testcase package
	WebDriver driver;

	public ReddifLoginPagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// By username = By.xpath("//*[@id='login1']");
	// By password = By.name("passwd");
	// By signin = By.xpath("//*[@name='proceed']");
	// By home=By.linkText("rediff.com");
	
	//here we are using page object factory style by using annotation concept  By @FindBy 
	//it will do the same work what we did in the page object

	@FindBy(xpath = "//*[@id='login1']")
	WebElement username;

	@FindBy(name = "passwd")
	WebElement password;

	@FindBy(linkText = "rediff.com")
	WebElement home;

	public WebElement EmailId() {
		return username;

	}

	public WebElement Password() {
		return password;

	}

	public WebElement Home() {
		return home;

	}

}
