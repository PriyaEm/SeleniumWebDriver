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

public class AutoCompleteDemo {
	private WebDriver driver;
	private String baseURL;
	
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.goibibo.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
	}

	@After
	public void tearDown() throws Exception {
		driver.get(baseURL);
		String partialText = "Del";
		String textToSelect = "Del, India(DEL)";
		WebElement textField = driver.findElement(By.id("gosuggest_inputSrc"));
		textField.sendKeys(textToSelect);
		
		WebElement ulElement = driver.findElement(By.id("react-autosuggest-1"));
		
		String innerHTML = ulElement.getAttribute("innerHTML");
		System.out.println(innerHTML);
		
		List<WebElement> LiElements = ulElement.findElements(By.tagName("li"));
		Thread.sleep(3000);
		
		for (WebElement element:LiElements)
			//System.out.println(element.getText());
			if (element.getText().contains(textToSelect)) {
				System.out.println("Selected: " + element);
				element.click();
				break;
						
				
			}
			
				
		
	}

	@Test
	public void test() {
		driver.quit();
	}

}
