package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://html.com/input-type-file/");
		
		
		//html tag-- type = file should be present for Browse/AttachFile/ChooseFile/UploadFile Buttons
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\priya\\Desktop\\Test.txt");
		driver.close();
		
		
	}

}
