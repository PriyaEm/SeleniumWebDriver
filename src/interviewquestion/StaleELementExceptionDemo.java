package interviewquestion;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaleELementExceptionDemo {
	private WebDriver driver;
	private String baseUrl;
		
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://www.southwest.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));		
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		String searchingText = "New York (LaGuardia), NY - LGA";
		String partialText = "New York";
		
		WebElement departFied = driver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode"));
		// departFied.sendKeys(partialText);
		departFied.sendKeys(searchingText);
		driver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.TAB);
	
		
		
//		WebElement element = driver.findElement(By.xpath("//div[@class='input input_left input_secondary list-box--input']']"));
//		List<WebElement> results = element.findElements(By.tagName("li"));
//		int size = results.size();
//
//		System.out.println("The size of the list is: " + size);
//		
//		for (int i = 0; i < size; i++) {
//			System.out.println(results.get(i).getText());
//		}
//
//		Thread.sleep(3000);
//		for (WebElement result : results) {
//			if (result.getText().equals(searchingText)) {
//				System.out.println("Selected: " + result.getText());
//				result.click();
//				break;
//			}
//		}
//
	}

	@After
	public void tearDown() throws Exception {
	}
}
