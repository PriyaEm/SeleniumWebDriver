package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IEDriverWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\priya\\eclipse-workspace\\libs\\drivers\\IEDriverServer.exe");
		WebDriver driver = new EdgeDriver();
		String baseURL = "https://www.google.com/";
		driver.get(baseURL);

	}

}
