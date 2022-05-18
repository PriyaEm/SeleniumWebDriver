package javascriptexecution;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowSize {
	private WebDriver driver;
	private String baseUrl;
	private JavascriptExecutor js;
	
	
	@Before
	public void setUp() throws Exception {
	driver = new FirefoxDriver();
	baseUrl = "https://courses.letskodeit.com/practice";
	js = (JavascriptExecutor)driver;
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	@Test
	public void test() throws InterruptedException {
		 // driver.get(baseUrl);
		js.executeScript("window.location ='https://courses.letskodeit.com/practice';");
		Thread.sleep(3000);
		
		//Size of Window
		long height = (long) js.executeScript("return window.innerHeight;");
		long width = (long) js.executeScript("return window.innerWidth;");
		
		System.out.println("Height is : " + height);
		System.out.println("Width is : " + width);
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
