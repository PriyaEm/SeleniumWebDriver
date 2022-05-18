package tutorial_selenium;

import java.time.Duration;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileUploadWindows {
	private WebDriver driver;
	private String baseUrl;
	
	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
//		baseUrl = "https://www.google.com/";
		baseUrl ="https://mail.google.com/mail/u/0/#inbox";
		//Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseUrl);		
	}
	
	@Test
	public void fileUpload() throws AWTException, InterruptedException {
		//Click Sign in 
//		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		//Enter email id
//		driver.findElement(By.id("identifierId")).sendKeys("bnitin2k");
		Thread.sleep(2000);
		//Click Next
//		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		//Enter Password
//		driver.findElement(By.name("password")).sendKeys("n!ty@20!0");
		//Click Next
//		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		//Click Notnow
//		driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
		//Click Compose
		driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
		//Enter Recipient email
		driver.findElement(By.id(":qp")).sendKeys("bnitin2k@gmail.com");
		//Enter Subject
		driver.findElement(By.id(":q7")).sendKeys("Test File Upload");
		//Click AttachFiles
		driver.findElement(By.id(":rq")).click();
		
		StringSelection ss = new StringSelection("C:\\Users\\priya\\Desktop\\TextFile.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//Ctrl + v
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.id(":px")).click();		
	}
	
	@AfterClass
	public void afterClass() {
		
	}

}
