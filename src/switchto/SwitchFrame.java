package switchto;

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

public class SwitchFrame {
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
	public void test() throws InterruptedException {
		driver.get("https://courses.letskodeit.com/practice");
		// switch to frame by numbers
		 driver.switchTo().frame(0);
		
		// switch to frame by id
		// driver.switchTo().frame("search");
		
		// switch to frame by name
		// driver.switchTo().frame("course");
		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search Course']"));
		searchBox.sendKeys("python");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("test successfull");
		Thread.sleep(2000);
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
