package stepDefinations;
import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

   
    @RunWith(Cucumber.class)
    public class stepDefination {

        @Given("^User is on NetBanking landing Page$")
        public void user_is_on_netbanking_landing_page() throws Throwable {
          	 System.out.println("User is on  netbanking page");
        }

        @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
        public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {

        	System.out.println(strArg1);
        	System.out.println(strArg2);       
        	}

        @Then("^Home Page is populated$")
        public void home_page_is_populated() throws Throwable {
        	System.out.println("Validated Home page");

        }

        @And("^Cards are displayed are 'true'$")
        public void cards_are_displayed_are_true() throws Throwable {
        	
        	System.out.println("Cards are displayed");
        }

        @And("^Cards are displayed are 'false'$")
        public void cards_are_displayed_are_false() throws Throwable {
        	System.out.println("Cards are not displayed");

        }
    }

