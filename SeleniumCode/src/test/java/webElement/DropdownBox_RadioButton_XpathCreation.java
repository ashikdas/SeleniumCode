package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownBox_RadioButton_XpathCreation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
				
		//URL
		driver.get("https://www.nexchar.com/signup");
		
		// -- Dropdownbox Testing --
		//select method creation
		
		//Select class object create named as "dropdownbox"
		Select dropdownbox = new Select(driver.findElement(By.id("CategoryId")));
		
		Thread.sleep(3000);
		//way 1
		dropdownbox.selectByVisibleText("Groceries & Food Retail");
		
		Thread.sleep(3000);
		//way 2
		dropdownbox.selectByValue("10");
		
		Thread.sleep(3000);
		//way 3
		dropdownbox.selectByIndex(4);
				
	}

}
