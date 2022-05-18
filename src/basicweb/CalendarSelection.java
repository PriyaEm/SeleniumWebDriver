package basicweb;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarSelection {
	private WebDriver driver;
	private String baseURL;
	
		

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.com/";
		//baseURL = "https://www.cleartrip.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	}
	

	@Test
	public void test() {
		driver.get(baseURL);
		//driver.findElement(By.xpath("//a[@aria-controls='wizard-flight-pwa']")).click();
	
		//WebElement departing = driver.findElement(By.id("d1-btn"));
		//departing.click();
		
		//code for Expedia
		// Find the departure date to be selected and click it
				//WebElement departureDateToSelect = driver.findElement(By.xpath("(//div[@data-stid='date-picker-month']//button[@data-day='1'])[1]"));
				//departureDateToSelect.click();
				
				// Find the return date to be selected and click it
				//WebElement returnDateToSelect = driver.findElement(By.xpath("(//div[@data-stid='date-picker-month']//button[@data-day='30'])[2]"));
				//returnDateToSelect.click();
				
				// Wait to see the click action before clicking Done button
				//Thread.sleep(3000);
				//WebElement doneButton = driver.findElement(By.xpath("//button[@data-stid='apply-date-picker']"));
				//doneButton.click();
	
	// code for clear trip date picker
		WebElement departOn = driver.findElement(By.xpath("//button[@class='fs-2 c-inherit flex flex-nowrap']"));
		departOn.click();
	}
	

						

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		//driver.quit();
	}
	
}
