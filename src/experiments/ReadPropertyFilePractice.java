package experiments;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.HtmlUnitDriver;

public class ReadPropertyFilePractice {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"C:/Users/priya/Documents/PriyaEm/SeleniumWebDriver/src/experiments/practice.properties");
		prop.load(ip);

		String url = prop.getProperty("url");
		String browserName = prop.getProperty("browser");

		if (browserName.equals("FF")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("Chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new InternetExplorerDriver();
		}
		
		driver.get(url);
		driver.findElement(By.id(prop.getProperty("email_id"))).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id(prop.getProperty("password_id"))).sendKeys(prop.getProperty("password"));
		
		

	}

}
