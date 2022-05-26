package experiments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAlertPopUp {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));

		driver.findElement(By.name("proceed")).click();

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		String text = alert.getText();

		if (text.equals("Please enter a valid user name")) {
			System.out.println("Corecct alert message");
		} else {
			System.out.println("In-correct alert message");
		}
		alert.accept(); // to click ok button
//		alert.dismiss(); // to click cancel button
		driver.close();
	}

}
