package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxDriverWindows {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\priya\\eclipse-workspace\\libs\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseURL = "https://github.com/";
		driver.get(baseURL);
//		driver.quit();

	}

}
