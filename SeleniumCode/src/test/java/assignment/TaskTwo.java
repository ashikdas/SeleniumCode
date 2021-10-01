package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskTwo {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//visit url
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		
		//click Make Appointment
		driver.findElement(By.linkText("Make Appointment")).click();
		Thread.sleep(3000);
		
		//fill up username & password
		driver.findElement(By.name("username")).sendKeys("John Doe");
		driver.findElement(By.name("password")).sendKeys("ThisIsNotAPassword");
		
		//click login
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
