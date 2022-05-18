package switchto;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchWindow {
	private WebDriver driver;
	private String baseUrl;
	private JavascriptExecutor js;
		

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://courses.letskodeit.com/practice";
		js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
				
		//get the parent handle
		String parentHandle = driver.getWindowHandle();
		System.out.println("parent Handle: " + parentHandle);
		
		WebElement openTab = driver.findElement(By.id("opentab"));
		openTab.click();
		
		// get all Handles
		Set<String> handles = driver.getWindowHandles();
		
		//switching between Handles
		for (String handle : handles) {
			System.out.println(handle);
			
			if (!handle.equals(parentHandle)) {
			driver.switchTo().window(handle);
			Thread.sleep(2000);
			System.out.println(handle);
			
			WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search Course']"));
			searchBox.sendKeys("python");
			Thread.sleep(2000);
			driver.close();
			break;
			}

		}
		//switch back to the parent window
	
		driver.switchTo().window(parentHandle);
		WebElement textField = driver.findElement(By.id("name"));
		textField.sendKeys("text Successful");	
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		// driver.quit();
	}

}
