package experiments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://courses.letskodeit.com/practice");

		WebElement element = driver.findElement(By.id("openwindow"));
		element.click();

		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();

		String parentHandleId = it.next();
		System.out.println("Parent Handle Id:" + parentHandleId);

		String childHandleId = it.next();
		System.out.println("Child Handle Id:" + childHandleId);

		driver.switchTo().window(childHandleId);
		System.out.println("Child Handle title:" + driver.getTitle());
		
		Thread.sleep(2000);

//		WebElement searchBox = driver.findElement(By.id("//input[@placeholder='Search Course"));
//		searchBox.sendKeys("Java");

		driver.close();

		driver.switchTo().window(parentHandleId);
		System.out.println("Parent Handle title:" + driver.getTitle());
	}

}
