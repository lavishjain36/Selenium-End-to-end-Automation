import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JdbcConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String host = "localhost";
		String port = "3306";

	Connection con=	DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadbt", "root", "root");

	//create a statement or road
	 Statement s=con.createStatement();
	 ResultSet rs= s.executeQuery("select * from Employeeinfo where name='lavish'");
	
	 while(rs.next()) {
			System.setProperty("webdriver.chrome.driver", "C://work/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=in");
//	System.out.println(rs.getString("id"));
//	System.out.println(rs.getString("location"));
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(rs.getString("id"));
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(rs.getString("location"));
	driver.findElement(By.id("Login")).click();

	
	 }

	 
	}

}
