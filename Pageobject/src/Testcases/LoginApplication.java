package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.ReddifHomePage;
//import objectrepository.ReddifLoginPage;
import objectrepository.ReddifLoginPagePF;

public class LoginApplication {

	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C://work/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		ReddifLoginPagePF rd = new ReddifLoginPagePF(driver);
		rd.EmailId().sendKeys("hello");
		rd.Password().sendKeys("12345");
		//rd.submit().click();
		rd.Home().click();
		
		ReddifHomePage rh=new ReddifHomePage(driver);
		rh.Search().sendKeys("rediff");
		rh.Submit().submit();
		
	}

}
