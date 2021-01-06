package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.Base;

public class validateTitle extends Base{
	public WebDriver driver;
	LandingPage l;
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializerDriver();
		log.info("Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Homepage");

		
	}
	
	
	//it goes to dataprovider=getdata and bring the data
   
	@Test
	public void basePageNavigation() throws IOException {
	
	
		//one is inheritance
		//creating Object to that class & invoke methods of it
		 l=new LandingPage(driver);
	
		//compare the text from browser with actual text
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		log.info("Successfully validated Text Message");

	
	}
	
	@Test
	public void validateHeader() throws IOException {
		//compare the text from browser with actual text
		Assert.assertEquals(l.getHeader().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
	
	}
	
	@Test
	public void validatesubHeader() throws IOException {
		//compare the text from browser with actual text
		Assert.assertEquals(l.getSubHeader().getText(),"Learn Hot tools like Selenium, Appium, JMeter, SoapUI,Database Testing and more..");
	
	}
	
	

	@AfterTest
	public void teardown() {
		driver.close();
	}
	


}
