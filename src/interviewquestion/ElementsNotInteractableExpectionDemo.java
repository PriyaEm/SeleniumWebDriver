package interviewquestion;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementsNotInteractableExpectionDemo {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://courses.letskodeit.com/login";

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	@Test
	public void test1() throws InterruptedException {
		driver.get(baseUrl);
		driver.findElement(By.xpath("//form[@action='/login']")).click();
//		driver.findElement(By.xpath("//form[@action='/login']")).sendKeys("abc");
//		driver.findElement(By.xpath("//h4[@class='dynamic-heading']")).sendKeys("abc");
			
		
		
		driver.get("https://courses.letskodeit.com/courses"); // //
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Test");
		 		}

	@After
	public void tearDown() throws Exception {
	}

}
