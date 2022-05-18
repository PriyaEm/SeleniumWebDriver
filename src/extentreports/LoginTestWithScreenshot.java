package extentreports;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
//import com.relevantcodes.extentreports.model.ITest;

import utilities.Screenshots;

public class LoginTestWithScreenshot {
	WebDriver driver;
	String baseUrl;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeClass
	public void beforeClass() {
		baseUrl = "http://www.letskodeit.com";
		report = new ExtentReports("C:\\Users\\priya\\Desktop\\logintest.html");
		test = report.startTest("verify login");
		driver = new FirefoxDriver();
		test.log(LogStatus.INFO, "browser started");
		 
		//maximize the browser's window
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "browser maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseUrl);	
		test.log(LogStatus.INFO, "Web application opened");
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		WebElement signUpLink = driver.findElement(By.xpath("//div[(text()='Sign Up or Log In')]"));
		signUpLink.click();
		test.log(LogStatus.INFO, "Clicked on SignUp link");
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("test@email.com");
		test.log(LogStatus.INFO, "Entered email");
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("abcabc");
		test.log(LogStatus.INFO, "Entered password");
		WebElement 	loginButton = driver.findElement(By.xpath("//input[contains(@value, 'Login1')]"));
		//intentionally given wrong Login1 instead of LOgin to fail the test 
		loginButton.click();
		test.log(LogStatus.INFO, "clicked Login button");
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "Login Susccessful ");
		}

	@AfterMethod
	public void tearDown(ITestResult testResult) throws IOException {
		if(testResult.getStatus() == ITestResult.FAILURE) {
			String path = Screenshots.takeScreenshots(driver, testResult.getName());
			String imagepath = test.addScreenCapture(path);
			test.log(LogStatus.FAIL, "Verify Login failed", imagepath);
		}		
		driver.quit();
		report.endTest(test);
		report.flush();
	}
}



