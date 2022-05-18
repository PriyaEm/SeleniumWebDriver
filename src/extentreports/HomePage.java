package extentreports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HomePage {
	ExtentTest test;
	WebDriver driver = null;

	public HomePage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public void clickSignUpLink() {
		WebElement signUpLink = driver.findElement(By.xpath("//div[(text()='Sign Up or Log In')]"));
		signUpLink.click();
		test.log(LogStatus.INFO, "Clicked on SignUp link");
	}

	public void enterEmail(String email) {
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys(email);
		test.log(LogStatus.INFO, "Entered email");
	}

	public void enterPassword(String password) {
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys(password);
		test.log(LogStatus.INFO, "Entered password");
	}

	public void clickLoginButton() {
		WebElement loginButton = driver.findElement(By.xpath("//input[contains(@value, 'Login')]"));
		loginButton.click();
		test.log(LogStatus.INFO, "clicked Login button");
	}
	
	public void login(String email, String password) {
		clickSignUpLink();
		enterEmail(email);
		enterPassword(password);
		clickLoginButton();		
	}
}
