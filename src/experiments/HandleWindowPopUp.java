package experiments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindowPopUp {

	// 1. Alert pop up -- Javascript popup--- to handle we have to use... Alerts
	// API(Accept, Dismiss)
	// 2. FileUpload pop up -- browse button and attach a file...(type - file ,
	// sendkeys(path)
	// 3. Browser window pop up --- advertisement pop up...(windowhandler API -
	// getWindowHandles())

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
