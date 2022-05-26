package experiments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsConcept {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));

		// all the links are represented by <a>html tag
		// 1. Find the total links on the page --- interview question

		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		//size of linklist
		System.out.println(linkList.size());
		
		//all the input fields are represented by input
		//2. Find the total inputs fields on the page
		
		
		List<WebElement> inputList = driver.findElements(By.tagName("input"));
		System.out.println(inputList.size());
		
		//all the buttons are represented by button
		//3. Find the total buttons on the page
		
		List<WebElement> buttonList = driver.findElements(By.tagName("button"));
		System.out.println(buttonList.size());
		
		//2. Get the text of each links on the page
		//*********using for each loop
//		for(WebElement e:linkList) {
//			System.out.println(e.getText());
//		}
		
		System.out.println("*********************************");
		//***********using for loop
		for(int i=0; i<linkList.size(); i++) {
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
			
		}

		
		
		
		driver.quit();
	}

}
