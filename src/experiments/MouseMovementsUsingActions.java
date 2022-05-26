package experiments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementsUsingActions {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://www.easemytrip.com/flights.html");
		
		//Actions Class : used for mouse movements	
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("More"))).build().perform();
		
		
		

	}

}
