package basicweb;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoCompleteHotWirePractice {
	private WebDriver driver;
	String baseURL;
		
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.hotwire.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseURL);
		
			
	}

	@Test
	public void test() throws Exception {
		WebElement destinationField = driver.findElement(By.xpath("//input[@data-bdd='farefinder-hotel-destination-input']"));
		destinationField.sendKeys("del");	
		
		List<WebElement> ulElement = driver.findElements(By.id(baseURL));
		System.out.println(ulElement);
		
	}
	@After
	public void tearDown() throws Exception {
		//driver.quit();
				
	}

	

}
