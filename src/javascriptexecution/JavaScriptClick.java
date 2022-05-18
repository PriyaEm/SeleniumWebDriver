package javascriptexecution;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptClick {
	private WebDriver driver;
	private JavascriptExecutor js;
	
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));		
	}

	@Test
	public void testJavascriptClick() throws Exception{
		js.executeScript("window.location = 'https://courses.letskodeit.com/practice';");
		WebElement checkBoxElement = driver.findElement(By.id("hondacheck"));
		js.executeScript("arguments[0].click();", checkBoxElement);	
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
