package pageclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
	WebDriver driver;
	
	@FindBy(xpath="//a[@aria-controls='wizard-flight-pwa']")
	WebElement flightsTab;
	
	@FindBy(xpath ="//button[@aria-label='Leaving from']")
	WebElement leavingFromField;
	
	@FindBy(id="location-field-leg1-origin")
	WebElement whereAreYouLeavingFromField;
	
	@FindBy(xpath ="//button[@aria-label='Going to']")
	WebElement goingToField;
	
	@FindBy(id ="location-field-leg1-destination")
	WebElement whereAreYouGoingToField;
	
	@FindBy(id ="d1-btn")
	WebElement departingField;
	
	@FindBy(xpath = "//div[@data-stid=\"date-picker-month\"]")
	WebElement datePicker;
	
	@FindBy(xpath = "//button[@data-stid='apply-date-picker']")
	WebElement DoneButton;

	@FindBy(id ="d2-btn")
	WebElement returningField;
		
	@FindBy(xpath = "//button[@data-testid='submit-button']")
	WebElement searchButton;

	public SearchPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void NavigateToFlightsTab(WebDriver driver){
		flightsTab.click();		
	}
	
	public void ClickFlightsTab(){
		flightsTab.click();		
	}
	
	public void ClickLeavingFromField() {
		leavingFromField.click();
	}
	
	public void SetWhereAreYouLeavingFromField(String Origin) {
		whereAreYouLeavingFromField.sendKeys(Origin);
	}
	
	public void ClickGoingToField() {
		departingField.click();
	}
	
	public void ClickDoneButton() {
		DoneButton.click();
	}
	
	public void ClickEnterOnDeparting() {
		whereAreYouLeavingFromField.sendKeys(Keys.ENTER);
	}
	
	public void SetWhereAreYouGoingToField(String Destination) {
		whereAreYouGoingToField.sendKeys(Destination);
	}
	public void ClickEnterOnReturning() {
		whereAreYouGoingToField.sendKeys(Keys.ENTER);		
	}
	
	public void ClickDepartingField() {
		departingField.click();
	}
	
	
//	public void SetDepartingField(String StartDate) {
//		departingField.sendKeys(StartDate);
//	}
	
	

	public void ClickReturningField() {
		returningField.click();
	}	
	
	public void SetReturningField(String ReturnDate) {
		departingField.sendKeys(ReturnDate);
	}
	
	public void ClickSeacrchButton() {
		searchButton.click();
	}
}
