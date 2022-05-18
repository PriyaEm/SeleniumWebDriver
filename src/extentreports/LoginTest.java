package extentreports;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTest {
	WebDriver driver;
	String baseUrl;
	ExtentReports report;
	ExtentTest test;
	HomePage hp;

	@BeforeClass
	public void beforeClass() {
		baseUrl = "http://www.letskodeit.com";
		report = ExtentFactory.getInstance();
		test = report.startTest("verify login");
		driver = new FirefoxDriver();
		hp = new HomePage(driver, test);
		test.log(LogStatus.INFO, "Browser started");

		// maximize the browser's window
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseUrl);
		test.log(LogStatus.INFO, "Web application opened");
	}

	@Test
	public void loginTest() throws InterruptedException {
		hp.login("test@email.com", "abcabc");

		Thread.sleep(3000);
		test.log(LogStatus.PASS, "Login Susccessful ");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
		report.endTest(test);
		report.flush();
	}

}
