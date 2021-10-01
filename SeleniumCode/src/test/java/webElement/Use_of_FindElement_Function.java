package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Use_of_FindElement_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//URL Visit
		driver.get("http://demo.guru99.com/test/radio.html");
		
		List<WebElement> checkboxes =driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		// For checking the list of webelement has been store
		System.out.println(checkboxes.size());
		
		// For each loop used for selecting multiple checkboxes
		
		for (WebElement cb : checkboxes) {
			// Click all the check boxes
			cb.click();
			
		}
		
		// For loop
/*		for (int i = 0; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
		} */
		

	}

}
