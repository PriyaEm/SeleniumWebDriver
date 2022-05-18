package tutorial_selenium;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageclasses.SearchPageFactory;

public class FrameworkTestCaseForExpedia {
	private WebDriver driver;
	private String baseUrl;
	SearchPageFactory searchPage;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";
		
		searchPage = new SearchPageFactory(driver);
		
		// Maximize the browser's Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get(baseUrl);
	}

	@Test
	public void test() {
		searchPage.ClickFlightsTab();
		searchPage.ClickLeavingFromField();
		searchPage.SetWhereAreYouLeavingFromField("New York");
		searchPage.ClickEnterOnDeparting();
		searchPage.ClickGoingToField();
		searchPage.SetWhereAreYouGoingToField("Chicago");
		searchPage.ClickEnterOnReturning();
		searchPage.ClickDepartingField();
		
		
		
		
//		searchPage.ClickSeacrchButton();
				
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
