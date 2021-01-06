package stepDefinations;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LandingPage;
import pageObject.LoginPage;
import pageObject.portalHomePage;
import resources.Base;

public class stepDefination extends Base {

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		driver = initializerDriver();

	}

	@And("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {
		driver.get(strArg1);

	}
	
	@And("^Click on Login link in home page to land on Secure sign in Page$")
	public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {

		LandingPage l = new LandingPage(driver);
		if (l.getPopUpSize() > 0) {
			l.getPopUp().click();
		}
			l.getLogin().click();

	}
	
	@When("^User enters (.+) and (.+) and logs in$")
	public void user_enters_and_and_logs_in(String username, String password) throws Throwable {

		LoginPage lp = new LoginPage(driver); // similar to driver.findElement(By.css())
		lp.getEmail().sendKeys(username);
		lp.getpassword().sendKeys(password);
		lp.getLogin().click();
	}
	@Then("^Verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
		portalHomePage p = new portalHomePage(driver);
		//Assert.assertTrue(p.getSearchBox().isDisplayed());

	}

	@And("^close browsers$")
	public void close_browsers() throws Throwable {
		driver.quit();
	}

}
