package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.ForgotPassword;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.Base;

public class HomePage extends Base{
	public WebDriver driver;

	public static Logger log=LogManager.getLogger(Base.class.getName());


	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializerDriver();
	
	}
	
	//it goes to dataprovider=getdata and bring the data
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username, String password,String text) throws IOException {
		//driver=initializerDriver();
		driver.get(prop.getProperty("url"));
		//one is inheritance
		//creating Object to that class & invoke methods of it
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
	    LoginPage lp=new LoginPage(driver); //similar to driver.findElement(By.css())
		lp.getEmail().sendKeys(Username);
		lp.getpassword().sendKeys(password);
		//System.out.println(text);
		log.info(text);

		lp.getLogin().click();
		
		ForgotPassword fp=lp.forgotPassword();
		fp.getEmail().sendKeys("monujain");
		fp.sendMeInstructions().click();
		
	}
	
	@DataProvider
	public Object[][] getData() throws InterruptedException
	{
		//Row tells no of iteration
		//columns print the value
		//0th row
		//Create an Object array
		Object[][] data=new Object[2][3];
		
		//0th row
		data[0][0]="nonrestricteduser@gmail.com";
		data[0][1]="12345";
		data[0][2]="Restricted User";
	
		data[1][0]="restricteduser@gmail.com";
		data[1][1]="45678";
		data[1][2]="Non Restricted User";
		
		return data;
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
	

}
