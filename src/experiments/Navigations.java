package experiments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigations {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));

		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.amazon.in/");

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().back();
		
		driver.navigate().refresh();

	}

}
