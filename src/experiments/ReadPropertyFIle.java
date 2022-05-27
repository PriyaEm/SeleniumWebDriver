package experiments;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropertyFIle {

	static WebDriver driver;

	/*
	 * Config.properties file - data is stored in the form of key and value pair -
	 * is used to define the data.. used for env variable also. - using # we can
	 * comment the property in config file
	 * 
	 */

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties(); // properties class already available in java -- we creating an object

		FileInputStream ip = new FileInputStream(
				"C:/Users/priya/Documents/PriyaEm/SeleniumWebDriver/src/experiments/config.properties");
		// fileinputstream class is already available in java - create an object
		prop.load(ip); // load is the method - provides an input stream to connect our java class and
						// property file.

		// how to read this properties

		System.out.println(prop.getProperty("name")); // returns NUll - name is commented in config file
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.get("Name")); // Name is not availanle in config file... n is Caps.. returns NUll

		String url = prop.getProperty("URL");
		System.out.println(url);

		String browserName = (prop.getProperty("browser"));

		if (browserName.equals("Firefox")) {
//			System.setProperty - already mentioned in the environment variables - path
			driver = new FirefoxDriver();

		} else if (browserName.equals("Chrome")) {
			driver = new ChromeDriver();
		}

		driver.get(url);
		driver.quit();

	}

}
