package selenium4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://work/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//from here , we can open a new tab or a new window with switch method
		driver.switchTo().newWindow(WindowType.WINDOW);

		//Switching b/w parent-child with driver scope can be done using this step
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		driver.get("https://rahulshettyacademy.com/#/index");
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']"))
				.get(1).getText();
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(courseName);
		driver.quit();
	}

}
