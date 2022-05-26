package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String baseURL = "https://courses.letskodeit.com/practice";
		driver.get(baseURL);
		
		//handle dropdown 
		Select select = new Select(driver.findElement(By.id("carselect")));
		select.selectByVisibleText("Benz");
		select.selectByVisibleText("Honda");
	}

}
