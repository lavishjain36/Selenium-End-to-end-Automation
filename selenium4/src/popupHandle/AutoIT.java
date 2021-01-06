package popupHandle;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;







public class AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String downloadPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C://work/chromedriver.exe");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadPath);

		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.findElement(By.xpath("//span[text()='Select PDF files']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("E:\\Selenium\\popup\\fileupload.exe");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[id*='process']")));

		driver.findElement(By.cssSelector("span[id*='process']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[id*='pickfiles']']")));
		driver.findElement(By.cssSelector("a[id*='pickfiles']']")).click();
		Thread.sleep(5000);

		File f = new File(downloadPath + "/Profile_page-0001.jpg");
		if (f.exists()) {
//			System.out.println("File Found");
			
		Assert.assertTrue(f.exists());
		if(f.delete())
			System.out.println("File Deleted");
		
		
		}

	}

}
