package keypress;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyCombination {
	private WebDriver driver;
	private String baseUrl;

	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://courses.letskodeit.com/practice";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));		
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		// driver.findElement(By.id("opentab")).sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		// driver.findElement(By.id("opentab")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Thread.sleep(2000);
		String selectAll = Keys.chord(Keys.CONTROL, "a");
		driver.findElement(By.id("opentab")).sendKeys(selectAll);
		Thread.sleep(2000);				
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
