package basicweb;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\eclipse-workspace\\libs\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://learn.letskodeit.com";
		driver.get(baseURL);
		driver.close();

	}

}
