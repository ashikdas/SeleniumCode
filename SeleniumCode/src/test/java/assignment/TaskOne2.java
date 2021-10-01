package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskOne2 {
	
	public static void main (String[]arg) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.nexchar.com/");
		Thread.sleep(5000);
		
		driver.navigate().refresh(); 
		
		
	}

}
