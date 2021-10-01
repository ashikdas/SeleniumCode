package webElement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload_robot_class {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//URL visit
//		driver.get("http://demo.guru99.com/test/upload/");
//		
//		//Way 1
//		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\ashik\\Downloads\\image 9.png");
		
		driver.get("https://www.filemail.com/share/upload-file");
		
		// Way 2
		driver.findElement(By.id("addBtn")).click();
		
		Robot rb = new Robot();
		// 1. Ctrl a action
		StringSelection ss = new StringSelection("C:\\Users\\ashik\\Downloads\\tiger.jpg");
		// Ctrl c on the clip board
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		// 2. Ctrl v
		rb.delay(4000);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		
		// "V" button press
		
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		
		// Press the "Enter" button
		rb.keyPress(KeyEvent.VK_ENTER);

	}

}
