//to take screenshot partially of a web element
package selenium4;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotPartial {

	public static void main(String[] args) throws IOException {
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
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
	 File file=	name.getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(file, new File("logo.png"));
	//	driver.quit();
	 
	 //Get the height & width 
System.out.println(name.getRect().getDimension().getHeight());
System.out.println(name.getRect().getDimension().getWidth());


	}

}
