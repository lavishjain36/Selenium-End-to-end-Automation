package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class portalHomePage {
	

	public WebDriver driver;
	
	By searchBox=By.cssSelector("[id='search-courses']");
	
	
	//we are bringing the scope of driver from testcase to page object
	
	public portalHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public WebElement getSearchBox()
	{
		return driver.findElement(searchBox);
	}

}
