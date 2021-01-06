package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:\\Selenium4\\Automation\\src\\test\\java\\features",
		glue="stepDefinations")
public class TestRunner {

}
