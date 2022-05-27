package experiments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	WebDriver driver;

	public static void main(String[] args) {

		WebDriver driver = new HtmlUnitDriver();

		driver.get("https://courses.letskodeit.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().deleteAllCookies();
		
		System.out.println("Before login, title is:" + driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("test@email.com");
		driver.findElement(By.id("password")).sendKeys("abcabc");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println("After login, title is:" + driver.getTitle());
	}

}
