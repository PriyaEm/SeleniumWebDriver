package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
		public static WebElement element = null;
		/**
		 * Returns the Flight Leaving from textbox element
		 * @ param driver
		 * @ return
		 */
		public static WebElement LeavingFromTextBox(WebDriver driver) {
			element = driver.findElement(By.xpath("//button[@aria-label='Leaving from']"));
			return element;			
		}
		
		public static void ClickOnLeavingFromTextBox(WebDriver driver) {
			element = LeavingFromTextBox(driver);
			element.click();		
		}
		
		public static WebElement OriginField(WebDriver driver) {
			element = driver.findElement(By.id("location-field-leg1-origin]"));
			return element;
		}
		
		/**
		 * Sending values to the Leaving from field
		 * @ param driver
		 * @ return
		 */
		public static void FillOriginFieldTextBox(WebDriver driver, String LeavingFrom) {
			element = OriginField(driver);
			element.sendKeys(LeavingFrom);		
		}
		
		public static WebElement DestinationField(WebDriver driver) {
			element = driver.findElement(By.id("location-field-leg1-destination]"));
			return element;
		}
		
		public static void ClickOnEnterButton(WebDriver driver) {
			element.sendKeys(Keys.ENTER);
		}
		
		
		/**
		 * Returns the Flight Going to textbox element
		 * @ param driver
		 * @ return
		 */
		public static WebElement GoingToTextBox(WebDriver driver) {
			element = driver.findElement(By.xpath("//button[@aria-label='Going to']"));
			return element;			
		}
		
		public static void ClickOnGoingToTextBox(WebDriver driver) {
			element = GoingToTextBox(driver);
			element.click();		
		}
		
		/**
		 * Sending values to the Going To field
		 * @ param driver
		 * @ return
		 */			
		 public static void FillGoingToTextBox(WebDriver driver, String GoingTo) {
			element = GoingToTextBox(driver);
			element.sendKeys(GoingTo);		
		}
		
		/**
		 * Returns the Departure Date field element
		 * @ param driver
		 * @ return
		 */
		public static WebElement DepartingField(WebDriver driver) {
			element = driver.findElement(By.id("d1-btn"));
			return element;
		}
		
		/**
		 * Sending values to the Departing field
		 * @ param driver
		 * @ return
		 */
		public static void FillDepartingField(WebDriver driver, String DepartingDate) {
			element = DepartingField(driver);
			element.sendKeys(DepartingDate);
		}
		/* Returns to the Return Date field element
		 * @ param driver
		 * @ return
		 */
		public static WebElement ReturningField(WebDriver driver) {
			element = driver.findElement(By.id("d2-btn"));
			return element;
		}
		/**
		 * Sending values to the Returning field
		 * @ param driver
		 * @ return
		 */
		public static void FillReturningField(WebDriver driver, String ReturningDate) {
			element = DepartingField(driver);
			element.sendKeys(ReturningDate);
		}
		
		/**
		 * Returns the Search button element
		 * @ param driver
		 */
		public static void ClickOnSearchButton(WebDriver driver) {
			element = driver.findElement(By.xpath("//button[@data-testid='submit-button']"));
			element.click();
		}
		
		
		/**
		 * Navigate to flights tab
		 * @ param driver
		 */
		public static void NavigateToFlightsTab(WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@aria-controls='wizard-flight-pwa']"));
			element.click();
		}
		
		
		/**
		 * Returns the Flight Origin textbox
		 * @ param driver
		 * @ return
		 */
		
		
		/**
		 * Returns the Flight Origin textbox
		 * @ param driver
		 * @ return
		 */
		
		/**
		 * Returns the Flight Origin textbox
		 * @ param driver
		 * @ return
		 */
		
		/**
		 * Returns the Flight Origin textbox
		 * @ param driver
		 * @ return
		 */
		
	}


