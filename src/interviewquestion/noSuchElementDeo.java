package interviewquestion;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class noSuchElementDeo {
	private WebDriver driver;
	private String baseUrl;
		
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl ="https://courses.letskodeit.com/";
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	@Test
	public void test() throws InterruptedException {
//		driver.get(baseUrl);
		
		// Timing issues
//		driver.findElement(By.xpath("//a[@href='/login']")).click();
//		driver.findElement(By.id("email")).sendKeys("testing");
		
		//explicit wait
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		// WebElement emailField = wait.until(
			//	ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
				//emailField.sendKeys("testing");
		
		// 2. Incorrect locator or type of locator
		// driver.findElement(By.xpath("//a[contains(@href,'/login')]")).click();
				
		// 3. Element is in iFrame
		driver.get("https://courses.letskodeit.com/practice");
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Search Course']")).sendKeys("Java");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();

	 
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		//driver.quit();
	}

	

}
