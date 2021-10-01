package webElement;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.glass.events.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flie_Download {

	public static void main(String[] args) throws AWTException{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://spreadsheetpage.com/calendar/yearly/#model_1");
		
		driver.findElement(By.linkText("Download this template for free")).click();
		
		// Robot class create
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_DOWN);
		// Delay 3 sec
		rb.delay(3000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.delay(3000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		// Delay 3 sec
		rb.delay(3000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		// Delay 3 sec
		rb.delay(3000);
		rb.keyPress(KeyEvent.VK_ENTER);
	}

}
