package tutorial_selenium;

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

import pageclasses.SearchPage;

public class PageObjectModel {
	private WebDriver driver;
	private String baseUrl;
	

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		SearchPage.NavigateToFlightsTab(driver);
		WebElement elementOrigin = driver.findElement(By.xpath("//button[@aria-label='Leaving from']"));
		elementOrigin.click();
		Thread.sleep(2000);	
		driver.findElement(By.id("location-field-leg1-origin")).sendKeys("New York (NYC - All Airports)");
		driver.findElement(By.id("location-field-leg1-origin")).sendKeys(Keys.ENTER);
		
		
		WebElement elementDestination = driver.findElement(By.xpath("//button[@aria-label='Going to']"));
		elementDestination.click();
		Thread.sleep(2000);	
		driver.findElement(By.id("location-field-leg1-destination")).sendKeys("Chicago, IL (CHI-All Airports))");
		driver.findElement(By.id("location-field-leg1-destination")).sendKeys(Keys.ENTER);
	
//		Thread.sleep(2000);	
//		SearchPage.ClickOnLeavingFromTextBox(driver);
//		Thread.sleep(2000);
//		SearchPage.OriginField(driver).sendKeys("New York");
//		SearchPage.FillOriginFieldTextBox(driver, "New York");
//		Thread.sleep(2000);
//		SearchPage.ClickOnEnterButton(driver);
		
//		SearchPage.ClickOnGoingToTextBox(driver);
//		SearchPage.FillGoingToTextBox(driver, "Chicago");
//		SearchPage.ClickOnEnterButton(driver);
		
//		SearchPage.FillDepartingField(driver, "03/15/2022");
//		SearchPage.FillReturningField(driver, "03/17/2022");
		SearchPage.ClickOnSearchButton(driver);		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);
//		driver.quit();
	}
	
}
