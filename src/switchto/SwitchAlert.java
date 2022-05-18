package switchto;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchAlert {
	private WebDriver driver;
	private JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		js = (JavascriptExecutor)driver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		js.executeScript("window.location ='https://courses.letskodeit.com/practice';");
	}

	@Test
	public void test1() throws InterruptedException {
		Thread.sleep(1000);
		// js.executeScript("window.location ='https://courses.letskodeit.com/practice';");
		driver.findElement(By.id("name")).sendKeys("sp");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();		
	}
	@Test	
	public void test2() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("sp");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// alert.dismiss()		
	}
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
