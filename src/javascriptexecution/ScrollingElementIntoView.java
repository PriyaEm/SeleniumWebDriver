package javascriptexecution;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollingElementIntoView {
	private WebDriver driver;
	private JavascriptExecutor js;
	
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		js =(JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	@Test
	public void testJavascriptExecution() throws Exception {
		//Navigation
		//driver.get("https://courses.letskodeit.com/practice");
		js.executeScript("window.location = 'https://courses.letskodeit.com/practice';");
		Thread.sleep(3000);
		
		//Scroll Down
		js.executeScript("window.scrollBy(0, 1900);");
		Thread.sleep(3000);		
		
		// Scroll Up
		js.executeScript("window.scrollBy(0, -1900);");
		Thread.sleep(3000);		
		
		//Scroll Element into view
		WebElement element = driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -190);");
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
