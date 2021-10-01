package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskThree {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		// Creating Object
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Visit url
		driver.get("http://demo.guru99.com/selenium/upload/");
		Thread.sleep(3000);
		
		// Create robot class obect
		Robot rb = new Robot();
		
		// Enter choose file button
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		// Ctrl a action
		StringSelection ss = new StringSelection("C:\\Users\\ashik\\Downloads\\tiger.jpg");
		
		// ctrl c action
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		// Press Ctrl 
		rb.delay(4000);
				
		rb.keyPress(KeyEvent.VK_CONTROL);
				
		// Press "V" 
				
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
				
		// Press the "Enter" button
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(2000);
		
		// Click Submit button
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(2000);
		
		// Quit browser
		driver.quit();
		
//		rb.keyPress(KeyEvent.VK_TAB);
//		rb.keyPress(KeyEvent.VK_TAB);
//		rb.keyPress(KeyEvent.VK_TAB);
//		rb.keyPress(KeyEvent.VK_TAB);
//		
//		rb.keyPress(KeyEvent.VK_ENTER);	

		
		


	}

}
